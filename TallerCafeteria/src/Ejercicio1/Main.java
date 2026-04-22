package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        String nombreProducto = "Café";
        double precioUnitario = 10.5;
        int cantidadInventario = 25000;
        boolean disponibleHoy = true;
        char codigoProducto = 'A';

        System.out.println(String.format("Nombre del producto: %s", nombreProducto));
        System.out.println(String.format("Precio unitario: %.2f", precioUnitario));
        System.out.println(String.format("Cantidad en inventario: %d", cantidadInventario));
        System.out.println(String.format("¿Disponible hoy?: %b", disponibleHoy));
        System.out.println(String.format("Código del producto: %c", codigoProducto));
    }
}

