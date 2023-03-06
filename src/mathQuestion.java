import java.util.List;
    public class mathQuestion {
        private String questionText;
        private List<String> answerChoices;
        private int correctAnswer;

        public mathQuestion(String questionText, List<String> answerChoices, int correctAnswer) {
            this.questionText = questionText;
            this.answerChoices = answerChoices;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestionText() {
            return questionText;
        }

        public List<String> getAnswerChoices() {
            return answerChoices;
        }

        public int getCorrectAnswer() {
            return correctAnswer;
        }

    }
