package ru.korochkin.survey_api.service.option_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.korochkin.survey_api.dao.Repository;
import ru.korochkin.survey_api.entity.option.Option;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OptionServiceImpl implements OptionService{

    private final Repository repository;

    @Override
    public List<Option> getAllOptions() {
        return repository.findAll();
    }

    @Override
    public Option getOption(int id) {
        Option option = null;

        Optional<Option> optional = repository.findById(id);
        if (optional.isPresent())   {
            option = optional.get();
        }

        return option;
    }

    @Override
    public void saveOption(Option option) {

    }

    @Override
    public void deleteOption(int id) {

    }


}
