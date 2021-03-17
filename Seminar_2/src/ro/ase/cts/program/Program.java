package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.readers.AngajatiReader;
import ro.ase.cts.clase.readers.IReader;

public class Program {

	public static List<Aplicant> citesteAplicanti(IReader readAplicant) throws FileNotFoundException {
		return readAplicant.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println("Suma finantata pentru angajati: " + Angajat.getSumaFinantare());
		System.out.println("Suma finantata pentru studenti: " + Student.getSumaFinantare());
		System.out.println("Suma finantata pentru elevi: " + Elev.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new AngajatiReader("angajati.txt"));
			Proiect proiect = new Proiect(81);
			for (Aplicant aplicant : listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());

				aplicant.afisareRaspunsProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
