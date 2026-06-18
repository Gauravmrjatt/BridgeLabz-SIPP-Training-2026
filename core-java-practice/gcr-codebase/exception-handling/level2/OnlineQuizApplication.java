class OnlineQuizApplication {
    public static void checkAnswers(String[] answers) {
        if (answers == null) {
            System.out.println("Answers array is null");
            return;
        }
        for (int i = 0; i < answers.length; i++) {
            try {
                if (answers[i].equals("A")) {
                    System.out.println("Question " + i + ": Correct");
                } else {
                    System.out.println("Question " + i + ": Incorrect (Expected A)");
                }
            } catch (NullPointerException e) {
                System.out.println("Question " + i + ": Answer is null, skipping");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Question " + i + ": Index out of bounds, skipping");
            }
        }
    }

    public static void main(String[] args) {
        String[] answers = {"A", "B", "C", "D", null, "A"};
        checkAnswers(answers);

        String[] answers2 = {"A"};
        checkAnswers(answers2);
    }
}