package wiederholung;

public class DemoPerson {
    public static void main(String[] args) {

        Person p = new Person("Max", "Mustermann");
        Student s = new Student("Susi", "Sorglos", "FH Campus02");

        System.out.println("s.toString() = " + s.toString());

    }
}
