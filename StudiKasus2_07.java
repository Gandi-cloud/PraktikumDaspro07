import java.util.Scanner;

public class StudiKasus2_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data utama
        System.out.print("Nama mahasiswa : ");
        String nama = scanner.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = scanner.nextLine().trim();

        // Variabel penampung status
        boolean berhakDana = false;
        String alasan = "";

        // Pemilihan bersarang (Nested IF)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Peringkat juara : ");
            int peringkat = scanner.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                berhakDana = true;
            } else {
                alasan = "Bukan Juara 1, 2, atau 3";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPKM = scanner.nextInt();

            if (statusPKM == 1) {
                berhakDana = true;
            } else {
                alasan = "PKM tidak lolos pendanaan";
            }

        } else {
            alasan = "Jenis kegiatan tidak mendapat dana penghargaan";
        }

        // Pengecekan dokumen hanya jika kriteria kegiatan/prestasi terpenuhi
        if (berhakDana) {
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = scanner.nextInt();

            if (jumlahDokumen == 4) {
                System.out.println("Status : Dokumen lengkap. Dana penghargaan dapat diberikan.");
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else {
            // Jika sejak awal tidak memenuhi syarat kegiatan/juara/pendanaan
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = scanner.nextInt();
            
            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen) dan " + alasan.toLowerCase() + ". Dana penghargaan tidak diberikan.");
            } else {
                System.out.println("Status : " + alasan + ". Dana penghargaan tidak diberikan.");
            }
        }

        scanner.close();
    }
}