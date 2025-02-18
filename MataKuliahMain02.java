public class MataKuliahMain02 {
    public static void main(String[] args) {
        
        MataKuliah02 mk1 = new MataKuliah02();
        mk1.kodeMK = "MK001";
        mk1.nama = "Pemrograman Berorientasi Objek";
        mk1.sks = 4;
        mk1.jumlahJam = 8;
        
        MataKuliah02 mk2 = new MataKuliah02("MK002", "Basis Data", 3, 6);
        
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        mk1.ubahSKS(5);
        mk1.tambahJam(2);
        mk1.kurangiJam(10); 
        mk1.kurangiJam(5); 
        System.out.println();

        
        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
        System.out.println();
    }
}