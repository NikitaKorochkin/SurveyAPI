package ru.korochkin.survey_api.entity.survey;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.korochkin.survey_api.entity.question.Question;
import ru.korochkin.survey_api.entity.sub.Submission;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "surveys")
@Getter
@Setter
@RequiredArgsConstructor
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "start")
    private String startDate;

    @Column(name = "end")
    private String finishDate;

    @OneToMany(mappedBy = "survey", cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JsonManagedReference
    private List<Question> questions;

    @OneToMany(mappedBy = "survey", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JsonManagedReference
    @JsonIgnore
    private List<Submission> submissions;
}
