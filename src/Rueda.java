public class Rueda {
    private int radio;
    private String tipo;
    private double presion;

    public Rueda(int radio, String tipo, double presion) {
        this.radio = radio;
        this.tipo = tipo;
        this.presion = presion;
    }

    public int getRadio() { return radio; }
    public void setRadio(int radio) { this.radio = radio; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getPresion() { return presion; }
    public void setPresion(double presion) { this.presion = presion; }
}
