package proiektua;

public class Pila {
	
	 private Txartela[] elementuak;
	    private int gailurra; // gailurreko elementuaren indizea; -1 pila hutsik dagoenean
	 
	    /**
	     * @param tamaina pilak gordetzen dituen elementu kopuru maximoa
	     */
	    public Pila(int tamaina) {
	        elementuak = new Txartela[tamaina];
	        gailurra = -1;
	    }
	 
	    /**
	     * Txartel bat pilaren gailurrean sartzen du.
	     *
	     * @throws IllegalStateException pila beteta badago
	     */
	    public void sartu(Txartela t) {
	        if (gailurra == elementuak.length - 1) {
	            throw new IllegalStateException("Pila beteta dago");
	        }
	        gailurra++;
	        elementuak[gailurra] = t;
	    }
	 
	    /**
	     * Gailurreko txartela kentzen eta itzultzen du.
	     *
	     * @throws IllegalStateException pila hutsik badago
	     */
	    public Txartela atera() {
	        if (hutsikDago()) {
	            throw new IllegalStateException("Pila hutsik dago");
	        }
	        Txartela t = elementuak[gailurra];
	        elementuak[gailurra] = null;
	        gailurra--;
	        return t;
	    }
	 
	    /**
	     * Gailurreko txartela itzultzen du, kendu gabe.
	     *
	     * @throws IllegalStateException pila hutsik badago
	     */
	    public Txartela gailurraIkusi() {
	        if (hutsikDago()) {
	            throw new IllegalStateException("Pila hutsik dago");
	        }
	        return elementuak[gailurra];
	    }
	 
	    public boolean hutsikDago() {
	        return gailurra == -1;
	    }
	}
	 


