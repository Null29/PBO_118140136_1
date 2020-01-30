public class Player {
    String nama;
    int speed;
    int HP;

    public void run(){
        System.out.println(this.nama+" mulai berlari...");
    }
    public void isDead() {
        if (this.HP > 0) {
            System.out.println(this.nama+" Masih berlari...");
        }
        else {
            System.out.println(this.nama+" sudah tamat...");
        }
    }

    public static void main(String[] args) {
        Player budi = new Player();
        budi.HP = 4;
        budi.nama = "budi";
        budi.speed = 10;
        budi.run();
        budi.isDead();
        while(budi.HP >= 0){
            budi.isDead();
            budi.HP--;
        }
    }
}
