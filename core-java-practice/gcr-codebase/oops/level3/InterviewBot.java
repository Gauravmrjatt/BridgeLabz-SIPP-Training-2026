public class InterviewBot {
    String botName;
    String technology;

    public InterviewBot(String botName, String technology) {
        this.botName = botName;
        this.technology = technology;
    }

    public void conductInterview() {
        System.out.println(botName + " is conducting a " + technology + " interview.");
    }

    public static void main(String[] args) {
        InterviewBot bot1 = new InterviewBot("AlphaBot", "Java");
        InterviewBot bot2 = new InterviewBot("BetaBot", "Python");
        InterviewBot bot3 = new InterviewBot("GammaBot", "React");

        bot1.conductInterview();
        bot2.conductInterview();
        bot3.conductInterview();
    }
}
