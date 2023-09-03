package session11.homework.marks;

class A extends Marks {
    private final int subject1;
    private final int subject2;
    private final int subject3;

    public A(int subject1, int subject2, int subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    double getPercentage() {
        double totalMarks = (subject1 + subject2 + subject3) / 3;
        return totalMarks;
    }
}