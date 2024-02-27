package clase.classes;

import clase.Angajat;
import clase.Aplicant;
import clase.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {

    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(super.fileName));

        scanner.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {

            Angajat aplicant = new Angajat();
            super.readAplicant(scanner, aplicant);

            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();

            aplicant.setOcupatie(ocupatie);
            aplicant.setSalariu(salariu);

            angajati.add(aplicant);
        }
        scanner.close();
        return angajati;

    }

}
