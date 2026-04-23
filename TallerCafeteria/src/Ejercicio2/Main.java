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

//package ejercicio2;
//
//import java.text.NumberFormat;
//import java.util.Locale;
//
//public class Main {
//    public static void main(String[] args) {
//
//        double precio = 24000;
//        Locale colombia = new Locale("es", "CO");
//        NumberFormat moneda = NumberFormat.getCurrencyInstance(colombia);
//
//        double descuento = 0.15;
//        double valorDescuento = precio * descuento;
//        double precioTotal = precio - valorDescuento;
//        double aplicaDescuento = 30000;
//        boolean tieneDescuento = (precio > aplicaDescuento);
//
//
//        if (tieneDescuento) {
//            System.out.printf("El precio con descuento es %s", moneda.format(precioTotal));
//        } else  {
//            System.out.printf("El precio sin descuento es %s", moneda.format(precioTotal));
//
//        }
//
//    }
//}
