package com.asilane.service.FortyTwo;

import com.asilane.core.facade.Question;
import com.asilane.core.facade.Response;
import com.asilane.service.IService;

/**
 * @author walane
 * 
 */
public class FortyTwoService implements IService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asilane.service.Service#handleService(java.lang.String, com.asilane.recognition.Locale)
	 */
	@Override
	public Response handleService(final Question question) {
		return new Response(String.valueOf(42));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asilane.service.IService#handleRecoveryService(java.lang.String, com.asilane.core.Locale)
	 */
	@Override
	public Response handleRecoveryService(final Question question) {
		return null;
	}
}