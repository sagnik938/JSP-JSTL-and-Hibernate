package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	private int id;
	private String answerContent;

	public Answer() {
		super();
	}

	public Answer(int id, String answerContent) {
		super();
		this.id = id;
		this.answerContent = answerContent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answerContent=" + answerContent + "]";
	}

}
