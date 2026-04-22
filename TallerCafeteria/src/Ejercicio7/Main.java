package Ejercicio7;

/* public class CajaRegistradora {
    public static void main(String[] args) {
        int cantidadVendida = "5"; // error: esta declarando un entero pero el cod string
        double precioUnitario = 4500; //
        double total = cantidadVendida * precioUnitario  // Error falta el punto y coma ;
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento = true){ // error: esta asignando un valor a la varible aplicarDescuento , debe realializar una comparacion con ==
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total); } } */

// correccion codigo

public class Main {

    public static void main(String[] args) {
        int cantidadVendida = 5; // error: esta declarando un entero pero el cod string
        double precioUnitario = 4500; //
        double total = cantidadVendida * precioUnitario;  // Error falta el punto y coma ;
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento == true){ // error: esta asignando un valor a la varible aplicarDescuento , debe realializar una comparacion con ==
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total);
    }
}


