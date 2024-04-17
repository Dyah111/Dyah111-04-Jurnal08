import java.util.HashMap;

public class Perumusan {
    HashMap<Mahasiswa, Double> rumusanMahasiswa = new HashMap<>();

    public void inputMahasiswa(Mahasiswa mahasiswa1) {
        rumusanMahasiswa.put(mahasiswa1, 0.0);
    }

    public void hapusMahasiswa(Mahasiswa mahasiswa2) {
        rumusanMahasiswa.remove(mahasiswa2);
    }

    public void simpanNilaiMahasiswa(Mahasiswa mahasiswa3, double nilai) {
        rumusanMahasiswa.put(mahasiswa3, nilai);
    }

    public void lihatNilai() {
        for (HashMap.Entry<Mahasiswa, Double> mahasiswa : rumusanMahasiswa.entrySet()) {
            System.out.println("NIM: " + mahasiswa.getKey().getNim());
            System.out.println("Nama: " + mahasiswa.getKey().getNama());
            System.out.println("Kelas: " + mahasiswa.getKey().getKelas());
            System.out.println("NIM: " + mahasiswa.getValue());
            System.out.println("---");
        }
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata());
    }

    public double rataRata() {
        double sum = 0;
        int total = 0;
        for (double nilai : rumusanMahasiswa.values()) {
            sum += nilai;
            total++;
        }
        return sum / total;
    }
}
