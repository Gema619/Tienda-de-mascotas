import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> listaMascotas = new ArrayList<>();

        System.out.println("=== Sistema de Registro de Mascotas ===");

        // Registrar Perro
        System.out.println("\nIngrese los datos del perro:");
        System.out.print("Nombre: ");
        String nombrePerro = sc.next();
        System.out.print("Edad: ");
        int edadPerro = sc.nextInt();
        System.out.print("Peso (kg): ");
        double pesoPerro = sc.nextDouble();
        System.out.print("Raza: ");
        String raza = sc.next();

        Perro perro = new Perro(nombrePerro, edadPerro, pesoPerro, raza);
        listaMascotas.add(perro);

        // Registrar Gato
        System.out.println("\nIngrese los datos del gato:");
        System.out.print("Nombre: ");
        String nombreGato = sc.next();
        System.out.print("Edad: ");
        int edadGato = sc.nextInt();
        System.out.print("Peso (kg): ");
        double pesoGato = sc.nextDouble();
        System.out.print("Color: ");
        String color = sc.next();

        Gato gato = new Gato(nombreGato, edadGato, pesoGato, color);
        listaMascotas.add(gato);

        // Mostrar información
        System.out.println("\n=== Información de las Mascotas Registradas ===");
        for (Animal a : listaMascotas) {
            a.mostrarInfo();
            a.hacerSonido();
            System.out.println("---------------------------");
        }

        sc.close();
    }
}
