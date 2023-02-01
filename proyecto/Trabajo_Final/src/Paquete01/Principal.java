package Paquete01;

import Paquete04.Funcionnes;
import static Paquete04.Funcionnes.crearFacebook;
import java.util.Scanner;
import paquete02.Procedimientos;
import paquete03.Mensaje;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion;
        boolean bandera = true;
        int contador = 0;
        String opcionDos;
        String mensaje = "";

        while (bandera) {
            contador++;
            System.out.printf("Ingrese:\n"
                    + "1 para crear una cuenta en Facebook\n"
                    + "2 para crear una cuenta en Twitter\n"
                    + "3 para crear una cuenta en Whatsapp\n"
                    + "4 para crear una cuenta en Telegram\n"
                    + "5 para crear una cuenta en Signal\n"
                    + "6 para crear una cuenta en Instagram\n"
                    + "7 para crear una cuenta en Flickr\n");
            opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
                mensaje = mensaje + Funcionnes.crearFacebook();
                System.out.println(mensaje);
            } else {
                if (opcion == 2) {
                    Procedimientos.crearTwitter();
                } else {
                    if (opcion == 3) {
                        mensaje = mensaje + Funcionnes.crearWhatsapp();
                        System.out.println(mensaje);
                    } else {
                        if (opcion == 4) {
                            Procedimientos.crearTelegram();
                        } else {
                            if (opcion == 5) {
                                mensaje = mensaje + Funcionnes.crearSignal();
                                System.out.println(mensaje);
                            } else {
                                if (opcion == 6) {
                                    Procedimientos.crearInstagram();
                                } else {
                                    if (opcion == 7) {
                                        mensaje = mensaje + Funcionnes.crearFlickr();
                                        System.out.println(mensaje);
                                    } else {
                                        System.out.println("Erro en la opcion "
                                                + "seleccionada");
                                        contador = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("Si dese terminar el porceso presione s");
            opcionDos = entrada.nextLine();

            if ("s".equals(opcionDos)) {
                bandera = false;
            }
        }

        if (contador > 0) {
            mensaje = Mensaje.obtenerCadena(contador);
            System.out.printf("Proceso terminado con %d cuentas creadas, "
                    + "usted tuvo %s",
                    contador,
                    mensaje);
        } else {
            mensaje = Mensaje.obtenerCadena(0);
            System.out.println("Ustede no tuvo cuentas creadas");
        }

    }

}
