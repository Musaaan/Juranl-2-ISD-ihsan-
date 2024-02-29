import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Generic <Bag> daftarBag = new Generic<>(5);
        Generic <ATK> daftarATK = new Generic<>(5);
        daftarATK.addData(new ATK("A001", "Pencil", "Joyko", 50) );
        daftarATK.addData(new ATK("A022", "Pulpen", "Joyko", 55) );
        daftarATK.addData(new ATK("B102", "HVS A4", "Joyko", 23) );
        daftarATK.addData(new ATK("B108", "Big boss", "Joyko", 31) );
        daftarATK.addData(new ATK("B110", "Sinar dunia", "Joyko", 20) );

        daftarBag.addData(new Bag("C206", "Sepatu", "Converse", 10) );
        daftarBag.addData(new Bag("C210", "Tas", "ProShop", 11) );
        daftarBag.addData(new Bag("C201", "Sepatu", "Eiger", 18) );
        daftarBag.addData(new Bag("C216", "Tas", "Skaters", 8) );
        daftarBag.addData(new Bag("C204", "Sepatu", "Hommy Pad", 13) );

        daftarATK.display();
        daftarBag.display();
    }
}
