package com.example.demo.Contoller;

import com.example.demo.Dto.QuizDto;
import com.example.demo.POJOS.Answers;
import com.example.demo.POJOS.Result;
import com.example.demo.Service.DataMapper;
import com.example.demo.Service.RootData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@Controller
public class ResultController {

  public final Logger logger = LoggerFactory.getLogger(ResultController.class);

  public RootData rootData;

  @Autowired
  public ResultController(RootData rootData) {
    this.rootData = rootData;
  }

  @GetMapping("/questions")
  String sayHello(Model model) {
    System.out.println("Dto from questions" + getQuizDto());
    model.addAttribute("answers", new Answers());
    model.addAttribute("question_one", getQuizDto().get(0));
    model.addAttribute("question_two", getQuizDto().get(1));
    model.addAttribute("question_three", getQuizDto().get(2));
    model.addAttribute("question_four", getQuizDto().get(3));
    model.addAttribute("question_five", getQuizDto().get(4));

    return "questions";
  }

  @PostMapping("/answers")
  public String greetingSubmit(@ModelAttribute Answers answers, Model model) {

    System.out.println("Dto from answers" + getQuizDto());

    if (getQuizDto().get(0).getCorrect_answer().equals(answers.getAnswer_one())){
      model.addAttribute("answer_one", " is correct");
    }else {
      model.addAttribute("answer_one", " is Not correct");
    }

    if (getQuizDto().get(1).getCorrect_answer().equals(answers.getAnswer_two())){
      model.addAttribute("answer_two", " is correct");
    }else {
      model.addAttribute("answer_two", " is Not correct");
    }

    if (getQuizDto().get(2).getCorrect_answer().equals(answers.getAnswer_three())){
      model.addAttribute("answer_three", " is correct");
    }else {
      model.addAttribute("answer_three", " is Not correct");
    }

    if (getQuizDto().get(3).getCorrect_answer().equals(answers.getAnswer_four())){
      model.addAttribute("answer_four", " is correct");
    }else {
      model.addAttribute("answer_four", " is Not correct");
    }

    if (getQuizDto().get(4).getCorrect_answer().equals(answers.getAnswer_five())){
      model.addAttribute("answer_five", " is correct");
    }else {
      model.addAttribute("answer_five", " is Not correct");
    }

    return "result";
  }

  private List<QuizDto> getQuizDto() {
    List<Result> results = rootData.getResult();
    return results.stream()
        .map(DataMapper::mapToDto)
        .collect(Collectors.toList());
  }

}