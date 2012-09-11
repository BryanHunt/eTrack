/**
 */
package org.eclipselabs.etrack.domain.task;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.etrack.domain.task.TaskPackage
 * @generated
 */
public class TaskFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TaskFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskFactory init()
	{
		try
		{
			TaskFactory theTaskFactory = (TaskFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipselabs.org/etrack/domain/task"); 
			if (theTaskFactory != null)
			{
				return theTaskFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskFactory()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case TaskPackage.ATTACHMENT: return createAttachment();
			case TaskPackage.ATTACHMENT_DATA: return createAttachmentData();
			case TaskPackage.ARTIFACT: return createArtifact();
			case TaskPackage.COMMENT: return createComment();
			case TaskPackage.DURATION: return createDuration();
			case TaskPackage.TASK: return createTask();
			case TaskPackage.TASK_DOMAIN: return createTaskDomain();
			case TaskPackage.TASK_TYPE: return createTaskType();
			case TaskPackage.TASK_MODEL_VERSION: return createTaskModelVersion();
			case TaskPackage.TASK_ATTRIBUTE_CHANGE: return createTaskAttributeChange();
			case TaskPackage.TASK_DOMAIN_LINK: return createTaskDomainLink();
			case TaskPackage.RELATED_TASKS_MAPPING: return (EObject)createRelatedTasksMapping();
			case TaskPackage.TASK_RELATIONSHIP: return createTaskRelationship();
			case TaskPackage.TASK_RESOLUTION: return createTaskResolution();
			case TaskPackage.TASK_GROUP: return createTaskGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case TaskPackage.DURATION_UNIT:
				return createDurationUnitFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case TaskPackage.DURATION_UNIT:
				return convertDurationUnitToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment()
	{
		Attachment attachment = new Attachment();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentData createAttachmentData()
	{
		AttachmentData attachmentData = new AttachmentData();
		return attachmentData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact()
	{
		Artifact artifact = new Artifact();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment()
	{
		Comment comment = new Comment();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration()
	{
		Duration duration = new Duration();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask()
	{
		Task task = new Task();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDomain createTaskDomain()
	{
		TaskDomain taskDomain = new TaskDomain();
		return taskDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskType createTaskType()
	{
		TaskType taskType = new TaskType();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskModelVersion createTaskModelVersion()
	{
		TaskModelVersion taskModelVersion = new TaskModelVersion();
		return taskModelVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAttributeChange createTaskAttributeChange()
	{
		TaskAttributeChange taskAttributeChange = new TaskAttributeChange();
		return taskAttributeChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDomainLink createTaskDomainLink()
	{
		TaskDomainLink taskDomainLink = new TaskDomainLink();
		return taskDomainLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<TaskRelationship, EList<Task>> createRelatedTasksMapping()
	{
		RelatedTasksMapping relatedTasksMapping = new RelatedTasksMapping();
		return relatedTasksMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRelationship createTaskRelationship()
	{
		TaskRelationship taskRelationship = new TaskRelationship();
		return taskRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskResolution createTaskResolution()
	{
		TaskResolution taskResolution = new TaskResolution();
		return taskResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskGroup createTaskGroup()
	{
		TaskGroup taskGroup = new TaskGroup();
		return taskGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationUnit createDurationUnitFromString(EDataType eDataType, String initialValue)
	{
		DurationUnit result = DurationUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationUnitToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskPackage getTaskPackage()
	{
		return (TaskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskPackage getPackage()
	{
		return TaskPackage.eINSTANCE;
	}

} //TaskFactory
