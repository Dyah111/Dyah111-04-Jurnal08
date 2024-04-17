public class Mahasiswa {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    @Override
    public String toString() {
        return "Mahasiswa [nim = " + nim + "nama = " + nama + "kelas = " + kelas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nim == null) ? 0 : nim.hashCode());
        result = prime * result + ((nama == null) ? 0 : nama.hashCode());
        result = prime * result + ((kelas == null) ? 0 : kelas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mahasiswa other = (Mahasiswa) obj;
        if (nim == null) {
            if (other.nim != null)
                return false;
        } else if (!nim.equals(other.nim))
            return false;
        if (nama == null) {
            if (other.nama != null)
                return false;
        } else if (!nama.equals(other.nama))
            return false;
        if (kelas == null) {
            if (other.kelas != null)
                return false;
        } else if (!kelas.equals(other.kelas))
            return false;
        return true;
    }

}