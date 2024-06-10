import java.util.*;


public class Main {

    public static void main(String []args){
        LinkedList<Data> list = new LinkedList<Data>();
        Scanner input = new Scanner(System.in);

        int pilihan;
        while(true){
            System.out.println("1.Input Tugas");
            System.out.println("2.Delete Tugas");
            System.out.println("3.Lihat List Tugas");
            System.out.println("4.Keluar");

            System.out.print("Masukan Pilihan : ");
            pilihan = input.nextInt();
             input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Mata Kuliah : ");
                    String mataKuliah = input.nextLine();
                    System.out.print("Tugas : ");
                    String tugas = input.nextLine();
                    System.out.print("Deadline : ");
                    String deadline = input.nextLine();

                    System.out.println("Mau nambah dari mana ? ( [1]Depan/ [2]Belakang )");
                    System.out.print("Ketikan Pilihan mu : ");
                    int pilihanTambah = input.nextInt();
                    input.nextLine();

                    switch (pilihanTambah) {
                        case 1:
                            list.addFirst(new Data(mataKuliah, tugas, deadline));
                            break;
                        case 2:
                            list.addLast(new Data(mataKuliah, tugas, deadline));
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    };
                    break;
    

                case 2:
                    System.out.println("Mau Hapus dari mana ? ( [1]Depan/ [2]Belakang )");
                    System.out.print("Ketikan Pilihan mu : ");
                    int pilihanHapus = input.nextInt();
                    input.nextLine();

                    switch (pilihanHapus) {
                        case 1:
                            list.removeFirst();
                            break;
                        case 2:
                            list.removeLast();
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");

                            break;
                    };
                    list.removeFirst();
                    break;
                case 3:
                        ListIterator<Data> iterator = list.listIterator();

                        if(iterator.hasNext()){
                            while(iterator.hasNext()){
    
                                System.out.println(iterator.next());
                            }
                        }else{
                            System.out.println("List kosong");
                        }
                        
                    break;
                case 4:
                    System.out.println("Keluar Program");
                    return;
            
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }

            input.close();
        }
        
    }

}