package ru.korochkin.survey_api.service.question_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.korochkin.survey_api.dao.question_DAO.QuestionDAO;
import ru.korochkin.survey_api.entity.question.Question;

import java.util.List;


@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionDAO questionDAO;

    @Override
    public List<Question> getAllQuestions() {
        return questionDAO.getAllQuestions();
    }

    @Override
    public void saveQuestion(Question question) {
        questionDAO.saveQuestion(question);
    }

    @Override
    public void deleteQuestion(int id) {
        questionDAO.deleteQuestion(id);
    }

    @Override
    public Question getQuestion(int id) {
        return questionDAO.getQuestion(id);
    }

}
