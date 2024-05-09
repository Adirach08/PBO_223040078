package PBO_Pertemuan10;

public class ManagerCafe extends Karyawan{
    private String divisi;
    
    public ManagerCafe(String nama, String alamat, String divisi) {
        super(nama, alamat);
        this.divisi = divisi;
    }
    
    public String getDivisi() {
        return divisi;
    }
}