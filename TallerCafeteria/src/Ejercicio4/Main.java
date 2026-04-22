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

No te preocupes lo importante es alcanzarlos a subir jeje

package Ejercicio6;

public class Main {

    public static void main(String[] args) {

        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie"};

        double[] precios = {3500, 5000, 4000, 4500, 6000};

        for (int i = 0; i < productos.length; i++) {

            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);

        }

        double suma = 0;

        for (int i = 0; i < precios.length; i++) {

            suma = suma + precios[i];

        }

        double promedio = suma / precios.length;

        System.out.println("Precio promedio: $" + promedio);

    }

}