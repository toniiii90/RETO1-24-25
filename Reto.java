import java.util.Scanner;

public class Reto {
        public static void main(String[] args) {

            System.out.println("|--------------------------------------|");
            System.out.println("|      BIENVENIDO/A AL RETO 1 DEL      |");
            System.out.println("|       EQUIPO SÓLIDO FORMADO POR      |");
            System.out.println("|         RAÚL, ADRIAN G, DAVID,       |");
            System.out.println("|        ANTONIO G Y JUAN CARLOS       |");
            System.out.println("|--------------------------------------|");

            Scanner sc = new Scanner(System.in);
            //String [][] arrayTablero = new String [8][8];

            String [] ArrayLetra={"a","b","c","d","e","f","g","h"};
            int [] ArrayNum={1,2,3,4,5,6,7,8};
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

                System.out.println("Indica la posición: ");
                String posicionPieza = sc.nextLine();


                switch (elegirPieza.toUpperCase()) {
                    case "S":
                        System.out.println("Saliendo del programa en 3, 2, 1...");
                        System.out.println("Hasta la próxima! \uD83D\uDC4B");
                        salirBucle = true;
                        break;
                    case "P":
                        movimientoPeon(posicionPieza);
                        break;
                    case "A":
                        movimientoAlfil(posicionPieza);
                        break;
                    case "T":
                        movimientoTorre(posicionPieza);
                        break;
                    case "C":
                        movimientoCaballo(posicionPieza);
                        break;
                    case "D":
                        movimientoReina(posicionPieza);
                        break;
                    case "R":
                        movimientoRey(posicionPieza);
                        break;
                    default:
                        System.out.println("No has escogido una de las letras correctas.");
                        System.out.println();
                }
            }
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
                }else {
                    boo=false;
                    System.out.println("Has escogido la " + colorPieza);
                    System.out.println(" ");
                }
            }while (boo);
        return COMOquiero;
        }

        public static String movimientoPeon (String posicion) {
           if (colorPieza().equals("B")){

           }else if (colorPieza().equals("N")){

           }
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

        public static boolean validarPosición (String posicion) {
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

