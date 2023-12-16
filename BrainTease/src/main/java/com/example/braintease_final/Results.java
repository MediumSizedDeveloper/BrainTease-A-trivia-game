package com.example.braintease_final;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * This is the results screen controller tasked with showing the amount of questions answered correctly vs. incorrectly.
 * It is also tasked with handling the restartbtn, which sets the stage back to the home scene, allowing the user to play again.
 */
public class Results {
    @FXML
    public Label remark;
    @FXML
    public Label marks;
    @FXML
    public Label markstext;
    @FXML
    public Label correcttext;
    @FXML
    public Label wrongtext;
    @FXML
    public ProgressIndicator correct_progress;
    @FXML
    public ProgressIndicator wrong_progress;
    @FXML
    private Button restartbtn;

    int correct;
    int wrong;

    public Results() {}

    /**
     * restart function that's mapped to the restartbtn button in the fxml file.
     * @throws IOException Input output exception
     */
    public void restart() throws IOException {
        //load home screen
        FXMLLoader home = new FXMLLoader(Quiz.class.getResource("home.fxml"));
        Scene scene = new Scene(home.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Result class' initialize function takes the values from the Controller class and copies their values over to the
     * corresponding local variable
     */
    @FXML
    private void initialize() {
        this.correct = Controller.correct;
        this.wrong = Controller.wrong;

        int totalQuestions = 36; // Set the total number of questions here

        this.correcttext.setText("Correct Answers: " + this.correct);
        this.wrongtext.setText("Incorrect Answers: " + this.wrong);
        this.marks.setText(String.valueOf(this.correct));

        float correctPercentage = (float) this.correct / totalQuestions;
        this.correct_progress.setProgress(correctPercentage);

        float wrongPercentage = (float) this.wrong / totalQuestions;
        this.wrong_progress.setProgress(wrongPercentage);

        this.markstext.setText(this.correct + " Answers Correct");
        setRemarkText(); // Call a method to set the remark based on the user's performance
    }

    /**
     * Displays a message to the user depending on the score they got.
     */
    private void setRemarkText() {
        float percentage = (float) this.correct / (this.correct + this.wrong);

        if (percentage >= 0.7) {
            remark.setText("Great job! You did well.");
        } else if (percentage >= 0.5) {
            remark.setText("Not bad, but there's room for improvement.");
        } else {
            remark.setText("You can do better! Keep practicing.");
        }
    }
}
