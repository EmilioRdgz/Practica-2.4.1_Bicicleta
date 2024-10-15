public class Bicicleta {
    private String marca;
    private String modelo;
    private String color;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;

    public Bicicleta(String marca, String modelo, String color, Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public Rueda getRuedaDelantera() { return ruedaDelantera; }
    public Rueda getRuedaTrasera() { return ruedaTrasera; }
    public Cuadro getCuadro() { return cuadro; }
}
