package com.ajzamora.jokeslib;

import java.util.ArrayList;
import java.util.List;

public class JokePicker {
    private List<Joke> jokeList = new ArrayList<>();

    public JokePicker() {
        jokeList.add(new Joke("Good morning, that\'s a nice tnetennba."));
    }

    public String getJoke() {
        return jokeList.get(0).getJokeString();
    }

}
