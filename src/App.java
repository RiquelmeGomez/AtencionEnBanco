import java.util.Scanner;
import java.util.PriorityQueue;

// Clase que representa a un Cliente en la cola del banco
class Cliente implements Comparable<Cliente> {
    String nombre;
    boolean esPrioritario;

    // Constructor para inicializar el cliente con nombre y prioridad
    public Cliente(String nombre, boolean esPrioritario) {
        this.nombre = nombre;
        this.esPrioritario = esPrioritario;
    }

    // Método para comparar clientes por prioridad (los prioritarios van primero)
    @Override
    public int compareTo(Cliente otro) {
        return Boolean.compare(otro.esPrioritario, this.esPrioritario);
    }

    // Representación en cadena del cliente
    @Override
    public String toString() {
        return nombre + (esPrioritario ? " (Prioritario)" : "");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        System.out.println("\n1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Mostrar cola de espera");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    // Mensaje
                    System.out.print("Bienvenido al apartado de Agregar Cliente: ");
                }

        
    }
}
