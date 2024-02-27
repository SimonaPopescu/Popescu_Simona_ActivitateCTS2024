package main;

import clase.Angajat;
import clase.Aplicant;
import clase.classes.AngajatReader;
import clase.interfaces.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader angajatReader = new AngajatReader("angajati.txt");

		try {
			listaAngajati = angajatReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
