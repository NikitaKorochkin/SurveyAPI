package ru.korochkin.survey_api.service.survey_service;

import ru.korochkin.survey_api.entity.survey.Survey;

import java.util.List;

public interface SurveyService {

    List<Survey> getAllSurveys();

    Survey getSurvey(int id);

    void saveSurvey(Survey survey);

    void deleteSurvey(int id);

}
