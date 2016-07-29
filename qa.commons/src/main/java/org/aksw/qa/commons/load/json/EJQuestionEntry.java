package org.aksw.qa.commons.load.json;

import java.util.Objects;
import java.util.Vector;

public class EJQuestionEntry {
	private String id;
	private String answertype;
	private String confidence;

	private Vector<String> answeritemtype;
	private Vector<EJLanguage> language;
	private EJAnswers answers;

	public EJQuestionEntry() {
		this.answeritemtype = new Vector<>();
		this.language = new Vector<>();

	}

	public EJQuestionEntry addAnsweritemtype(final String name) {
		this.answeritemtype.add(name);
		return this;
	}

	@Override
	public String toString() {
		return "\n  ID :" + id + "\n  Answertype: " + answertype + "\n  Confidence: " + confidence + "\n  Answeritemtype: " + answeritemtype.toString() + "\n  Language: " + Objects.toString(language)
		        + "\n  Answers: " + Objects.toString(answers);
	}

	public String getId() {
		return id;
	}

	public String getAnswertype() {
		return answertype;
	}

	public String getConfidence() {
		return confidence;
	}

	public Vector<String> getAnsweritemtype() {
		return answeritemtype;
	}

	public Vector<EJLanguage> getLanguage() {
		return language;
	}

	public EJAnswers getAnswers() {
		return answers;
	}

	public EJQuestionEntry setName(final String id) {
		this.id = id;
		return this;
	}

	public EJQuestionEntry setId(final String id) {
		this.id = id;
		return this;
	}

	public EJQuestionEntry setAnswertype(final String answertype) {
		this.answertype = answertype;
		return this;
	}

	public EJQuestionEntry setConfidence(final String confidence) {
		this.confidence = confidence;
		return this;
	}

	public EJQuestionEntry setAnsweritemtype(final Vector<String> answeritemtype) {
		this.answeritemtype = answeritemtype;
		return this;
	}

	public EJQuestionEntry setLanguage(final Vector<EJLanguage> language) {
		this.language = language;
		return this;
	}

	public EJQuestionEntry setAnswers(final EJAnswers answers) {
		this.answers = answers;
		return this;
	}

}
