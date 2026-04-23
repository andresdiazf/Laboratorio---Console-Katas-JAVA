package Ejercicio4;

public class Main {

    public static void main(String[] args) {

        int inventario = 50;

        int pedido = 3;

        while (inventario >= 10) {

            inventario = inventario - pedido;

            System.out.println("Inventario restante: " + inventario);

        }

    }

}