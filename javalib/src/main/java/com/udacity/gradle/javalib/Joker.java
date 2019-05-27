package com.udacity.gradle.javalib;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Joker {
    List<String> jokes = asList(
            "Doctor: I'm sorry but you suffer from a terminal illness and have only 10 to live. \n Patient:What do you mean, 10? 10 what? Months? Weeks?! \n Doctor:Nine.",
            "I dreamed I was forced to eat a giant marshmallow. When I woke up, my pillow was gone." ,
            "I got another letter from this lawyer today. It said “Final Notice”. Good that he will not bother me anymore.",
            "One of the most wonderful things in life is to wake up and enjoy a cuddle with somebody; unless you are in prison."
    );

    public String getJoke() {
        Random random=new Random();
        String randomJokes=jokes.get(random.nextInt(jokes.size()));
        return randomJokes;
    }
}
