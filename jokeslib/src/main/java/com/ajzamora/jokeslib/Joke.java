package com.ajzamora.jokeslib;

public class Joke {
    private String jokeString;
    private String jokeExtra;

    public Joke() {
        setJokeString("");
        setJokeExtra("");
    }

    public Joke(String joke) {
        this();
        setJokeString(joke);
    }

    public Joke(String joke, String extra) {
        this(joke);
        setJokeExtra(extra);
    }

    public String getJokeString() {
        return jokeString;
    }

    public void setJokeString(String jokeString) {
        this.jokeString = jokeString;
    }

    public String getJokeExtra() {
        return jokeExtra;
    }

    public void setJokeExtra(String jokeExtra) {
        this.jokeExtra = jokeExtra;
    }
}
