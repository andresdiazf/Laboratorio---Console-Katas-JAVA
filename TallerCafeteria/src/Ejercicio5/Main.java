package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        double montoApertura = 0;
        int intentoInvalido = 1;

        do {
            if (intentoInvalido == 1) {
                montoApertura = -30;
                intentoInvalido = 2;
            } else {
                montoApertura = 100;
            }
        } while (montoApertura <= 0);
        System.out.println("Monto de apertura aceptado: $" + montoApertura);
    }
}