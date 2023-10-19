package ejercicio2_8;

public class Main {
    public static void main(String[] args) {
        Avion a1 = new Avion("Airbus", 4);
        Avion a2 = new Avion("Lockheed", 4);

        System.out.println("Datos del avión a1:");
        System.out.println("Fabricante: " + a1.getFabricante());
        System.out.println("Número de motores: " + a1.getNumMotores());

        System.out.println("Datos del avión a2:");
        System.out.println("Fabricante: " + a2.getFabricante());
        System.out.println("Número de motores: " + a2.getNumMotores());

        a1.cambiarFabricante(a2);

        System.out.println("Datos del avión a1 después de cambiar el fabricante de a2:");
        System.out.println("Fabricante: " + a1.getFabricante());
        System.out.println("Número de motores: " + a1.getNumMotores());

        System.out.println("Datos del avión a2 después de cambiar el fabricante de a2:");
        System.out.println("Fabricante: " + a2.getFabricante());
        System.out.println("Número de motores: " + a2.getNumMotores());
    }
}
