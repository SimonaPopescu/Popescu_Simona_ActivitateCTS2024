package sustinereExamen.main;

import sustinereExamen.classes.Student;
import sustinereExamen.classes.SustinereExamene;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(123, "Popescu Alina", "popescualina@ase.ro", 3);
        Student student2 = new Student(123, "Popa Ana", "popaana@ase.ro", 2);

        SustinereExamene examenPoo = new SustinereExamene("Programare Orientata Obiect");
        SustinereExamene examenCts = new SustinereExamene("Calitate si Testare Software");

        examenPoo.inregistrareStudent(student1);
        examenPoo.inregistrareStudent(student2);

    }
}
