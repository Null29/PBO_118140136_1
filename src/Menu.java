import java.util.Scanner;

public class Menu {
    public void menu_utama(){
        System.out.print( "1. Mulai \n " +
                "2. Cara Bermain \n" +
                "Masukkan pilihan anda :");
        Scanner cin = new Scanner(System.in);
        String pil = cin.nextLine();
        while(!pil.equals("1") && pil.equals("2")){
            System.out.println("Mohon masukkan angka antara 1 s.d. 2!");
            System.out.print("Masukkan pilihan anda :");
            pil = cin.nextLine();
        }
        if(pil.equals("1")) return;
        else if(pil.equals("2")) cara();
        menu_utama();
    }
    public void cara(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Player akan terus berlari dan suatu saat akan menemukan rintangan.\n" +
                "Program akan menentukan apakah pemain dapat melewati rintangan tersebut atau tidak dengan cara mer-random-nya. \n" +
                "Untuk memperbesar kemungkinan tersebut, pemain akan diminta untuk menebak angka dari 1 sampai 10. \n" +
                "Angka yang dimasukkan akan dibandingkan dengan angka acak dan dinilai kedekatannya dengan angka acak tersebut. \n" +
                "Semakin dekat dengan angka acak maka akan semakin besar kemungkinan pemain melewati rintangan tersebut. \n" +
                "Apabila pemain gagal melewati rintangan maka darah (HealthPoint) akan dikurangi 1 \n" +
                "Apabila darah/HP pemain mencapai 0 maka permainan berakhir.\n" +
                "Skor dihitung berdasarkan banyaknya rintangan yang dapat dilewati dikali dengan speed pemain.\n" +
                "Kedekatan dihitung menggunakan rumus : (1 - angka_pemain/angka_acak)\n" +
                "Tekan Enter untuk kembali ke menu utama....");
        String p = cin.nextLine();
    }
}
