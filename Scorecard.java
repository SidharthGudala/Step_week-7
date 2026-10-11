class Scorecard {
    private boolean[] answers;
    private int count;

    Scorecard(int questions) {
        answers = new boolean[questions];
    }

    void recordAnswer(boolean correct) {
        if (count < answers.length)
            answers[count++] = correct;
    }

    int getScore() {
        int score = 0;
        for (int i = 0; i < count; i++)
            if (answers[i])
                score++;
        return score;
    }

    public static void main(String[] args) {
        Scorecard s = new Scorecard(4);
        s.recordAnswer(true);
        s.recordAnswer(true);
        s.recordAnswer(false);
        s.recordAnswer(true);

        System.out.println(s.getScore());
    }
}
