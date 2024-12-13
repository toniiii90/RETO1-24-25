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
                        movimientoAlfil(posicion());
                        break;
                    case "T":
                        movimientoTorre(posicion());
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
                }else {
                    System.out.println("Has escogido la " + colorPieza);
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
                }else {
                System.out.println("Puede moverse a "+ ""+letra+hola);
                }
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

