package ru.korochkin.survey_api.dao.survey_DAO;

import ru.korochkin.survey_api.entity.survey.Survey;

import java.util.List;

public interface SurveyDAO {

    List<Survey> getAllSurveys();

    Survey getSurvey(int id);

    void saveSurvey(Survey survey);

    void deleteSurvey(int id);

}
