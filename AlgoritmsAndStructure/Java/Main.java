
public class Main {
    public static void main(String[] args) {
        int dico = 750000;
        int Dico = dico;
        double total_harga = 0;

        if (Dico > 500000 || 100000 < Dico) {
            double belanja = Dico * 0.1;
            total_harga = Dico - belanja;
        }

        System.out.println(total_harga);
    }
}
