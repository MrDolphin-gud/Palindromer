import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] teger = new int[(int) 2E+3];
        Scanner sc = new Scanner(System.in);
        char[] acter = sc.next().toUpperCase().toCharArray();
        sc.close();
        int sayac = 0;
        int merkez = 0;
        for (int i = 0; i < acter.length; i++) {
            int a = ((int) acter[i]) - 'A';
            teger[a]++;
        }
        for (int ii = 0; ii < teger.length; ii++) {
            if (teger[ii]%2==1) {
                sayac++;
                if (sayac > 1) {
                    System.out.print(" Palindromlastirilamaz");
                    System.exit(0);
                }
                merkez = ii +'A';
                teger[ii]--;
            }
        }
        int[] baslangicsayi = new int[(int)2E+3];
        for (int iii = 0; iii < teger.length; iii++) {
            baslangicsayi[iii] = teger[iii];
        }

        int h = 0;
        while (h < teger.length) {
            if (teger[h] != 1 && teger[h] != 0) {
                while (teger[h] != (baslangicsayi[h] / 2)) {
                    System.out.print((char) (h + 'A'));
                    teger[h]--;
                }
            }
            h++;
        }
        System.out.print((char) merkez);
        int o = teger.length-1;
        while (o >= 0) {
                while (teger[o] != 0) {
                    System.out.print((char) (o + 'A'));
                    teger[o]--;
                }
            o--;
        }
    }
}
