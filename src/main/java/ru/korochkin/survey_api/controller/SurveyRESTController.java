package ru.korochkin.survey_api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.korochkin.survey_api.entity.survey.Survey;
import ru.korochkin.survey_api.exception_handling.NoSuchSurveyException;
import ru.korochkin.survey_api.service.survey_service.SurveyService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class SurveyRESTController {

    private final SurveyService surveyService;


    @GetMapping("/surveys")
    public List<Survey> showAllSurveys() {
        return surveyService.getAllSurveys();
    }

    @GetMapping("/surveys/{id}")
    public Survey getSurvey(@PathVariable int id) {
        Survey survey = surveyService.getSurvey(id);

        if (survey == null) {
            throw new NoSuchSurveyException("There is no survey with ID " +
                    id + " in Database");
        }

        return survey;
    }

    @PostMapping("/surveys")
    public Survey addNewSurvey(@RequestBody Survey survey) {
        surveyService.saveSurvey(survey);

        return survey;
    }

    @PutMapping("/surveys")
    public Survey updateSurvey(@RequestBody Survey survey)  {
        surveyService.saveSurvey(survey);

        return survey;
    }

    @DeleteMapping("/surveys/{id}")
    public String deleteSurvey(@PathVariable int id)    {
        surveyService.deleteSurvey(id);

        return "Survey " + id + " was deleted";
    }


}
