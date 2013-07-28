package com.asilane.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Set;

import com.asilane.core.Language;

/**
 * @author walane
 * 
 */
public class AsilaneIdentityService implements IService {

	private static final String WHO_IS_YOUR_CREATOR = "who is your creator";
	private static final String QUEL_EST_TON_CREATEUR = "qu.* est ton créateur";
	private static final String WHAT_IS_YOUR_GOAL = "what is your goal";
	private static final String QUELLE_EST_TA_MISSION = "quel.* est ta mission";
	private static final String QUEL_EST_TON_BUT = "quel.* est ton but";
	private static final String QUEL_AGE_AS_TU = "quel.* âge a.*tu";
	private static final String ASILANE = "asilane";

	final long MILISECOND_PER_DAY = 24 * 60 * 60 * 1000;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asilane.service.IService#handleService(java.lang.String, com.asilane.recognition.Language)
	 */
	@Override
	public String handleService(final String sentence, final Language lang) {
		if (lang == Language.french) {
			if (sentence.matches(ASILANE)) {
				return "Oui ?";
			}
			if (sentence.matches(QUEL_EST_TON_BUT) || sentence.matches(QUELLE_EST_TA_MISSION)) {
				return "Je suis là pour vous aider, c'est Walane qui m'a appris comment faire.";
			}
			if (sentence.matches(QUEL_EST_TON_CREATEUR)) {
				return "Walane est mon créateur, je lui dois amour, honneur et respect.";
			}
			if (sentence.matches(QUEL_AGE_AS_TU)) {
				final GregorianCalendar calendar = new GregorianCalendar();
				calendar.clear();
				calendar.set(2013, Calendar.JULY, 10, 00, 42);
				final Date bornDate = calendar.getTime();
				final Date todayDate = new Date();
				final int age = Math.round(Math.abs((todayDate.getTime() - bornDate.getTime()) / MILISECOND_PER_DAY));

				return "J'ai exactement " + age + " jours.";
			}

			return "Je suis Asilane, un assistant intelligent, j'ai été créé par Walane.";
		}

		if (sentence.matches(ASILANE)) {
			return "Yes ?";
		}
		if (sentence.matches(WHAT_IS_YOUR_GOAL)) {
			return "I am here to help you, Walane tolds me how to do.";
		}
		if (sentence.matches(WHO_IS_YOUR_CREATOR)) {
			return "Walane is my creator, I owe him love, honor and respect.";
		}

		return "I am Asilane, an intelligent assistant, i've been build by Walane.";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asilane.service.IService#getCommands(com.asilane.recognition.Language)
	 */
	@Override
	public Set<String> getCommands(final Language lang) {
		final Set<String> set = new HashSet<String>();

		if (lang == Language.french) {
			set.add("qui es-tu.*");
			set.add("qui tu es");

			set.add("comment t'appelle.*tu");
			set.add("comment tu t'appelle.*");

			set.add(QUEL_EST_TON_BUT);
			set.add(QUELLE_EST_TA_MISSION);
			set.add(ASILANE);
			set.add(QUEL_EST_TON_CREATEUR);
			set.add(QUEL_AGE_AS_TU);
		} else {
			set.add("who are you");

			set.add(WHAT_IS_YOUR_GOAL);
			set.add(ASILANE);
			set.add(WHO_IS_YOUR_CREATOR);
		}

		return set;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.asilane.service.IService#handleRecoveryService(java.lang.String, com.asilane.core.Language)
	 */
	@Override
	public String handleRecoveryService(final String sentence, final Language lang) {
		return null;
	}
}