/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.util.mail.services;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.eclipselabs.etrack.util.mail.IMailService;
import org.eclipselabs.etrack.util.mail.MailException;

/**
 * @author bhunt
 * 
 */
public class MailService implements IMailService
{
	private Properties mailProperties;

	public void configure(Map<String, Object> properties)
	{
		mailProperties = new Properties();
		mailProperties.put(PROP_MAIL_HOST, properties.get(PROP_MAIL_HOST));
		mailProperties.put(PROP_MAIL_FROM, properties.get(PROP_MAIL_FROM));
	}

	@Override
	public void sendMail(Collection<InternetAddress> to, String subject, String text) throws MailException
	{
		Session session = Session.getDefaultInstance(mailProperties);
		MimeMessage message = new MimeMessage(session);

		try
		{
			message.setFrom(new InternetAddress(mailProperties.getProperty(PROP_MAIL_FROM)));

			for (InternetAddress address : to)
				message.addRecipient(Message.RecipientType.TO, address);

			message.setSubject(subject);
			message.setText(text);
			Transport.send(message);
		}
		catch (Exception e)
		{
			throw new MailException(e);
		}
	}
}
