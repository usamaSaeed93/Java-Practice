package com.springBoot.quizApp.controller;

import com.springBoot.quizApp.model.Question;
import com.springBoot.quizApp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Component
@RequestMapping("question")
public class QuestionController {
    private final QuestionService questionService;
    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }
    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(QuestionService questionService){
        return questionService.findAllQuestions();
    }


}
