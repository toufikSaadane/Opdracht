package com.example.demo.Service;

import com.example.demo.POJOS.Result;
import com.example.demo.POJOS.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RootData implements TriviaData{

    private final RestTemplate restTemplate;

    @Autowired
    public RootData(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /***
     *
     * @return Root
     */
    @Override
    public Root getTriviaData() {
        return restTemplate.getForObject(
                "https://opentdb.com/api.php?amount=5", Root.class);
    }

    /***
     *
     * @return List
     */
    public List<Result> getResult(){
        return this.getTriviaData().getResults();
    }
}
