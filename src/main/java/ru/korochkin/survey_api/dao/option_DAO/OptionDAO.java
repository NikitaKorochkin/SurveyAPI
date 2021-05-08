package ru.korochkin.survey_api.dao.option_DAO;

import ru.korochkin.survey_api.entity.option.Option;

import java.util.List;

public interface OptionDAO {

    List<Option> getAllOptions();
}
