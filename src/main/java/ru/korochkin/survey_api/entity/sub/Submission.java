package ru.korochkin.survey_api.entity.sub;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.korochkin.survey_api.entity.survey.Survey;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "sub")
@Getter
@Setter
@RequiredArgsConstructor
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "sub_date")
    private Date submitDate;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "survey_id")
    @JsonBackReference
    private Survey survey;

}
