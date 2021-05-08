package ru.korochkin.survey_api.dao.survey_DAO;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import ru.korochkin.survey_api.entity.survey.Survey;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class SurveyDAOImpl implements SurveyDAO {

    private final EntityManager entityManager;

    @Override
    public List<Survey> getAllSurveys() {
        Query query = entityManager.createQuery("from Survey");
        List<Survey> allSurveys = query.getResultList();

        return allSurveys;
    }

    @Override
    public Survey getSurvey(int id) {

        Survey survey = entityManager.find(Survey.class, id);

        return survey;
    }

    @Override
    @Transactional
    public void saveSurvey(Survey survey) {
        Survey newSurvey = entityManager.merge(survey);
        survey.setId(newSurvey.getId());
    }

    @Override
    @Transactional
    public void deleteSurvey(int id) {
        Query query = entityManager.createQuery("delete from Survey " +
                    "where id=: surveyId");
        query.setParameter("surveyId", id);
        query.executeUpdate();
    }
}
