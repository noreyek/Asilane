package com.darkprograms.speech.recognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that holds the response and confidence of a Google recognizer request
 * 
 * @author Luke Kuza, Duncan Jauncey
 */
public class GoogleResponse {

	/**
	 * Variable that holds the response
	 */
	private String response;
	/**
	 * Variable that holds the confidence score
	 */
	private String confidence;

	/**
	 * List that holds other possible responses for this request.
	 */
	private final List<String> otherPossibleResponses = new ArrayList<String>(20);

	/**
	 * Constructor
	 */
	public GoogleResponse() {

	}

	/**
	 * Gets the response text of what was said in the submitted Audio to Google
	 * 
	 * @return String representation of what was said
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * Set the response
	 * 
	 * @param response
	 *            The response
	 */
	protected void setResponse(final String response) {
		this.response = response;
	}

	/**
	 * Gets the confidence score for the specific request
	 * 
	 * @return The confidence score, ex .922343324323
	 */
	public String getConfidence() {
		return confidence;
	}

	/**
	 * Set the confidence score for this request
	 * 
	 * @param confidence
	 *            The confidence score
	 */
	protected void setConfidence(final String confidence) {
		this.confidence = confidence;
	}

	/**
	 * Get other possible responses for this request.
	 * 
	 * @return
	 */
	public List<String> getOtherPossibleResponses() {
		return otherPossibleResponses;
	}
}