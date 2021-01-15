package wiederholung;

public class Student extends Person {
    private String university;

    public Student(String vorname, String nachname, String university) {
        super(vorname, nachname);
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + "\', " +
                super.toString() +
                '}';
    }
}
