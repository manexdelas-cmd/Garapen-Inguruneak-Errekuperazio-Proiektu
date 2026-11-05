package proiektua;

/**
 * Ilara (Queue) bat, array zirkular batekin programatuta eta liburutegirik gabe.
 * FIFO politika: lehenengo sartutakoa da lehenengo ateratzen dena.
 * Aplikazioan, zain dauden txartelak gordetzen ditu, iristeko ordenan atenditzeko.
 */
public class Ilara {

    private Txartela[] elementuak;
    private int aurrea;  // lehenengo elementuaren indizea (hortik ateratzen da)
    private int atzea;   // hurrengo elementua sartzeko indizea
    private int tamaina; // une honetan gordetako elementu kopurua

    /**
     * @param ahalmena ilarak gordetzen dituen elementu kopuru maximoa
     */
    public Ilara(int ahalmena) {
        elementuak = new Txartela[ahalmena];
        aurrea = 0;
        atzea = 0;
        tamaina = 0;
    }

    /**
     * Txartel bat ilararen amaieran sartzen du.
     *
     * @throws IllegalStateException ilara beteta badago
     */
    public void sartu(Txartela t) {
        if (beteDago()) {
            throw new IllegalStateException("Ilara beteta dago");
        }
        elementuak[atzea] = t;
        atzea = (atzea + 1) % elementuak.length; // array amaieran, hasierara itzultzen da
        tamaina++;
    }

    /**
     * Ilararen aurreko txartela kentzen eta itzultzen du.
     *
     * @throws IllegalStateException ilara hutsik badago
     */
    public Txartela atera() {
        if (hutsikDago()) {
            throw new IllegalStateException("Ilara hutsik dago");
        }
        Txartela t = elementuak[aurrea];
        elementuak[aurrea] = null;
        aurrea = (aurrea + 1) % elementuak.length;
        tamaina--;
        return t;
    }

    public boolean hutsikDago() {
        return tamaina == 0;
    }

    public boolean beteDago() {
        return tamaina == elementuak.length;
    }
}
