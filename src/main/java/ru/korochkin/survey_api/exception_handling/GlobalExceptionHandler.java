package ru.korochkin.survey_api.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<SurveyIncorrectId> handleException(NoSuchSurveyException e)   {
        SurveyIncorrectId incorrect = new SurveyIncorrectId();
        incorrect.setInfo(e.getMessage());

        return new ResponseEntity<>(incorrect, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<SurveyIncorrectId> handleException(Exception e)   {
        SurveyIncorrectId incorrect = new SurveyIncorrectId();
        incorrect.setInfo(e.getMessage());

        return new ResponseEntity<>(incorrect, HttpStatus.BAD_REQUEST);
    }
}
