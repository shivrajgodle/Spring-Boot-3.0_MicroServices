package com.quiz.controller;

import com.quiz.entites.Quiz;
import com.quiz.services.QuizServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    private QuizServices quizService;


    public QuizController(QuizServices quizService) {
        this.quizService = quizService;
    }


    @PostMapping
    public Quiz Create(@RequestBody Quiz quiz){
       return quizService.add(quiz);
    }

    @GetMapping
    public List<Quiz> get(){
        return quizService.getAll();
    }

    @GetMapping("/{id}")
    public Quiz getOne(@PathVariable Long id){
        return quizService.get(id);
    }


}
