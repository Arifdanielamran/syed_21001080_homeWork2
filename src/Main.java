import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        List<mathQuestion> questions = new ArrayList<>();

        // Add some math questions to the list
        questions.add(new mathQuestion("q1) 2 + 2?",    List.of("1", "2", "3", "4"), 4));
        questions.add(new mathQuestion("q2) 10 - 5?",   List.of("2", "5", "10", "15"), 5));
        questions.add(new mathQuestion("q3) 4 * 3?",    List.of("8", "12", "16", "20"), 12));
        questions.add(new mathQuestion("q4) 21 / 7?",   List.of("1", "2", "3", "4"), 3));

        mathSurvey survey = new mathSurvey(questions);
        survey.takeSurvey();
}
}