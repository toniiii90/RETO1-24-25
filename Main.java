import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    int [] num={1,2,3,4,5,6,7,8};
    String [] letra={"A","B","C","D","E","F","G","H"};

    public static void main(String[] args) {

        System.out.println("|--------------------------------------|");
        System.out.println("|      BIENVENIDO/A AL RETO 1 DEL      |");
        System.out.println("|       EQUIPO SÓLIDO FORMADO POR      |");
        System.out.println("|         RAÚL, ADRIAN G, DAVID,       |");
        System.out.println("|        ANTONIO G Y JUAN CARLOS       |");
        System.out.println("|--------------------------------------|");


        System.out.println(posicion());
    }

    public static String posicion(){
        System.out.println("Indica la posicion de tu ficha: ");
        Scanner sc=new Scanner(System.in);
        String posi=sc.nextLine();
        do {
            if (validarPosicion(posi)){
                return posi;
            }else {
                System.out.println("Pon una posición válida:");
                posi=sc.nextLine();
            }
        }while (!validarPosicion(posi));
        return posi;
    }
    public static String movimientoPeon (String posicion) {

        return posicion;
    }

    public static String movimientoAlfil (String posicion) {

        return posicion;
    }

    public static String movimientoTorre (String posicion) {

        return posicion;
    }
    public static String movimientoCaballo (String posicion) {

        return posicion;
    }

    public static String movimientoReina (String posicion) {

        return posicion;
    }

    public static String movimientoRey (String posicion) {

        return posicion;
    }

    public static boolean validarPosicion (String posicion) {
        boolean posicionValida = true;

        if (posicion == null || posicion.length() != 2) {
            posicionValida = false;
        }

        char letra = posicion.charAt(0);
        if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F' && letra != 'G' && letra != 'H') {
            posicionValida = false;
        }

        char numero = posicion.charAt(1);
        if (numero < '1' || numero > '8') {
            posicionValida = false;
        }

        return posicionValida;
    }
}
