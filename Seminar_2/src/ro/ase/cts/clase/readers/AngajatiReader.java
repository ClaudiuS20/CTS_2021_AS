package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatiReader extends IReader {

	public AngajatiReader(String filePath) {
		super(filePath);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.filePath));
		input.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<>();

		while (input.hasNext()) {
			Angajat angajat = new Angajat();
			super.citireAplicant(input, angajat);

			int salariu = input.nextInt();
			String ocupatie = input.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);

			angajati.add(angajat);
		}

		input.close();
		return angajati;
	}
}
