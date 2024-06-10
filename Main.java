import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Mahasiswa, Integer[]> mapMahasiswa = new HashMap<>();
        int pilihan;

        // Sebuah perulangan yang dieksekuksi terus menerus hingga kondisi tidak terpenuhi yaitu dengan memilih atau memasukan data pilihan ke-4
        while (true) {
            System.out.println("1. Tambahkan Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Keluar Program");

            // Berfungsi untuk memasukan pilihan user
            System.out.print("Masukan Pilihan Anda : ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                // Pilihan 1 merupakakn pilihan yang berfungsi untuk menambahkan data
                case 1:
                    System.out.println();
                    System.out.print("Masukan NIM Mahasiswa : ");
                    String nimMahasiswa = input.nextLine();
                    System.out.println();
                    System.out.print("Masukan Nama Mahasiswa : ");
                    String namaMahasiswa = input.nextLine();
                    System.out.println();
                    System.out.print("Masukan Kelas Mahasiswa : ");
                    String kelasMahasiswa = input.nextLine();
                    
                    System.out.println();
                    System.out.println("Masukan Nilai Mahasiswa (akhiri dengan simbol - ) : ");
                    
                    // Menggunakan ArrayList untuk menyimpan data mahasiswa
                    ArrayList<Integer> nilaiList = new ArrayList<>();
                    String nilai = input.nextLine();
                    while (!nilai.equals("-")) {
                        // Menambah data dari variable nilai ke nilaiList namun dilakukan casting dahulu ke type data Integer
                        nilaiList.add(Integer.parseInt(nilai));
                        nilai = input.nextLine();
                    }

                    // Dilakukan casting dari ArrayList ke Array
                    Integer[] nilaiMahasiswa = nilaiList.toArray(new Integer[0]);

                    //Pembuatan key dari hashmap dari class Mahasiswa
                    Mahasiswa mahasiswa = new Mahasiswa(nimMahasiswa, namaMahasiswa, kelasMahasiswa);

                    // Memasukan seluruh data tadi dari refrensi variable yaitu mahasiswa dan nilaiMahsiswa;
                    mapMahasiswa.put(mahasiswa, nilaiMahasiswa);
                     
                    break;
                    
                case 2 : 
                    // Pilihan ke-2 berfunsi untuk menghapus data berdasarkan NIM data
                    System.out.print("Masukan NIM data : ");
                    String nimMahasiswa2 = input.nextLine();

                    // Dilakukan iterasi kepada HashMap atau mapMahasiswa
                    Iterator<Map.Entry<Mahasiswa, Integer[]>> iterator = mapMahasiswa.entrySet().iterator();

                    // Melakukan perulangan untuk mencari NIM yang dimasukan lalu dihapus ketika menemukan data yang sesuai
                    while (iterator.hasNext()) {
                        Map.Entry<Mahasiswa, Integer[]> entry = iterator.next();
                        if(entry.getKey().getNIM().equals(nimMahasiswa2)){
                            iterator.remove();
                        }
                        }
                    break;
                case 3: 
                // Menampilkan seluruh data dari hashmap
                    System.out.println("Menampilkan Data : ");
                    System.out.println();
                    int count = 1;
                    for(Map.Entry<Mahasiswa, Integer[]> entry : mapMahasiswa.entrySet()){
                        if (entry != null) {
                            Mahasiswa mahasiswas = entry.getKey();
                            Integer rapot[] = entry.getValue();
                            
                            System.out.println();
                            System.out.print("Mahasiswa "+count +" : " + mahasiswas + "Nilai : ");
                            count += 1;
                            for (int i = 0; i < rapot.length; i++) {
                                System.out.print(rapot[i]);
                                if (i < rapot.length - 1) {
                                    System.out.print(", ");
                                }
                            }
                            System.out.println("\n" + "Rata - Rata Nilai : " + rataRata(rapot));

                        }else{
                            System.out.println("Data Kosong...");
                        }
                        
                    }
                    break;
                case 4:
                // Keluar dari program
                    System.out.println();
                    System.out.println("Keluar dari program....");
                    input.close();
                    System.exit(0);
                    break;
                default:
                // Ketika user pilihan yang tidak ada dalam list maka akan mengeksekusi blok kode berikut
                    System.out.println();
                    System.out.println("Pilihan yang masukan salah!");
                    break;
                        
            }
        }
    }


    // Menghitung rata-rata nilai dengan melakukan perulangan dan mengembalikan rata-rata setelah melakukan beberapa eksekusi kode
    public static Integer rataRata(Integer nilai[]){
        Integer rataRata = 0;
        for(int i = 0; i < nilai.length; i++){
            rataRata += nilai[i];
        }

        rataRata = rataRata / nilai.length;

        return rataRata;
    }
}