package id.ac.polban.model;

public class Staf extends Karyawan {

    public Staf(String id, String nama, String jabatan, String divisi) {
        super(id, nama, jabatan, divisi); 
    }

    @Override
    public String toString() {
        return "[STAF]\n" + super.toString() + "\n";
    }
}