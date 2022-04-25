package com.example.demo.Contoller;

import com.example.demo.Dto.QuizDto;
import com.example.demo.POJOS.Result;
import com.example.demo.Service.DataMapper;
import com.example.demo.Service.RootData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DtoController {
  public RootData rootData;

  @Autowired
  public DtoController(RootData rootData) {
    this.rootData = rootData;
  }

  private List<QuizDto> getQuizDto() {
    List<Result> results = rootData.getResult();
    return results.stream()
        .map(DataMapper::mapToDto)
        .collect(Collectors.toList());
  }

  @GetMapping
  List<QuizDto> getQuiz(){
    return getQuizDto();
  }
}
