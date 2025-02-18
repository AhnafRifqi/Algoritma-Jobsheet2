import java.util.Scanner;

public class MahasiswaMain02 {
    public static void main(String[] args) {

        Mahasiswa02 mhs1 = new Mahasiswa02();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2K";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi(); // Memanggil method tampilkanInformasi()

        mhs1.ubahKelas("SIB 1G"); // Memanggil method ubahKelas()
        mhs1.updateIpk(3.60); // Memanggil method updateIpk()

        mhs1.tampilkanInformasi(); // Memanggil method tampilkanInformasi() lagi

    }
}