import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Perumusan dataMahasiswa = new Perumusan();
        Scanner a = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Hapus mahasiswa");
            System.out.println("3. Simpan nilai");
            System.out.println("4. Lihat nilai");
            System.out.println("5. Keluar");
            int pilih = a.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan NIM = ");
                    String nim = a.nextLine();
                    a.nextLine();
                    System.out.println("Masukkan nama = ");
                    String nama = a.nextLine();
                    System.out.println("Masukkan kelas = ");
                    String kelas = a.nextLine();

                    dataMahasiswa.inputMahasiswa(new Mahasiswa(nim, nama, kelas));
                    break;

                case 2:
                    System.out.println("Masukkan NIM = ");
                    String nim2 = a.nextLine();
                    a.nextLine();
                    System.out.println("Masukkan nama = ");
                    String nama2 = a.nextLine();
                    System.out.println("Masukkan kelas = ");
                    String kelas2 = a.nextLine();

                    dataMahasiswa.hapusMahasiswa(new Mahasiswa(nim2, nama2, kelas2));
                    break;

                case 3:
                    System.out.println("Masukkan NIM = ");
                    String nim3 = a.nextLine();
                    a.nextLine();
                    System.out.println("Masukkan nama = ");
                    String nama3 = a.nextLine();
                    System.out.println("Masukkan kelas = ");
                    String kelas3 = a.nextLine();
                    System.out.println("Masukkan nilai = ");
                    double nilai = a.nextInt();

                    dataMahasiswa.simpanNilaiMahasiswa(new Mahasiswa(nim3, nama3, kelas3), nilai);
                    break;

                case 4:
                    dataMahasiswa.lihatNilai();
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

}
