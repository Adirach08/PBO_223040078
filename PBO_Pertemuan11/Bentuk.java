package PBO_Pertemuan11;

public abstract class Bentuk {
    protected double PHI = 3.14;
    protected int jari2;

    public Bentuk(int jari2) {
    	super();
        this.jari2 = jari2;
    }

    // abstract & getter
    public abstract double luas();

    public int getJari2() {
        return jari2;
    }

    // Setter
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }

}