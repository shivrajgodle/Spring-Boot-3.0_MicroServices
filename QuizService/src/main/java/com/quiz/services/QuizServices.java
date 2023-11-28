package com.quiz.services;

import com.quiz.entites.Quiz;

import java.util.List;

public interface QuizServices {

    Quiz add(Quiz quiz);
    List<Quiz> getAll();

    Quiz get(Long id);

}
