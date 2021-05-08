package ru.korochkin.survey_api.exception_handling;

public class NoSuchSurveyException extends RuntimeException {

    public NoSuchSurveyException(String message) {
        super(message);
    }
}
