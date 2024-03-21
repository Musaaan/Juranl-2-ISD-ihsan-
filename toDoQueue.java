import java.util.*;

public class toDoQueue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue <String> Tugas = new LinkedList<>();

        while (true) {
            
        
            System.out.println("\nPilih menu :\n1. Input tugas\n2. Lihat tugas pertama\n3. Menyelesaikan tugas    \n4. Print semua \n5. Keluar");
            System.out.print("Masukkan pilihan ");

        int pilihan = input.nextInt();
        input.nextLine();
        

            switch (pilihan) {
                case 1:
                    System.out.println("Tambah tugas");
                    String tambah = input.nextLine();
                    Tugas.add(tambah);
                    break;
                case 2:
                    if (!Tugas.isEmpty())
                    System.out.println("Tugas yang harus dikerjakan " + Tugas.peek());
                    else
                    System.out.println("Tidak ada yang harus dikerjakan");
                    break;
                case 3: 
                if(!Tugas.isEmpty())
                System.out.println("Tugas sudah Selesai " + Tugas.remove());
                else
                System.out.println("Tidak ada tugas");
                    break;
                case 4:
                if(!Tugas.isEmpty())
                for (String queue : Tugas) {
                    System.out.println(queue);
                }
                else
                System.out.println("Tidak ada tugas");
                    break;
                    case 5:
                    System.exit(0);
            }

        }
           
    }
}