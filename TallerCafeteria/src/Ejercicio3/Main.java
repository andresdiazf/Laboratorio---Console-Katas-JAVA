package Ejercicio3;

public class Main{
    public static void main(String[] args) {
        char categoria = 'B';
        int descuento = 0;

        switch (categoria){
            case 'P':
                descuento = 8;
                System.out.println("Categoria: Postres");
                System.out.println("Descuento: " + descuento + "%");
                break;

            case 'C':
                descuento = 8;
                System.out.println("Categoria: Comida");
                System.out.println("Descuento: " + descuento + "%");
                break;

            case 'F':
                descuento = 5;
                System.out.println("Categoria: Bebida fria");
                System.out.println("Descuento: " + descuento + "%");
                break;

            case 'B':
                System.out.println("Categoria: Bebida caliente");
                System.out.println("Descuento: " + descuento);
                break;

            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}