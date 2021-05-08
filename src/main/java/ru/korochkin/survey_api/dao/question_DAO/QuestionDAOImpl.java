package ru.korochkin.survey_api.dao.question_DAO;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.korochkin.survey_api.entity.question.Question;



import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class QuestionDAOImpl implements QuestionDAO {

    private final EntityManager entityManager;

    @Override
    public List<Question> getAllQuestions() {

        Query query = entityManager.createQuery("FROM Question");
        List<Question> questions = query.getResultList();

        return questions;
    }

    @Override
    @Transactional
    public void saveQuestion(Question question) {
        entityManager.merge(question);
    }

    @Override
    public Question getQuestion(int id) {

        Question question = entityManager.find(Question.class, id);

        return question;
    }

    @Override
    @Transactional
    public void deleteQuestion(int id) {
        Query query = entityManager.createQuery("delete from Question " +
                "where id=:questionId");
        query.setParameter("questionId", id);
        query.executeUpdate();
    }
}
