package ru.korochkin.survey_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.korochkin.survey_api.entity.option.Option;
import ru.korochkin.survey_api.service.option_service.OptionServiceImpl;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class OptionsController {

    private final OptionServiceImpl optionService;

    @GetMapping("/options")
    public List<Option> getAllOptions() {

       List<Option> opt = optionService.getAllOptions();

       return opt;
    }
}
