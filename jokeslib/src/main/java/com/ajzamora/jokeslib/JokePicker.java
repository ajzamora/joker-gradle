package com.ajzamora.jokeslib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JokePicker {
    private List<String> jokeList = new ArrayList<>();
    private int lastIndex = 0;

    public JokePicker() {
        this.jokeList = Arrays.asList(
            "Good morning, that\'s a nice tnetennba.",
            "I’d like to start with the chimney jokes – I’ve got a stack of them. The first one is on the house. – Tim Vine",
            "As a scarecrow, people say I’m outstanding in my field. But hay – it’s in my jeans.",
            "The best time to add insult to injury is when you’re signing somebody’s cast. - Demetri Martin",
            "I told my girlfriend she drew her eyebrows too high. She seemed surprised.",
            "I waited and stayed up all night and tried to figure out where the sun was. Then it dawned on me.",
            "Time flies like an arrow, fruit flies like a banana.",
            "I told my friend 10 jokes to get him to laugh. No pun in 10 did."
        );
        this.lastIndex = jokeList.size() - 1;
    }

    public void setJokeList(List<String> jokeList) {
        if (jokeList.isEmpty()) return;
        this.jokeList = jokeList;
        this.lastIndex = jokeList.size()-1;
    }

    public void addJoke(String joke) {
        this.jokeList.add(0, joke);
        this.lastIndex++;
    }

    public String getRandomJoke(){
        return jokeList.get(getRandomNumberInRange(0, lastIndex));
    }

    private int getRandomNumberInRange(int min, int max){
        return (int)(Math.random() * (max-min) + min);
    }

}
