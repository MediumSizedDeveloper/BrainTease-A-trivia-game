package com.example.braintease_final;
import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

/**
 * Question class for question objects.
 */
public class Question{
    public String name;
    public String difficulty;
    public String theme;
    public String answers;

    /**
     * Default constructor used to create questions.
     * @param name the actual question.
     * @param difficulty set how hard/unfamiliar the question is.
     * @param theme used for categorizing the question.
     * @param answers the answer for this specific question object.
     */
    public Question(String name, String difficulty, String theme, String answers){
        this.name = name;
        this.difficulty = difficulty;
        this.theme = theme;
        this.answers = answers;
    }

    /**
     * Get the question's answer
     * @return string
     */
    public String getCorrectAnswer(){
        return answers;
    }

    /**
     * Gets the theme
     * @return string
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Gets 'name' or the question string itself
     * @return string
     */
    public String getName() {
        return name;
    }

    /**
     * Gets difficulty
     * @return string
     */
    public String getDifficulty() {
        return difficulty;
    }
}
