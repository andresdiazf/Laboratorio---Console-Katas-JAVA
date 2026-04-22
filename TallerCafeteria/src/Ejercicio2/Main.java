package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        double subtotal = 42500;
        double porcentajeDescuento = 0.15;
        boolean tieneDescuento = subtotal > 30000;
        if (tieneDescuento) {
            double valorDescuento = subtotal * porcentajeDescuento;
            double totalApagar = subtotal - valorDescuento;
            System.out.printf("Valor del descuento: $%.2f%n", valorDescuento);
            System.out.printf("Total a pagar: $%.2f%n", totalApagar);
            System.out.printf("¿Tiene derecho a descuento?: %b%n", tieneDescuento);
        }
    }
}
