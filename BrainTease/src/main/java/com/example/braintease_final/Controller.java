package com.example.braintease_final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * Our Controller class is the main handler of the quiz screen, setting questions, handling answers, and keeping score.
 */
public class Controller {
    @FXML
    public Label scoreLabel;

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    /**
     * initialize() function is the default constructor of this class, except it is called whenever a scene requiring
     * this class is needed, i.e. when the quiz.fxml scene is loaded onto stage.
     * Three variables are set to zero in the initialize functions, and a function is called
     */
    @FXML
    private void initialize() {
        counter = 0;
        correct = 0;
        wrong = 0;
        loadQuestions();

    }

    /**
     * loadQuestions() function displays questions corresponding to a counter variable.
     * Said counter variable increments whenever an answer choice is clicked.
     */
    private void loadQuestions() {

        if (counter == 0) {
            question.setText(" What is the name of the shinigami in \"Death Note\"?");
            opt1.setText("Shinichi");
            opt2.setText("Light");
            opt3.setText("Kira");
            opt4.setText("Ryuk");
        }

        if (counter == 1) {
            question.setText(" Who is the protagonist in \"One Punch Man\"?");
            opt1.setText("Genos");
            opt2.setText("Saitama");
            opt3.setText("Mumen Rider");
            opt4.setText("Sonic");
        }

        if (counter == 2) {
            question.setText(" What year did the Titanic sink?");
            opt1.setText("1930");
            opt2.setText("1916");
            opt3.setText("1912");
            opt4.setText("1930");
        }
        if (counter == 3) {
            question.setText(" In \"One Piece\" what is Luffy's signature attack?");
            opt1.setText("Bankai");
            opt2.setText("Red Hawk");
            opt3.setText("Gear 2");
            opt4.setText("Gear 4");
        }

        if (counter == 4) {
            question.setText(" Who wrote \"Pride and Prejudice\"?");
            opt1.setText("Emily Bronte");
            opt2.setText("Charlotte Bronte");
            opt3.setText("Jane Austen");
            opt4.setText("George Elliot");
        }

        if (counter == 5) {
            question.setText(" In \"Code Geass\" what is the supernatural power known as Geass?");
            opt1.setText("Teleportation");
            opt2.setText("Elemental Magic");
            opt3.setText("Mind Control");
            opt4.setText("Time Manipulation");
        }

        if (counter == 6) {
            question.setText(" In \"Hunter X Hunter\" what is the name of the aura that individuals can harness for various purposes?");
            opt1.setText("Nen");
            opt2.setText("Chi");
            opt3.setText("Alchemy");
            opt4.setText("Haki");
        }

        if (counter == 7) {
            question.setText(" What is the name of the technique Goku uses to multiply his power for a limited time?");
            opt1.setText("Instant Transmission");
            opt2.setText("Super Saiyan");
            opt3.setText("Fusion Dance");
            opt4.setText("Kaio-Ken");
        }

        if (counter == 8) {
            question.setText(" Who directed the film \"Akira\"?");
            opt1.setText("Makoto Shinkai");
            opt2.setText("Hayao Miyazaki");
            opt3.setText("Katsushiro Otomo");
            opt4.setText("Satoshi Kon");
        }

        if (counter == 9) {
            question.setText(" In which year did the first human land on the moon?");
            opt1.setText("1969");
            opt2.setText("1971");
            opt3.setText("1961");
            opt4.setText("1973");
        }

        if (counter == 10) {
            question.setText(" In \"Attack on Titan\" what is the name of the special maneuvering equipment used?");
            opt1.setText("Omni-Directional Mobility Gear (ODMB)");
            opt2.setText("3D Maneuvering Gear");
            opt3.setText("Titan Thrusters");
            opt4.setText("Surveyor Harness");
        }

        if (counter == 11) {
            question.setText(" What is the chemical formula for sulfuric acid?");
            opt1.setText("H2O");
            opt2.setText("CO2");
            opt3.setText("H2SO4");
            opt4.setText("NaCl");
        }

        if (counter == 12) {
            question.setText(" Who discovered the structure of DNA?");
            opt1.setText("Darwin");
            opt2.setText("Newton");
            opt3.setText("Einstein");
            opt4.setText("Watson and Crick");
        }

        if (counter == 13) {
            question.setText(" What is the name of the prestigious academy students with quirks receive hero training in \"My Hero Academia\"?");
            opt1.setText("Quirk Institute");
            opt2.setText("UA High School");
            opt3.setText("Hero Academy");
            opt4.setText("Superhero University");
        }

        // Assuming counter is the index of the current question in the randomized list

        if (counter == 14) {
            question.setText(" What is the name of the Virtual Reality world in \"Sword Art Online\"?");
            opt1.setText("Gun Gale Online");
            opt2.setText("Aincrad");
            opt3.setText("Accel World");
            opt4.setText("Alfheim");
        }

        if (counter == 15) {
            question.setText(" Who wrote \"Romeo and Juliet\"?");
            opt1.setText("Charles Dickens");
            opt2.setText("Jane Austen");
            opt3.setText("Shakespeare");
            opt4.setText("Mark Twain");
        }

        if (counter == 16) {
            question.setText("How many continents are there on Earth?");
            opt1.setText("5");
            opt2.setText("7");
            opt3.setText("6");
            opt4.setText("8");
        }

        if (counter == 17) {
            question.setText(" What is the largest planet in our solar system?");
            opt1.setText("Earth");
            opt2.setText("Mars");
            opt3.setText("Saturn");
            opt4.setText("Jupiter");
        }

        if (counter == 18) {
            question.setText("Who painted the \"Mona Lisa\"?");
            opt1.setText("Vincent Van Gogh");
            opt2.setText("Leonardo da Vinci");
            opt3.setText("Pablo Picasso");
            opt4.setText("Michelangelo");
        }

        if (counter == 19) {
            question.setText("Who is the author of the novel \"1984\" known for dystopian themes?");
            opt1.setText("George Orwell");
            opt2.setText("Aldous Huxley");
            opt3.setText("Ray Bradbury");
            opt4.setText("Franz Kafka");
        }

        if (counter == 20) {
            question.setText(" Who is the protagonist in \"Sword Art Online\"?");
            opt1.setText("Asuna");
            opt2.setText("Gon");
            opt3.setText("Kirito");
            opt4.setText("Killua");
        }

        if (counter == 21) {
            question.setText(" What is the largest moon in the solar system and a satellite of Jupiter?");
            opt1.setText("Ganymede");
            opt2.setText("Titan");
            opt3.setText("Callisto");
            opt4.setText("Triton");
        }

        if (counter == 22) {
            question.setText(" What is the smallest prime number?");
            opt1.setText("1");
            opt2.setText("2");
            opt3.setText("3");
            opt4.setText("5");
        }

        if (counter == 23) {
            question.setText(" What is the source of alchemical power in \"Full Metal Alchemist\"?");
            opt1.setText("Wands");
            opt2.setText("Alchemy Stones");
            opt3.setText("Philosopher's Stones");
            opt4.setText("Alchemy Force");
        }

        if (counter == 24) {
            question.setText(" Who is the lead guitarist of the rock band Queen?");
            opt1.setText("Freddie Mercury");
            opt2.setText("Brian May");
            opt3.setText("Roger Taylor");
            opt4.setText("John Deacon");
        }

        if (counter == 25) {
            question.setText(" What is the chemical symbol for gold?");
            opt1.setText("Hg");
            opt2.setText("Ag");
            opt3.setText("Fe");
            opt4.setText("Au");
        }

        if (counter == 26) {
            question.setText(" What is the longest river in the world?");
            opt1.setText("Mississippi");
            opt2.setText("Amazon");
            opt3.setText("Nile");
            opt4.setText("Yangtze");
        }

        if (counter == 27) {
            question.setText(" Who is Pikachu's trainer in Pokemon?");
            opt1.setText("Misty");
            opt2.setText("Ash");
            opt3.setText("James");
            opt4.setText("Brock");
        }

        if (counter == 28) {
            question.setText(" What is the name of the pirate crew led by Monkey D. Luffy in \"One Piece\"?");
            opt1.setText("Red-Haired Pirates");
            opt2.setText("Blackbeard Pirates");
            opt3.setText("Straw Hat Pirates");
            opt4.setText("Heart Pirates");
        }

    }

