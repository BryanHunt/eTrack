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

package org.eclipselabs.etrack.server.web.task.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.eclilpselabs.etrack.util.mail.IMailService;
import org.eclilpselabs.etrack.util.mail.MailException;
import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.etrack.domain.entity.Person;
import org.eclipselabs.etrack.domain.task.Task;
import org.eclipselabs.etrack.server.web.storage.AbstractStorageResource;
import org.restlet.ext.emf.EmfRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

/**
 * @author bhunt
 * 
 */
public class TaskResource extends AbstractStorageResource
{
	private static volatile IMailService mailService;

	public static void setMailService(IMailService service)
	{
		mailService = service;
	}

	@Post("xmi+xml")
	@Override
	public Representation createXmiObject(Representation representation) throws IOException
	{
		return super.createXmiObject(representation);
	}

	@Post("json")
	@Override
	public Representation createJsonObject(Representation representation) throws IOException
	{
		return super.createJsonObject(representation);
	}

	@Get("xmi+xml")
	@Override
	public EmfRepresentation<EObject> retrieveXMI()
	{
		return super.retrieveXMI();
	}

	@Get("json")
	@Override
	public EmfRepresentation<EObject> retrieveJSON()
	{
		return super.retrieveJSON();
	}

	@Put("xmi+xml")
	@Override
	public EObject updateXmiObject(Representation representation) throws IOException
	{
		Task oldTask = (Task) getModel();
		Task newTask = (Task) super.updateXmiObject(representation);
		notifyUsers(oldTask, newTask);
		return newTask;
	}

	@Put("json")
	@Override
	public EObject updateJsonObject(Representation representation) throws IOException
	{
		Task oldTask = (Task) getModel();
		Task newTask = (Task) super.updateJsonObject(representation);
		notifyUsers(oldTask, newTask);
		return newTask;
	}

	@Delete
	@Override
	public void deleteObject() throws IOException
	{
		super.deleteObject();
	}

	private void notifyUsers(Task oldTask, Task newTask)
	{
		if (mailService == null)
			return;

		String clientUserId = getClientInfo().getUser().getIdentifier();
		List<InternetAddress> to = new ArrayList<InternetAddress>();

		// TODO Notify creator

		if (!newTask.getCreatedBy().getEmails().get(0).getAddress().equals(clientUserId))
		{
			try
			{
				to.add(new InternetAddress(newTask.getCreatedBy().getEmails().get(0).getAddress()));
			}
			catch (AddressException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Notify owner

		if (!newTask.getOwner().getEmails().get(0).getAddress().equals(clientUserId))
		{
			try
			{
				to.add(new InternetAddress(newTask.getOwner().getEmails().get(0).getAddress()));
			}
			catch (AddressException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (!oldTask.getOwner().getEmails().get(0).getAddress().equals(clientUserId) && !oldTask.getOwner().getEmails().get(0).equals(newTask.getOwner().getEmails().get(0).getAddress()))
		{
			try
			{
				to.add(new InternetAddress(oldTask.getOwner().getEmails().get(0).getAddress()));
			}
			catch (AddressException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// TODO Notify subscribers

		for (Person subscriber : newTask.getSubscribers())
		{
			try
			{
				if (!subscriber.getEmails().get(0).equals(clientUserId))
					to.add(new InternetAddress(subscriber.getEmails().get(0).getAddress()));
			}
			catch (AddressException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		StringBuilder message = new StringBuilder();

		for (int i = newTask.getHistory().size() - 1; i > oldTask.getHistory().size(); i--)
		{
			message.append(newTask.getHistory().get(i));
			message.append("\n");
		}

		try
		{
			mailService.sendMail(to, "Change in task " + newTask.eResource().getURI().lastSegment(), message.toString());
		}
		catch (MailException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
