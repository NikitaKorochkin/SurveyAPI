package ru.korochkin.survey_api.entity.question;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.korochkin.survey_api.entity.answer.Answer;
import ru.korochkin.survey_api.entity.option.Option;
import ru.korochkin.survey_api.entity.survey.Survey;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
@Getter
@Setter
@RequiredArgsConstructor
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private String type;

    @Column(name = "text")
    private String content;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "survey_id")
    @JsonBackReference
    private Survey survey;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},
                mappedBy = "question")
    @JsonManagedReference
    private List<Option> options;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            mappedBy = "question")
    @JsonManagedReference
    private List<Answer> answers;

}
