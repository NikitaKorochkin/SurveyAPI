package ru.korochkin.survey_api.entity.option;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.korochkin.survey_api.entity.question.Question;

import javax.persistence.*;

@Entity
@Table(name = "options")
@Getter
@Setter
@RequiredArgsConstructor
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "idx")
    private int index;

    @Column(name = "text")
    private String text;


    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "question_id")
    @JsonBackReference
    private Question question;

}
