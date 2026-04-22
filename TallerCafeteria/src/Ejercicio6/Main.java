package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        String [] productos = { "Café americano", "Capuchino", "Jugo de naranja", "Tostada",
                "Brownie"};

        double [] precios = { 3500, 5000, 4000, 4500, 6000};

     
        for (int i = 0; i < productos.length; i++) {
            String producto = productos[i];
            double precio = precios[i];
            int num = i + 1;
            System.out.println( num + " " + producto + " " + precio);

        }

    }

}