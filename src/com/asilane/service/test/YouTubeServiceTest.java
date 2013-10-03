package com.asilane.service.test;

import static org.junit.Assert.assertNotNull;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

import com.asilane.core.facade.ServiceDispatcher;

public class YouTubeServiceTest {
	private ServiceDispatcher dispatcher;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFrench() {
		dispatcher = ServiceDispatcher.getInstance(Locale.FRANCE);
		assertNotNull(dispatcher.getService("montre la dernière vidéo de Norman"));
	}

	@Test
	public void testEnglish() {
		dispatcher = ServiceDispatcher.getInstance(Locale.ENGLISH);
		assertNotNull(dispatcher.getService("show me the video of a dog"));
	}
}