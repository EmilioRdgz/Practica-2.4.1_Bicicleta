public class Main {
    public static void main(String[] args) {
        Rueda rueda1 = new Rueda(26, "Montaña", 2.5);
        Rueda rueda2 = new Rueda(26, "Montaña", 2.5);
        Cuadro cuadro = new Cuadro("Aluminio", "Mediano", 1.5);

        Bicicleta bicicleta = new Bicicleta("Trek", "Marlin", "Rojo", rueda1, rueda2, cuadro);

        
        System.out.println("Bicicleta Marca: " + bicicleta.getMarca());
        System.out.println("Rueda Delantera Tipo: " + bicicleta.getRuedaDelantera().getTipo());
        System.out.println("Cuadro Material: " + bicicleta.getCuadro().getMaterial());
    }
}
