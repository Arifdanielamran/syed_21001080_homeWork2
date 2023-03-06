
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
    public class mathSurvey {
        private List<mathQuestion> questions;
        private List<Integer> Responder;
        private int score;

        public mathSurvey(List<mathQuestion> questions) {
            this.questions = questions;
            this.Responder = new ArrayList<>();
            this.score = 0;
        }

        public void takeSurvey() {
            Scanner scanner = new Scanner(System.in);

            for (mathQuestion question : questions) {
                System.out.println(question.getQuestionText());
                List<String> answerChoices = question.getAnswerChoices();

                for (int i = 0; i < answerChoices.size(); i++) {
                    System.out.printf("%d. %s\n", i + 1, answerChoices.get(i));
                }

                System.out.print("Enter your answer (1-" + answerChoices.size() + "): ");
                int userAnswer = scanner.nextInt();
                Responder.add(userAnswer);

                if (userAnswer == question.getCorrectAnswer()) {
                    score++;
                }
            }

            System.out.printf("Your score is %d out of %d.\n", score, questions.size());
            System.out.printf("Your percentage score is %.2f%%.\n", (double) score / questions.size()*100);}
    }