    /**
     * This function is called when an option is clicked and checks if the string of the option matches with the actual answer.
     * This function also relies on the counter variable to determine which question we are on.
     * @param answer is the string to be compared with the actual answer.
     * @return true or false depending on equivalence of the two strings.
     */
    boolean checkAnswer(String answer) {

        if (counter == 0) {
            return answer.equals("Ryuk");
        }
        if (counter == 1) {
            return answer.equals("Saitama");
        }
        if (counter == 2) {
            return answer.equals("1912");
        }
        if (counter == 3) {
            return answer.equals("Red Hawk");
        }
        if (counter == 4) {
            return answer.equals("Jane Austen");
        }
        if (counter == 5) {
            return answer.equals("Mind Control");
        }
        if (counter == 6) {
            return answer.equals("Nen");
        }
        if (counter == 7) {
            return answer.equals("Kaio-Ken");
        }
        if (counter == 8) {
            return answer.equals("Katushiro Otomo");
        }
        if (counter == 9) {
            return answer.equals("1969");
        }
        if (counter == 10) {
            return answer.equals("Omni-Directional Mobility Gear (ODMB)");
        }

        if (counter == 11) {
            return answer.equals("H2SO4");
        }

        if (counter == 12) {
            return answer.equals("Watson and Crick");
        }

        if (counter == 13) {
            return answer.equals("UA High School");
        }

        if (counter == 14) {
            return answer.equals("Aincrad");
        }

        if (counter == 15) {
            return answer.equals("Shakespeare");
        }

        if (counter == 16) {
            return answer.equals("7");
        }

        if (counter == 17) {
            return answer.equals("Jupiter");
        }

        if (counter == 18) {
            return answer.equals("Leonardo da Vinci");
        }

        if (counter == 19) {
            return answer.equals("George Orwell");
        }

        if (counter == 20) {
            return answer.equals("Kirito");
        }

        if (counter == 21) {
            return answer.equals("Ganymede");
        }

        if (counter == 22) {
            return answer.equals("2");
        }

        if (counter == 23) {
            return answer.equals("Philosopher's Stones");
        }

        if (counter == 24) {
            return answer.equals("Brian May");
        }

        if (counter == 25) {
            return answer.equals("Au");
        }

        if (counter == 26) {
            return answer.equals("Nile");
        }

        if (counter == 27) {
            return answer.equals("Ash");
        }

        if (counter == 28) {
            return answer.equals("Straw Hat Pirates");
        }

        return false;
    }

