class PiggyBank {
    private int savings;
    private final String id;

    PiggyBank(String id) {
        this.id = id;
    }

    void deposit(int amount) {
        if (amount > 0)
            savings += amount;
    }

    void withdraw(int amount) {
        if (amount > 0 && amount <= savings)
            savings -= amount;
    }

    int getSavings() {
        return savings;
    }

    public static void main(String[] args) {
        PiggyBank p = new PiggyBank("PB-1");
        p.deposit(100);
        p.withdraw(30);
        p.withdraw(500);
        System.out.println(p.getSavings());
    }
}
