package proiektua;

/**
 * Hamartarretik bitarrera eta bitarretik hamartarrera bihurketak.
 * Liburutegirik gabe programatuta (ez da Integer.toBinaryString erabiltzen).
 */
public class BihurtzaileBitarra {

    /**
     * Zenbaki hamartar bat bitarrera bihurtzen du, 2z zatituz.
     *
     * @param n bihurtu beharreko zenbakia (0 edo handiagoa)
     * @return zenbakiaren adierazpen bitarra, adibidez 10 -> "1010"
     * @throws IllegalArgumentException n negatiboa bada
     */
    public static String hamartarretikBitarrera(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Zenbakia ez da negatiboa izan behar: " + n);
        }
        if (n == 0) {
            return "0";
        }
        String emaitza = "";
        while (n > 0) {
            emaitza = (n % 2) + emaitza; // hondarra ezkerrean gehitzen da
            n = n / 2;
        }
        return emaitza;
    }

    /**
     * Zenbaki bitar bat (testua) hamartarrera bihurtzen du.
     * Digitu bakoitzeko: emaitza = emaitza * 2 + digitua.
     *
     * @param b zenbaki bitarra, adibidez "1010"
     * @return zenbakiaren balio hamartarra, adibidez 10
     * @throws IllegalArgumentException testua hutsik badago, 0 eta 1 ez diren karaktereak badaude
     *                                  edo 31 digitu baino gehiago badauka
     */
    public static int bitarretikHamartarrera(String b) {
        if (b == null || b.length() == 0) {
            throw new IllegalArgumentException("Zenbaki bitarra ezin da hutsik egon");
        }
        if (b.length() > 31) {
            throw new IllegalArgumentException("Zenbaki bitarra luzeegia da (gehienez 31 digitu)");
        }
        int emaitza = 0;
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("Karaktere baliogabea: " + c);
            }
            emaitza = emaitza * 2 + (c - '0');
        }
        return emaitza;
    }
}
