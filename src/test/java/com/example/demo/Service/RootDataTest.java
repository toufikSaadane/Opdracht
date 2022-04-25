package com.example.demo.Service;

import com.example.demo.POJOS.Root;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RootDataTest {

    RootData rootData;

    @BeforeEach
    void setUp() {
        rootData = new RootData(new RestTemplate());
    }

    @Test
    void test_getTriviaData() {

        assertThat(rootData.getTriviaData()).isNotNull();
        assertThat(rootData.getTriviaData()).isInstanceOf(Root.class);
        assertThat(rootData.getTriviaData().getResults().size()).isEqualTo(5);
    }
}