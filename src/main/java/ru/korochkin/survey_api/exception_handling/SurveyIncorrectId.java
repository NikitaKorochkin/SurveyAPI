package ru.korochkin.survey_api.exception_handling;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SurveyIncorrectId {
    private String info;
}
