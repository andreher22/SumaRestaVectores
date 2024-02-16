import java.util.Scanner;

public class SumaRestaVectores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float U1, U2, V1, V2, R1, R2;
        boolean salir = false;
        System.out.println("Menu de Operaciones");
        System.out.println("1. Suma de Vectores");
        System.out.println("2. Resta de vectores");
        System.out.println("3. Salir");
        System.out.print("Ingrese el número de la opción: ");
        int N = scanner.nextInt();
        System.out.println("Ingrese los valores del vector U: ");
        U1 = scanner.nextFloat();
        U2 = scanner.nextFloat();
        System.out.println("Ingrese los valores del vector V: ");
        V1 = scanner.nextFloat();
        V2 = scanner.nextFloat();
        switch (N) {
            case 1:
                R1 = U1 + V1;
                R2 = U2 + V2;
                System.out.println("La suma de U + V es: (" + R1 + ", " + R2 + ")");
                break;
            case 2: 
                R1 = U1 - V1;
                R2 = U2 - V2;
                System.out.println("La resta de U - V es: (" + R1 + ", " + R2 + ")");
                break;
            case 3:
                System.out.println("Saliendo"); salir = true;
                break;
        }
    }
}

