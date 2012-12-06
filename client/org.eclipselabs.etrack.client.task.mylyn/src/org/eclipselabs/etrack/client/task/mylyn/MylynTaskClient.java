/*******************************************************************************
 * Copyright (c) 2012 NVIDIA CORPORATION.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    NVIDIA - initial API and implementation
 *******************************************************************************/

package org.eclipselabs.etrack.client.task.mylyn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.mylyn.tasks.core.IRepositoryQuery;
import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipselabs.emf.ext.ECollection;
import org.eclipselabs.emf.query.Expression;
import org.eclipselabs.etrack.client.entity.IEntityService;
import org.eclipselabs.etrack.client.project.IProjectService;
import org.eclipselabs.etrack.client.task.ITaskService;
import org.eclipselabs.etrack.client.task.mylyn.bundle.Activator;
import org.eclipselabs.etrack.domain.entity.Entity;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.project.Project;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.domain.task.TaskDomain;
import org.eclipselabs.etrack.domain.task.TaskType;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;

/**
 * @author bhunt
 * 
 */
public class MylynTaskClient
{
	public static final String TASK_DOMAIN = "org.eclipselabs.etrack.task.mylyn.domain";
	public static final String PROJECT = "org.eclipselabs.etrack.task.mylyn.project";
	public static final String DATE_STARTED = "org.eclipselabs.etrack.task.mylyn.dateStarted";
	public static final String RESOLUTION = "org.eclipselabs.etrack.task.mylyn.resolution";
	public static final String RESOLVED_BY = "org.eclipselabs.etrack.task.mylyn.resolvedBy";
	public static final String ESTIMATE = "org.eclipselabs.etrack.task.mylyn.estimate";
	public static final String CORRECTED_ESTIMATE = "org.eclipselabs.etrack.task.mylyn.correctedEstimate";

	private ITaskService taskService;
	private IProjectService projectService;
	private IEntityService entityService;
	private IQueryFactory queryFactory;
	private Collection<String> projectNames;

	protected MylynTaskClient()
	{}

	public MylynTaskClient(TaskRepository taskRepository) throws CoreException
	{
		init(taskRepository);
	}

	public IObservableList createAvailableProjectsObservable()
	{
		return projectService.createProjectsObservable();
	}

	public Person getCurrentUser()
	{
		return entityService.getCurrentUser();
	}

	public Person getUser(String id)
	{
		Entity entity = entityService.getEntity(id);
		return entity instanceof Person ? (Person) entity : null;
	}

	public URI addTask(Task task) throws IOException
	{
		return taskService.addTask(task);
	}

	public Project getProject(String projectName)
	{
		return projectService.getProject(projectName);
	}

	public Collection<String> getProjectNames()
	{
		return Collections.unmodifiableCollection(projectNames);
	}

	/**
	 * @param taskId
	 * @return
	 */
	public Task getTask(String taskId)
	{
		return taskService.getTask(taskId);
	}

	/**
	 * @param query
	 * @return
	 */
	public ECollection getTasks(IRepositoryQuery query)
	{
		Expression filter = queryFactory.createExpression(this, query);
		return taskService.getTasks(filter);
	}

	/**
	 * @param value
	 * @return
	 */
	public TaskType getTaskType(String domainId, String typeName)
	{
		TaskDomain taskDomain = taskService.getTaskDomain(domainId);

		for (TaskType type : taskDomain.getTaskTypes())
		{
			if (type.getName().equals(typeName))
				return type;
		}

		return null;
	}

	public final boolean hasConfiguration()
	{
		// FIXME
		return true;
	}

	/**
	 * @param monitor
	 */
	public void updateConfiguration(IProgressMonitor monitor)
	{
		Project[] projects = projectService.getProjects();
		projectNames = new ArrayList<String>(projects.length);

		for (int i = 0; i < projects.length; i++)
			projectNames.add(projects[i].getName());
	}

	protected BundleContext getBundleContext()
	{
		return Activator.getBundleContext();
	}

	protected void init(TaskRepository taskRepository) throws CoreException
	{
		try
		{
			Collection<ServiceReference<ITaskService>> taskServiceReferences = getBundleContext().getServiceReferences(ITaskService.class, "(uri=" + taskRepository.getUrl() + ")");
			taskService = getBundleContext().getService(taskServiceReferences.iterator().next());

			if (taskService == null)
				throw new CoreException(new Status(IStatus.ERROR, "com.nvidia.nitro.client.task", "Failed to locate the task service"));

			Collection<ServiceReference<IEntityService>> entityServiceReferences = getBundleContext().getServiceReferences(IEntityService.class, "(uri=" + taskRepository.getUrl() + ")");
			entityService = getBundleContext().getService(entityServiceReferences.iterator().next());

			if (entityService == null)
				throw new CoreException(new Status(IStatus.ERROR, "com.nvidia.nitro.client.task", "Failed to locate the entity service"));

			Collection<ServiceReference<IProjectService>> projectServiceReferences = getBundleContext().getServiceReferences(IProjectService.class, "(uri=" + taskRepository.getUrl() + ")");
			projectService = getBundleContext().getService(projectServiceReferences.iterator().next());

			queryFactory = getBundleContext().getService(getBundleContext().getServiceReference(IQueryFactory.class));

			if (queryFactory == null)
				throw new CoreException(new Status(IStatus.ERROR, "com.nvidia.nitro.client.task", "Failed to locate the query factory service"));
		}
		catch (InvalidSyntaxException e)
		{
			throw new CoreException(new Status(IStatus.ERROR, "com.nvidia.nitro.client.task", "Failed to get the needed services", e));
		}

		// TODO this is probably not the best way to initialize the state
		updateConfiguration(new NullProgressMonitor());
	}
}
