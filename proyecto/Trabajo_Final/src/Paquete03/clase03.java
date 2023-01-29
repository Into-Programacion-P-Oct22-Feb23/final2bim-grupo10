package Paquete03;

import java.util.Scanner;
import paquete01.obtenerFunciones;
import paquete02.obtenerProcedimientos;
import paquete03.obtenerMensaje;

public class clase03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        boolean bandera = true;
        int contador = 0;
        int opcionDos;
        String mensaje;

        while (bandera) {
            contador++;
            System.out.printf("Ingrese 1 para crear una cuenta en Facebook\n"
                    + "Ingrese 2 para crear una cuenta en Twitter\n"
                    + "Ingrese 3 para crear una cuenta en Whatsapp\n"
                    + "Ingrese 4 para crear una cuenta en Telegram\n"
                    + "Ingrese 5 para crear una cuenta en Signal\n"
                    + "Ingrese 6 para crear una cuenta en Instagram\n"
                    + "Ingrese 7 para crear una cuenta en Flickr\n");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                mensaje = obtenerFunciones.crearFacebook();
                System.out.println(mensaje);
            } else if (opcion == 2) {
                obtenerProcedimientos.crearTwitter();
            } else if (opcion == 3) {
                mensaje = obtenerFunciones.crearWhatsapp();
                System.out.println(mensaje);
            } else if (opcion == 4) {
                obtenerProcedimientos.crearTelegram();
            } else if (opcion == 5) {
                mensaje = obtenerFunciones.crearSignal();
                System.out.println(mensaje);
            } else if (opcion == 6) {
                obtenerProcedimientos.crearInstagram();
            } else if (opcion == 7) {
                mensaje = obtenerFunciones.crearFlickr();
                System.out.println(mensaje);
            } else {
                System.out.println("Error, esa opción no existe.");
                contador = 0;
            }

            System.out.println("Ingrese 1 para salir, de lo contrario 2.");
            opcionDos = entrada.nextInt();

            if (opcionDos == 1) {
                bandera = false;
            }
        }
        if (contador > 0) {
            mensaje = obtenerMensaje.obtenerCadena(contador);
            System.out.printf("Con número de cuentas %d es: %s",
                    contador, mensaje);
        }else{
            mensaje = obtenerMensaje.obtenerCadena(0);
            System.out.printf("Con número de cuentas 0 es: %s",
                    mensaje);
        }

    }

}
