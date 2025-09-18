package id.ac.polban.service;

import id.ac.polban.model.Karyawan;
import java.util.ArrayList;
import java.util.List;

public class Kantor {
    private static List<Karyawan> daftarKaryawan = new ArrayList<>();

    public static void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
        System.out.println("-> Berhasil menambahkan karyawan: " + karyawan.getNama());
    }

    public static void tampilkanSemuaKaryawan() {
        System.out.println("\n--- Daftar Karyawan ---");
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
        } else {
            for (Karyawan karyawan : daftarKaryawan) {
                System.out.println(karyawan);
            }
        }
        System.out.println("-----------------------");
    }

    public static void hapusKaryawan(String id) {
        boolean isRemoved = daftarKaryawan.removeIf(karyawan -> karyawan.getId().equalsIgnoreCase(id));
        if (isRemoved) {
            System.out.println("-> Karyawan dengan ID " + id + " berhasil dihapus.");
        } else {
            System.out.println("-> Karyawan dengan ID " + id + " tidak ditemukan.");
        }
    }
}