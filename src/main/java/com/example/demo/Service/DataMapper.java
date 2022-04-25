package com.example.demo.Service;

import com.example.demo.Dto.QuizDto;
import com.example.demo.POJOS.Result;
import org.springframework.stereotype.Service;

@Service
public class DataMapper {

    public static QuizDto mapToDto(Result result) {
        return new QuizDto(
                result.getQuestion(),
                result.getCorrect_answer(),
                result.getIncorrect_answers());
    }
}
