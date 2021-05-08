package ru.korochkin.survey_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.korochkin.survey_api.entity.question.Question;
import ru.korochkin.survey_api.service.question_service.QuestionService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("/questions/{id}")
    public Question getQuestion(@PathVariable int id) {
        return questionService.getQuestion(id);
    }

    @PostMapping("/questions")
    public Question addNewQuestion(@RequestBody Question question) {
        questionService.saveQuestion(question);

        return question;
    }

    @PutMapping("/questions")
    public Question updateQuestion(@RequestBody Question question)  {
        questionService.saveQuestion(question);

        return question;
    }

    @DeleteMapping("/questions/{id}")
    public String deleteQuestion(@PathVariable int id)    {
        questionService.deleteQuestion(id);

        return "Question with ID " + id + " was deleted";
    }

}
