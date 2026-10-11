class NameTag {
    private final String first, last;

    NameTag(String name) {
        String[] parts = name.split(" ");
        first = parts[0];
        last = parts[1];
    }

    String getNickname() {
        return first + " " + last.charAt(0) + ".";
    }

    public static void main(String[] args) {
        NameTag n = new NameTag("Maria Gomez");
        System.out.println(n.getNickname());
    }
}
