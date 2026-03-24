import java.util.Scanner;

class Nodo {
    int valor;
    Nodo izquierda, derecha;

    public Nodo(int valor) {
        this.valor = valor;
        izquierda = derecha = null;
    }
}

class ArbolBinario {
    Nodo raiz;

    // Insertar numero en el arbol 
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
        } else if (valor > nodo.valor) {
            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
        }
        return nodo;
    }

    // Recorrido inorden
    public void inorden() {
        inordenRecursivo(raiz);
        System.out.println();
    }

    private void inordenRecursivo(Nodo nodo) {
        if (nodo != null) {
            inordenRecursivo(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inordenRecursivo(nodo.derecha);
        }
    }

    // Buscar un numero  
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return false;
        }
        if (valor == nodo.valor) {
            return true;
        }
        return valor < nodo.valor
                ? buscarRecursivo(nodo.izquierda, valor)
                : buscarRecursivo(nodo.derecha, valor);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();
        int opcion;

        do {
            System.out.println("\n--- MENU ARBOL BINARIO ---");
            System.out.println("1. Insertar numeros");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar numero");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int continuar;
                    do {
                        System.out.print("Ingresa el numero a insertar: ");
                        int numInsertar = scanner.nextInt();
                        arbol.insertar(numInsertar);
                        System.out.println("Numero insertado correctamente.");

                        System.out.print("¿Deseas insertar otro numero? (1 = Si, 0 = No): ");
                        continuar = scanner.nextInt();
                    } while (continuar == 1);
                    break;

                case 2:
                    System.out.println("Recorrido inorden:");
                    arbol.inorden();
                    break;

                case 3:
                    System.out.print("Ingresa el número a buscar: ");
                    int numBuscar = scanner.nextInt();
                    boolean encontrado = arbol.buscar(numBuscar);
                    if (encontrado) {
                        System.out.println("El numero " + numBuscar + " SI existe en el arbol.");
                    } else {
                        System.out.println("El numero " + numBuscar + " NO existe en el arbol.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
