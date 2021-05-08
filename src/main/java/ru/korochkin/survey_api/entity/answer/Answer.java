package ru.korochkin.survey_api.entity.answer;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.korochkin.survey_api.entity.question.Question;
import ru.korochkin.survey_api.entity.sub.Submission;

import javax.persistence.*;

@Entity
@Table(name = "answers")
@Getter
@Setter
@RequiredArgsConstructor
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    @JsonIgnore
    private String questionType;

    @Column(name = "question")
    @JsonIgnore
    private String questionText;

    @Column(name = "answer")
    private String answerText;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "question_id")
    @JsonBackReference
    private Question question;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "sub_id")
    @JsonBackReference
    private Submission submission;
}