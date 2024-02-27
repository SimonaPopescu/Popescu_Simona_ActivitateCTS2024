package clase.classes;

import clase.Aplicant;
import clase.Elev;
import clase.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    public ElevReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {

        Scanner input2 = new Scanner(new File(super.fileName));

        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {

            Elev aplicant = new Elev();
            super.readAplicant(input2, aplicant);

            int clasa = input2.nextInt();
            String tutore = input2.next();

            aplicant.setClasa(clasa);
            aplicant.setTutore(tutore);

            elevi.add(aplicant);
        }

        input2.close();
        return elevi;
    }
}
