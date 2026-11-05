package proiektua;

public class Main {

	public static void main(String[] args) {

		// Bihurketa bitarra
		System.out.println(BihurtzaileBitarra.hamartarretikBitarrera(10));
		System.out.println(BihurtzaileBitarra.bitarretikHamartarrera("1010"));

		// Pila
		Pila pila = new Pila(3);
		pila.sartu(new Txartela(1, "Pantaila apurtuta", "Ez da piztzen", 2, 20261030));
		pila.sartu(new Txartela(2, "Wifi ez dabil", "Konexio galtzen du", 1, 20261031));
		System.out.println(pila.gailurraIkusi());
		System.out.println(pila.atera());
		System.out.println(pila.atera());
		System.out.println(pila.hutsikDago());
		
		// Ilara
		Ilara ilara = new Ilara(3);
		ilara.sartu(new Txartela(1, "Pantaila apurtuta", "Ez da piztzen", 2, 20261030));
		ilara.sartu(new Txartela(2, "Wifi ez dabil", "Konexio galtzen du", 1, 20261031));
		ilara.sartu(new Txartela(3, "Inprimagailua blokeatuta", "Papera trabatuta", 3, 20261101));
		System.out.println(ilara.beteDago());
		System.out.println(ilara.atera());
		ilara.sartu(new Txartela(4, "Pasahitza ahaztuta", "Ezin du sartu", 2, 20261102));
		System.out.println(ilara.atera());
		System.out.println(ilara.atera());
		System.out.println(ilara.atera());
		System.out.println(ilara.hutsikDago());
	}

}