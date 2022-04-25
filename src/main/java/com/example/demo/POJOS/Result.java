package com.example.demo.POJOS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)

public class Result {
    private String category;
    private String type;
    private String difficulty;
    private String question;
    private String correct_answer;
    private List<String> incorrect_answers = new ArrayList<>();

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    public void setCorrect_answer(String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public void setIncorrect_answers(List<String> incorrect_answers) {
        incorrect_answers.add(correct_answer);
        this.incorrect_answers = incorrect_answers;
    }
}
