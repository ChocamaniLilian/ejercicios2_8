package ejercicio2_1;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", "Perez", 12345678, 1990, "Argentina", 'H');
        Persona persona2 = new Persona("Maria", "Gomez", 87654321, 1985, "Colombia", 'M');

        System.out.println("Persona 1:");
        persona1.imprimir();

        System.out.println("\nPersona 2:");
        persona2.imprimir();
    }
}
