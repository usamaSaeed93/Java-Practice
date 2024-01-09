package com.springBoot.quizApp.services;

import com.springBoot.quizApp.dao.QuestionDAO;
import com.springBoot.quizApp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

  private final QuestionDAO questionDAO;
@Autowired
    public QuestionService(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    public List<Question> findAllQuestions(){
        return questionDAO.findAll();
    }
}
