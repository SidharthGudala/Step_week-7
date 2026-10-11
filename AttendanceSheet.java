class AttendanceSheet {
    private String[] names;
    private int count;

    AttendanceSheet(int size) {
        names = new String[size];
    }

    void markPresent(String name) {
        if (!isPresent(name) && count < names.length)
            names[count++] = name;
    }

    boolean isPresent(String name) {
        for (int i = 0; i < count; i++)
            if (names[i].equals(name))
                return true;
        return false;
    }

    int getPresentCount() {
        return count;
    }

    public static void main(String[] args) {
        AttendanceSheet s = new AttendanceSheet(30);
        s.markPresent("Ana");
        s.markPresent("Ben");
        s.markPresent("Ana");

        System.out.println(s.getPresentCount());
        System.out.println(s.isPresent("Ben"));
        System.out.println(s.isPresent("Chen"));
    }
}
