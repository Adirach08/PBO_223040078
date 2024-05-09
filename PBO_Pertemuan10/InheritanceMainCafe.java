package PBO_Pertemuan10;

public class InheritanceMainCafe{
    public static void main(String[] args) {
        Barista barista = new Barista("Adiraa", "Bandung Coret", "Adiraa08@gmail.com");
        ManagerCafe manager = new ManagerCafe("Adi Rachmansyah", "Cimahi", "Manager");

        System.out.println("Data Manager ");
        System.out.println("Nama : " + manager.getNama());
        System.out.println("Alamat : " + manager.getAlamat());
        System.out.println("Divisi : " + manager.getDivisi());
        
        System.out.println("\nData  Barista");
        System.out.println("Nama : " + barista.getNama());
        System.out.println("alamat : " + barista.getAlamat());
        System.out.println("Email : " + barista.getEmail());
    }
}