    /**
     * Updates score label in quiz scene
     */
    public void showScore(){scoreLabel.setText("Score: " + correct);}

    /**
     * Function handles what happens when top left button on screen is clicked
     * @param event is an object of type ActionEvent, which is a class commonly used for actions involving fxml aspects
     */
    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText());
        if (checkAnswer(opt1.getText())) {
            correct = correct + 1;

        } else {
            wrong = wrong + 1;
        }
        if (counter == 28) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            showScore();
            counter++;
            loadQuestions();
        }

    }

    /**
     * Handles what happens when top right button is clicked
     * @param event is an object used to respond to certain actions of fxml elements
     */
    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText());
        if (checkAnswer(opt2.getText())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 28 ) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            showScore();
            counter++;
            loadQuestions();
        }
    }

    /**
     * Handles what happens when bottom left button is clicked.
     * @param event is an object used to respond to certain actions of fxml elements
     */
    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText());
        if (checkAnswer(opt3.getText())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 28) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            showScore();
            counter++;
            loadQuestions();
        }
    }

    /**
     * Handles what happens when bottom right button is clicked
     * @param event is an object used to respond to certain actions of fxml elements
     */
    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText());
        if (checkAnswer(opt4.getText())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 28) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            showScore();
            counter++;
            loadQuestions();
        }
    }

}
