package ru.korochkin.survey_api.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.korochkin.survey_api.entity.option.Option;

public interface Repository extends JpaRepository<Option, Integer> {
}
