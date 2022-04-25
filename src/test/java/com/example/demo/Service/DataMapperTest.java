package com.example.demo.Service;

import com.example.demo.Dto.QuizDto;
import com.example.demo.POJOS.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class DataMapperTest {

  RootData rootData;

  @BeforeEach
  void setUp() {
    rootData = new RootData(new RestTemplate());
  }

  @Test
  void test_mapToDto() {
    List<Result> results = rootData.getResult();
    List<QuizDto> quizDtos =  results.stream()
        .map(DataMapper::mapToDto)
        .collect(Collectors.toList());

    assertThat(quizDtos).isNotNull();
    assertThat(quizDtos.size()).isEqualTo(5);
    assertThat(quizDtos.get(0)).isInstanceOf(QuizDto.class);

  }
}