package ru.korochkin.survey_api.service.survey_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.korochkin.survey_api.dao.survey_DAO.SurveyDAO;
import ru.korochkin.survey_api.entity.survey.Survey;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SurveyServiceImpl implements SurveyService {

    private final SurveyDAO surveyDAO;

    @Override
    @Transactional
    public List<Survey> getAllSurveys() {
       return surveyDAO.getAllSurveys();
    }

    @Override
    public Survey getSurvey(int id) {
        return surveyDAO.getSurvey(id);
    }

    @Override
    public void saveSurvey(Survey survey) {
        surveyDAO.saveSurvey(survey);
    }

    @Override
    public void deleteSurvey(int id) {
        surveyDAO.deleteSurvey(id);
    }
}
