package com.question.controller;

import com.question.entities.Question;
import com.question.services.QuestionServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    private QuestionServices questionServices;

    public QuestionController(QuestionServices questionServices){
        this.questionServices = questionServices;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionServices.create(question);
    }

    @GetMapping
    public List<Question> getQuestions(){
    return questionServices.get();
    }

    @GetMapping("/{questionId}")
    public Question getQuestions(@PathVariable Long questionId){
        return questionServices.getOne(questionId);
    }

    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionOfQuiz(@PathVariable Long quizId){
    return questionServices.getQuestionOfQuiz(quizId);
    }

}
