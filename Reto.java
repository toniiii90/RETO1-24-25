import java.util.Scanner;

public class Reto {
    static char[] letras ={'A','B','C','D','E','F','G','H'};
    static int numeros[]={1,2,3,4,5,6,7,8};
    public static void main(String[] args) {

        System.out.println("|--------------------------------------|");
        System.out.println("|      BIENVENIDO/A AL RETO 1 DEL      |");
        System.out.println("|       EQUIPO SÓLIDO FORMADO POR      |");
        System.out.println("|         RAÚL, ADRIAN G, DAVID,       |");
        System.out.println("|        ANTONIO G Y JUAN CARLOS       |");
        System.out.println("|--------------------------------------|");

        Scanner sc = new Scanner(System.in);


        System.out.println("Las piezas del ajedrez son: ");
        System.out.println("P - Peón");
        System.out.println("A - Alfíl");
        System.out.println("T - Torre");
        System.out.println("C - Caballo");
        System.out.println("D - Dama/Reina");
        System.out.println("R - Rey");
        System.out.println("S - Salir del programa");
        System.out.println();
        boolean salirBucle = false;

        while (!salirBucle) {
            System.out.println("Escoge una pieza (solo una letra): ");
            String elegirPieza = sc.nextLine();

            switch (elegirPieza.toUpperCase()) {
                case "S":
                    System.out.println("Saliendo del programa en 3, 2, 1...");
                    System.out.println("Hasta la próxima! \uD83D\uDC4B");
                    salirBucle = true;
                    break;
                case "P":
                    movimientoPeon();
                    break;
                case "A":
                    movimientoAlfil();
                    break;
                case "T":
                    movimientoTorre();
                    break;
                case "C":
                    movimientoCaballo(posicion());
                    break;
                case "D":
                    movimientoReina(posicion());
                    break;
                case "R":
                    movimientoRey(posicion());
                    break;
                default:
                    System.out.println("No has escogido una de las letras correctas.");
                    System.out.println();
            }
        }

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

    public static String colorPieza (){
        Scanner sc=new Scanner(System.in);
        boolean boo=true;
        String COMOquiero;
        do {
            System.out.println("B-> Blanco");
            System.out.println("N-> Negro");
            System.out.println("Escoge un color (solo blanco y negro): ");
            String colorPieza = sc.nextLine();
            COMOquiero=colorPieza.toUpperCase();
            if (!COMOquiero.equals("B") && !COMOquiero.equals("N")){
                System.out.println("Escoge una letra correcta");
                System.out.println(" ");
                boo=true;
            }else if (COMOquiero.equals("B")){
                System.out.println("Has escogido las blancas");
                System.out.println(" ");
                boo=false;
            }else if (COMOquiero.equals("N")){
                System.out.println("Has escogido las negras");
                System.out.println(" ");
                boo=false;
            }
        }while (boo);
        return COMOquiero;
    }

    public static int movimientoPeon () {
        int posicion=0;
        String color=colorPieza();
        String posicionPeon=posicion();
        if (color.equals("B")){
            char letra=posicionPeon.charAt(0);
            char num=posicionPeon.charAt(1);
            int nume =Character.getNumericValue(num);
            int valo2=num+1;
            int hola = Character.getNumericValue(valo2);
            if (nume == 2){
                System.out.println("Puede moverse a " + letra+(hola) + " y " + letra+(hola+1));
            } else if (nume==1) {
                System.out.println("Posición incorrecta, el peón blanco nunca puede estar en la fila 1");
            }else if (nume==7) {
                System.out.println("Avanza a "+ ""+letra+hola);
                System.out.println("El peón llega a la última casilla y se transforma en Dama");
            }else if (nume>=8) {
                System.out.println("El peón no puede hacer el siguiente movimiento porque se sale del tablero");
            }else {
                System.out.println("Puede moverse a "+"" + letra + hola);
            }
        }
        if (color.equals("N")){
            char letra=posicionPeon.charAt(0);
            char num=posicionPeon.charAt(1);
            int hola2 =Character.getNumericValue(num);
            int valo2=num-1;
            int hola = Character.getNumericValue(valo2);
            if (hola2 == 7){
                System.out.println("Puede moverse a " + letra+(hola) + " y " + letra+(hola-1));
            } else if (hola2==8) {
                System.out.println("Posición incorrecta, el peón negro nunca puede estar en la fila 8");
            }else if (hola2==2){
                System.out.println("Avanza a "+ ""+letra+hola);
                System.out.println("El peón llega a la última cassilla y se transforma en Dama");
            }else if (hola2<=1){
                System.out.println("El peón no puede hacer el siguiente movimiento porque se sale del tablero");
            }else {
                System.out.println("Puede moverse a "+ ""+letra+hola);
            }
        }
        return posicion;
    }

    public static String movimientoAlfil () {
        String colorTorre=colorPieza();
        String posicionTorre=posicion();
        char letra=posicionTorre.charAt(0);
        char num=posicionTorre.charAt(1);
        int nume =Character.getNumericValue(num);
        for (int i=0;i<letras.length;i++){
            
        }
        return " ";
    }

    public static String movimientoTorre () {
        String colorTorre=colorPieza();
        String posicionTorre=posicion();
        char letra=posicionTorre.charAt(0);
        char num=posicionTorre.charAt(1);
        int nume =Character.getNumericValue(num);
        System.out.print("La torre se puede mover a: ");
        for (int i=0;i< letras.length;i++){
            if (letra!=letras[i]){
                System.out.print(" "+letras[i]+num+ " ");
            }
        }
        for (int j=0;j<numeros.length;j++){
            if (nume!=numeros[j]){
                System.out.print(" "+letra+numeros[j]+" ");
            }
        }
        System.out.println();
        return " ";
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
