/*
Programa que calcula 
El valor a pagar a cada empelado a partir del número de horas laboradas semanales
El valor total pagado a todos los obreros
 */
package nominasemanaxyz;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class NominaSemanaXYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obtener = new Scanner(System.in);
        int valorHora = 1000;
        int numeroHoras;
        int valorPagarObrero;
        int valorTotalPagados = 0;
        String nombreEmpleado;
        for (int i = 0; i <= 4; i++) {
            System.out.println("Por favor Ingrese Nombre del empelado ");
            nombreEmpleado = obtener.next().intern();
            System.out.println("Por favor ingrese el numero de horas laboradas");
            numeroHoras = obtener.nextInt();
            valorPagarObrero = valorHora * numeroHoras;
            System.out.println("El valor a pagar a "+nombreEmpleado+" es: " + valorPagarObrero);

            valorTotalPagados = valorTotalPagados + valorPagarObrero;
        }
        System.out.println("El valor total pagado a todos los obreros es: " + valorTotalPagados);
    }

}
