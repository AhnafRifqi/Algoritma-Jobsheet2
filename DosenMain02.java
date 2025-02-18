public class DosenMain02 {
    public static void main(String[] args) {
        
        Dosen02 dosen1 = new Dosen02();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Ir. Budi Santoso, M.T.";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "Teknik Informatika";

        Dosen02 dosen2 = new Dosen02("D002", "Dra. Ani Mulyani, M.Si.", false, 2010, "Matematika");
        
        
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        int masaKerja1 = dosen1.hitungMasaKerja(2024);
        System.out.println("Masa Kerja Dosen 1: " + masaKerja1 + " tahun");
        dosen1.ubahKeahlian("Rekayasa Perangkat Lunak");
        System.out.println();

        
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        int masaKerja2 = dosen2.hitungMasaKerja(2024);
        System.out.println("Masa Kerja Dosen 2: " + masaKerja2 + " tahun");
        dosen2.ubahKeahlian("Statistika");
        System.out.println();
    }
}