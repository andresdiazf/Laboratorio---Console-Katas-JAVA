package parte2;

public class Main {
    public static void main(String[] args) {

        // Tarea 4 apertura de caja (antes de procesar pedidos)
        double aperturaCaja = -100;

        do {
            if (aperturaCaja <= 0) {
                System.out.println("Monto invalido, ingresa un valor mayor a 0");
                aperturaCaja = 50000;
            }
        } while (aperturaCaja <= 0);

        System.out.println("Apertura de caja: $" + aperturaCaja);

        // Datos del sistema
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};

        int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};

        // Variables generales
        double totalRecaudado = 0;
        int totalPedidosProcesados = 0;
        double mayorValor = 0;
        int numeroPedidoMayor = 0;
        int inventarioBrownie = 10;

        // Tarea 1 procesamiento de pedidos
        for (int i = 0; i < pedidoProducto.length; i++) {
            int indiceProducto = pedidoProducto[i];
            int cantidad = pedidoCantidad[i];
            String nombre = nombres[indiceProducto];
            double precio = precios[indiceProducto];
            char categoria = categorias[indiceProducto];
            double subtotal = precio * cantidad;

            // Tarea 2 descuento
            boolean aplicaDescuento = subtotal > 12000;
            double totalFinal = subtotal;

            if (aplicaDescuento) {
                totalFinal = totalFinal - (subtotal * 0.10);
            }

            // Tarea 3 inventario brownie
            if (indiceProducto == 4) {
                if (inventarioBrownie < cantidad) {
                    System.out.println("Pedido No." + (i + 1));
                    System.out.println("Brownie agotado");
                    continue;
                } else {
                    inventarioBrownie = inventarioBrownie - cantidad;
                }
            }

            // Categoria
            String descripcion = "";
            switch (categoria) {
                case 'B': descripcion = "Bebida caliente"; break;
                case 'F': descripcion = "Bebida fría"; break;
                case 'C': descripcion = "Comida"; break;
                case 'P': descripcion = "Postre"; break;
                default: descripcion = "Desconocida";
            }

            System.out.println("Pedido No." + (i + 1));
            System.out.println("Producto: " + nombre);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Categoria: " + descripcion);
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Descuento: " + (aplicaDescuento ? "Si" : "No"));
            System.out.println("Total final: $" + totalFinal);

            totalRecaudado = totalRecaudado + totalFinal;
            totalPedidosProcesados++;

            if (totalFinal > mayorValor) {
                mayorValor = totalFinal;
                numeroPedidoMayor = i + 1;
            }
        }

        // Tarea 5 reporte final
        System.out.println("Reporte final");
        System.out.println("Pedidos procesados: " + totalPedidosProcesados);
        System.out.println("Total recaudado: $" + totalRecaudado);
        System.out.println("Pedido con mayor valor: No." + numeroPedidoMayor + " $" + mayorValor);
    }
}