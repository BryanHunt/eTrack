/**
 * Copyright (c) NVIDIA Corporation 2012.
 * All rights reserved.
 */

package org.eclipselabs.etrack.util.mail;

/**
 * @author bhunt
 * 
 */
public class MailException extends Exception
{
	private static final long serialVersionUID = -800088604434920379L;

	public MailException()
	{}

	public MailException(String arg0)
	{
		super(arg0);
	}

	public MailException(Throwable arg0)
	{
		super(arg0);
	}

	public MailException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}
}
