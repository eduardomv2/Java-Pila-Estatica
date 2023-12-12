package pilaEstaticaStack;

import java.util.Scanner;
import java.util.Stack;

public class PilaEstaticaStack {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Push (Ingresar dato)");
            System.out.println("2. Pop (Quitar dato)");
            System.out.println("3. Peek (Ver último dato)");
            System.out.println("4. Mostrar Pila Completa");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Push (Ingresar dato)
                    System.out.print("Ingrese un número: ");
                    int newData = scanner.nextInt();
                    stack.push(newData);
                    System.out.println("Se ha ingresado el dato " + newData + " en la pila.");
                    break;

                case 2: // Pop (Quitar dato)
                    if (!stack.isEmpty()) {
                        int poppedData = stack.pop();
                        System.out.println("Se ha retirado el dato " + poppedData + " de la pila.");
                    } else {
                        System.out.println("La pila está vacía, no se pueden retirar más datos.");
                    }
                    break;

                case 3: // Peek (Ver último dato)
                    if (!stack.isEmpty()) {
                        int peekedData = stack.peek();
                        System.out.println("El último dato ingresado en la pila es: " + peekedData);
                    } else {
                        System.out.println("La pila está vacía, no hay datos para mostrar.");
                    }
                    break;

                case 4: // Mostrar Pila Completa
                    System.out.println("Contenido de la pila:");
                    for (int item : stack) {
                        System.out.println(item);
                    }
                    break;

                case 5: // Salir
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
                    break;
            }
        }
    }
	

}
