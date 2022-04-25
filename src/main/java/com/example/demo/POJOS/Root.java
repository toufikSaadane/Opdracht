package com.example.demo.POJOS;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    private Integer responseCode = 0;
    private List<Result> results;
}
