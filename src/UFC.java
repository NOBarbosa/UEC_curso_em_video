import ultimateEmojiFight.Luta;
import ultimateEmojiFight.Lutador;


public class UFC {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Anderson Silva", "Brasileiro", 45, 34, 11, 0, 1.88f, 82.0f);
        l[1] = new Lutador("Georges St-Pierre", "Canadense", 42, 26, 2, 0, 1.78f, 77.1f);
        l[2] = new Lutador("Jon Jones", "Americano", 36, 26, 1, 0, 1.93f, 93.0f);
        l[3] = new Lutador("Khabib Nurmagomedov", "Russo", 35, 29, 0, 0, 1.78f, 70.3f);
        l[4] = new Lutador("Conor McGregor", "Irlandês", 35, 22, 6, 0, 1.75f, 70.0f);
        l[5] = new Lutador("Israel Adesanya", "Neozelandês", 34, 23, 2, 0, 1.93f, 84.0f);

//        l[0].status();
        Luta  ufc01 = new Luta();
        ufc01.marcarLuta(l[2], l[5]);
        ufc01.lutar();
//        l[0].status();
    }
}