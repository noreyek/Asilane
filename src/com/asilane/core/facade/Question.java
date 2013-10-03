package com.asilane.core.facade;

import java.util.Locale;

import com.asilane.core.facade.history.HistoryTree;

/**
 * This object represent the question of the client asked to a service Asilane IA
 * 
 * @author walane
 * 
 */
public class Question {
	/**
	 * the question asked by the client
	 */
	private String question;
	/**
	 * the language of the question
	 */
	private Locale lang;
	/**
	 * represent the context of the question
	 * 
	 * @see com.asilane.core.facade.history.HistoryTree
	 */
	private HistoryTree historyTree;

	/**
	 * @param question
	 *            : the question asked by the client
	 * @param lang
	 *            : the language of the question
	 */
	public Question(final String question, final Locale lang) {
		this.question = question;
		this.lang = lang;
	}

	/**
	 * @param question
	 *            : the question asked by the client
	 * @param lang
	 *            : the language of the question
	 * @param historyTree
	 *            : represent the context of the question
	 */
	public Question(final String question, final Locale lang, final HistoryTree historyTree) {
		this.question = question;
		this.lang = lang;
		this.historyTree = historyTree;
	}

	/**
	 * @return the question asked by the client
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(final String question) {
		this.question = question;
	}

	/**
	 * @return the language of the question
	 */
	public Locale getLanguage() {
		return lang;
	}

	/**
	 * @param lang
	 *            the lang to set
	 */
	public void setLang(final Locale lang) {
		this.lang = lang;
	}

	/**
	 * @return the historyTree which represent the context of the question
	 */
	public HistoryTree getHistoryTree() {
		return historyTree;
	}

	/**
	 * @param historyTree
	 *            the historyTree to set
	 */
	public void setHistoryTree(final HistoryTree historyTree) {
		this.historyTree = historyTree;
	}

	/**
	 * Clean the question asked by the client
	 */
	public void cleanQuestion() {
		question.trim().toLowerCase();
	}
}