package Paquete04;

import java.util.Scanner;

public class Funcionnes {

    public static String crearFacebook() {
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        String nombre;
        int edad;
        String ciudad;
        String pais;
        String correo;

        System.out.println("Ingrese su nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        mensaje = String.format("Usuario registrado en Facebook con los "
                + "siguientes datos:\n"
                + "Nombre de usuario: %s\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n"
                + "Correo electrónico: %s\n",
                nombre,
                edad,
                ciudad,
                pais,
                correo);
        return mensaje;
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int edad;
        String ciudad;
        String pais;
        int telefono;

        System.out.println("Ingrese su nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();

        mensaje = String.format("Usuario registrado en Whatsapp con los "
                + "siguientes datos:\n"
                + "Nombre de usuario: %s\n"
                + "Número de teléfono: %d\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n",
                nombre,
                telefono,
                edad,
                ciudad,
                pais);
        return mensaje;
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String nombre;
        int edad;
        String ciudad;
        String pais;
        int telefono;
        String hobby;

        System.out.println("Ingrese su nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su número de teléfono:");
        telefono = entrada.nextInt();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su hobby principal:");
        hobby = entrada.nextLine();

        mensaje = String.format("Usuario registrado en Signal con los siguientes"
                + "datos:\n"
                + "Nombre de usuario: %s\n"
                + "Número de teléfono: %d\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n"
                + "Hobby principal: %s\n",
                nombre,
                telefono,
                edad,
                ciudad,
                pais,
                hobby);
        return mensaje;

    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String mensaje;
        String correo;
        String nombre;

        System.out.println("Ingrese su nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        mensaje = String.format("Usuario registrado en Flickr con los siguientes"
                + " datos:\n"
                + "Nombre de usuario: %s\n"
                + "Correo electrónico: %s\n",
                nombre,
                correo);
        return mensaje;
    }
}
