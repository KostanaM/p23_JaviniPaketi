package p2;

import p1.First;//importovali smo paket p1. Da su unutar istog paketa onda ne bi trebalo import

//Kreiranje paketa

//Prvi način: prelaskom pokazivac misa preko naziva klase i importovanjem klase

public class ImportPackage {

	public static void main(String[] args) {
		First f = new First(); // Kreiranje objekta klase
		f.view(); // za dati objekat poziv funkcije

	}

}
