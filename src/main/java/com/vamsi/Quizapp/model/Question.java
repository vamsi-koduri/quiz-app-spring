package com.vamsi.Quizapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


import javax.lang.model.element.NestingKind;
import java.security.PrivateKey;


@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  Integer Id;
    private  String questionTitle;
    private  String option1;
    private  String option2;
    private  String option3;
    private  String option4;
    private  String rightAnswer;
    private String diffcultylevel;
    private String category;
}
