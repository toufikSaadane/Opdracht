package com.example.demo.Dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuizDto {
    private String question;
    private String correct_answer;
    private List<String> answers = new ArrayList<>();
}
