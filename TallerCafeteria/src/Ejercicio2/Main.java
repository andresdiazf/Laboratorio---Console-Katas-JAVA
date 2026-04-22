package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        int pedido = 20000;
        int limiteDescuento = 30000;
        double valorDescuento = 0.15;
        double precioTotal = 0;

        if (pedido >= limiteDescuento) {
                double descuentoFinal = valorDescuento * pedido;
                precioTotal = pedido - descuentoFinal;
                System.out.println("El valor del pedido es: " + pedido + " con el descuento es de " + precioTotal);

        } else {
            System.out.println("No aplica descuento, el valor del pedido es: " + pedido);
        }

    }
}
