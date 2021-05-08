package ru.korochkin.survey_api.dao.option_DAO;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.korochkin.survey_api.entity.option.Option;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OptionDAOImpl implements OptionDAO {

    private final EntityManager entityManager;


    @Override
    public List<Option> getAllOptions() {
        Query query = entityManager.createQuery("FROM Option");
        List<Option> options = query.getResultList();

        return options;
    }
}
