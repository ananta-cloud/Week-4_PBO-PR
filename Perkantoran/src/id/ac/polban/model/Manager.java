package id.ac.polban.model;

public class Manager extends Karyawan{
    private double tunjanganJabatan;

    public Manager(String id, String nama, String jabatan, 
    String divisi, double tunjanganJabatan) {
        super(id, nama, jabatan, divisi);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    @Override
    public String toString() {
        return "[MANAGER]\n" + super.toString() + "\n" +
        "  Tunjangan: Rp " + String.format
        ("%,.2f", this.tunjanganJabatan) + "\n";
    }
}
