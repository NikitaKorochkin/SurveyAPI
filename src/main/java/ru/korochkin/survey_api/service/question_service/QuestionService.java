package ru.korochkin.survey_api.service.question_service;

import ru.korochkin.survey_api.entity.question.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestions();

    Question getQuestion(int id);

    void saveQuestion(Question question);

    void deleteQuestion(int id);
}
