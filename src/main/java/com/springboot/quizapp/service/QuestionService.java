package com.springboot.quizapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.quizapp.dao.QuestionDao;
import com.springboot.quizapp.entity.Question;

@Service
public class QuestionService {
	
	@Autowired
	QuestionDao questiondao;
	
	public List<Question> getAllQuestions() {
		return questiondao.findAll();
	}

	public List<Question> getQuestionsByCategory(String category) {
		return questiondao.findByCategory(category);
	}

	public String addQuestion(Question question) {
		questiondao.save(question);
		return "success";
	}

}
