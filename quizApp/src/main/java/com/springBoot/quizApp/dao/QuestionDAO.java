package com.springBoot.quizApp.dao;

import com.springBoot.quizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer> {

}
