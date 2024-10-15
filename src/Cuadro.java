public class Cuadro {
    private String material;
    private String tamaño;
    private double peso;

    public Cuadro(String material, String tamaño, double peso) {
        this.material = material;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getTamaño() { return tamaño; }
    public void setTamaño(String tamaño) { this.tamaño = tamaño; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
}
