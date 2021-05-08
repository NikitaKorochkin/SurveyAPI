package ru.korochkin.survey_api.service.option_service;

import ru.korochkin.survey_api.entity.option.Option;

import java.util.List;

public interface OptionService {

    List<Option> getAllOptions();

    Option getOption(int id);

    void saveOption(Option option);

    void deleteOption(int id);

}
