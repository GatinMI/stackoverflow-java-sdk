package com.google.code.stackexchange.client.exception;

import java.util.Date;

import com.google.code.stackexchange.client.constant.ErrorCodes;

/**
 * @author Sanjiv.Singh
 * 
 */
public class BadParameterException extends StackExchangeApiException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 6271751110746617988L;

	/**
	 * Instantiates a new bad parameter exception.
	 */
	public BadParameterException() {
		super();
	}

	/**
	 * Instantiates a new bad parameter exception.
	 * 
	 * @param description
	 *            the description
	 */
	public BadParameterException(String description) {
		super(description);
	}

	/**
	 * Instantiates a new bad parameter exception.
	 * 
	 * @param cause
	 *            the cause
	 */
	public BadParameterException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new bad parameter exception.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public BadParameterException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new bad parameter exception.
	 * 
	 * @param description
	 *            the description
	 * @param errorId
	 *            the error Id
	 * @param errorName
	 *            the error Name
	 * @param timestamp
	 *            the timestamp
	 */
	public BadParameterException(String description, int errorId,
			String errorName, Date timestamp) {
		super(description, errorId, errorName, timestamp);
	}

	/**
	 * Instantiates a bad parameter exception.
	 * 
	 * @param message
	 *            the message
	 * @param timestamp
	 *            the timestamp
	 */
	public BadParameterException(String message, Date timestamp) {
		super(message, ErrorCodes.BAD_PARAMETER, "bad_parameter", timestamp);
	}

}
