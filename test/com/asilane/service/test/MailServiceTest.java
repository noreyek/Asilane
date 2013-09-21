package com.asilane.service.test;

import static org.junit.Assert.assertTrue;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import com.asilane.core.facade.Facade;

public class MailServiceTest {
	private Facade facade;

	@Before
	public void setUp() throws Exception {
		facade = new Facade();
	}

	@Test
	public void testFrench() {
		final Locale lang = Locale.FRANCE;
		assertTrue(facade.handleSentence("envoi un mail", lang).contains("Ok"));
		assertTrue(facade.handleSentence("envoi un mail à foo@bar.com", lang).contains("foo@bar.com"));
		assertTrue(facade.handleSentence("envoi un mail à foo@bar.com en lui disant bonjour", lang).contains(
				"foo@bar.com"));
	}

	@Test
	public void testEnglish() {
		final Locale lang = Locale.ENGLISH;
		assertTrue(facade.handleSentence("send a mail", lang).contains("Ok"));
		assertTrue(facade.handleSentence("send a mail to foo@bar.com", lang).contains("foo@bar.com"));
		assertTrue(facade.handleSentence("send a mail to foo@bar.com and say hello", lang).contains("foo@bar.com"));
	}
}