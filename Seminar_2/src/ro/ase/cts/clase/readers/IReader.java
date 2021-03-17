package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {

	protected String filePath;

	public IReader(String filePath) {
		this.filePath = filePath;
	}

	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;

	public void citireAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int numarProiecte = input.nextInt();
		String[] denumiriProiecte = new String[numarProiecte];
		for (int i = 0; i < numarProiecte; i++)
			denumiriProiecte[i] = input.next();

		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setVectorDenumiri(denumiriProiecte, numarProiecte);
	}
}
