package ru.korochkin.survey_api.dao.question_DAO;


import ru.korochkin.survey_api.entity.question.Question;

import java.util.List;

public interface QuestionDAO {

       public List<Question> getAllQuestions();

       public void saveQuestion(Question question);

       public Question getQuestion(int id);

       void deleteQuestion(int id);
}
