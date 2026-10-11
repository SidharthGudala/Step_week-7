class Locker {
    private String code;
    private final int number;

    Locker(int number, String code) {
        this.number = number;
        this.code = code;
    }

    boolean changeCode(String oldCode, String newCode) {
        if (code.equals(oldCode)) {
            code = newCode;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        System.out.println(l.changeCode("1234", "5678"));
        System.out.println(l.changeCode("0000", "9999"));
    }
}
