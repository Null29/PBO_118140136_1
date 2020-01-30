import java.util.Random;
import java.util.Scanner;

//import Menu.java;
public class Player {
    String nama;
    int speed;
    int HP;

    public void run(){
        System.out.println(this.nama+" mulai berlari dengan kecepatan " + this.speed);
    }
    public boolean isDead() {
        if (this.HP > 0) {
            System.out.println(this.nama+" lanjut berlari...");
            return true;
        }
        else {
            System.out.println(this.nama+" sudah tamat...");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Player budi = new Player();
        Menu utama = new Menu();
        Random rand = new Random();
        int acak, rate, skor = 0, angka;
        utama.menu_utama();
        budi.HP = 4;
        budi.nama = "budi";
        budi.speed = 10;
        budi.run();
        do {
            System.out.println("Pemain menemukan rintangan");
            do {
                System.out.print("Masukkan angka 1 - 10 : ");
                angka = cin.nextInt();
            } while(angka < 1 || angka > 10);
            acak = rand.nextInt(10)+1;
            rate = rand.nextInt(100);
            if(Math.abs(acak - angka) > 5) angka += 10;
            double percent = 100 - Math.abs(acak - angka)*20;
            if(!((int)percent-1 >= rate)){
                budi.HP--;
                System.out.println("Pemain gagal melewati rintangan, darah berkurang 1 menjadi "+ budi.HP);
            }
            else {
                System.out.println("Pemain berhasil melewati rintangan");
                skor++;
            }
            System.out.println(acak+" "+rate+" "+angka+" "+percent);
        } while(budi.isDead());
        System.out.println("Skor anda adalah "+budi.speed*skor);
    }
}
