/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.util.mail;

import java.util.Collection;

import javax.mail.internet.InternetAddress;

/**
 * @author bhunt
 * 
 */
public interface IMailService
{
	String PROP_MAIL_FROM = "mail.from";
	String PROP_MAIL_HOST = "mail.smtp.host";

	void sendMail(Collection<InternetAddress> to, String subject, String message) throws MailException;
}
