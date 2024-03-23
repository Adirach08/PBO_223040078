package PBO_Pertemuan7;

public class Mahasiswa {
	private String NRP;
	private String Nama;
	
	public Mahasiswa () {
		// TODO Auto-generated constructur stub
	}
	
	public Mahasiswa(String nRP, String nama) {
		super ();
		NRP = nRP;
		this.Nama = nama;
	}
	
	public String display() {
		return "NRP: "+ NRP+ ", Nama: "+ Nama;
	}
	/* Setter & Getter */
}
