package com.map;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	private int questionID;
	private String questionContent;
	@OneToMany
	private List<Answer> answer;

	public Question() {
		super();
	}

	public Question(int questionID, String questionContent, List<Answer> answer) {
		super();
		this.questionID = questionID;
		this.questionContent = questionContent;
		this.answer = answer;
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(ArrayList<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionID=" + questionID + ", questionContent=" + questionContent + ", answer=" + answer
				+ "]";
	}

}
