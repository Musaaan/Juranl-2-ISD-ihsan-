
public class Mahasiswa {
    private String NIM;
    private String nama;
    private String kelas;

    public Mahasiswa(String NIM, String nama, String kelas){
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    @Override
    public String toString() {
        return "\nNIM : " + NIM + "\nNama : " + nama + "\nKelas : " + kelas + "\n";
    }

    @Override
    public int hashCode(){
        final int HASH_MULTIPLIER = 31;
        int h1 = NIM.hashCode();
        int h2  = nama.hashCode();
        int h3 = kelas.hashCode();

        int h = HASH_MULTIPLIER * h1 * h2 * h3;

        return h;   
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){

            return true;
        }

        if(obj == null){
            return false;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }


        Mahasiswa other = (Mahasiswa) obj;

        return NIM.equals(other.NIM) && nama.equals(other.nama) && kelas.equals(other.kelas);
    }



   

    


    
}