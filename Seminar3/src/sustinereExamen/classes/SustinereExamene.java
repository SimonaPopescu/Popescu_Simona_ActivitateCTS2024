package sustinereExamen.classes;

import java.util.HashMap;
import java.util.Map;

public class SustinereExamene {
    private String nume;
    Map<Integer, Student> listaStudenti = new HashMap<>();

    public SustinereExamene(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void inregistrareStudent(Student student) {
        if(listaStudenti.containsKey(student.getId())) {
            System.out.println("Studentul " + student.getNume() + " a sustinut deja examenul");
        } else {
            listaStudenti.put(student.getId(), student);
            System.out.println("Studentul " + student.getNume() + " sustine ptima data examenul");
        }
    }
}
