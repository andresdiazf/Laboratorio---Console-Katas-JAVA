package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        char codigoCategoria = 'B';
        switch (codigoCategoria) {
            case 'B':
                System.out.println("Categoría: Bebida caliente - IVA: 0%");
                break;
            case 'F':
                System.out.println("Categoría: Bebida fría - IVA: 5%");
                break;
            case 'C':
                System.out.println("Categoría: Comida - IVA: 8%");
                break;
            case 'P':
                System.out.println("Categoría: Postre - IVA: 8%");
                break;
            default:
                System.out.println("Código no reconocido");
        }
    }
}

