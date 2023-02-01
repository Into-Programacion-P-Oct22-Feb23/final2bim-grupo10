package paquete02;

import java.util.Scanner;

public class Procedimientos {
    
    public static void crearTwitter(){
        Scanner entrada = new Scanner(System.in);
        String usuario;
        String nombre;
        String apellido;
        int edad;
        String ciudad;
        String pais;
        String correo;
        String idioma;

        System.out.println("Ingrese su nombre de usuario:");
        usuario = entrada.nextLine();
        System.out.println("Ingrese sus nombres:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su país:");
        pais = entrada.nextLine();
        System.out.println("Ingrese su idioma:");
        idioma = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        System.out.printf("Usuario registrado con los siguientes datos:\n"
                + "Nombre de usuario: %s\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n"
                + "Idioma: %s\n"
                + "Correo electrónico: %s\n", usuario, 
                nombre, 
                apellido, 
                edad, 
                ciudad,
                pais, 
                idioma, 
                correo);
    }
    
    public static void crearTelegram(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String pais;
        int telefono;
        String interes;

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
        System.out.println("Ingrese su área de interés:");
        interes = entrada.nextLine();

        System.out.printf("Usuario registrado con los siguientes datos:\n"
                + "Nombre de usuario: %s\n"
                + "Número de teléfono: %d\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "País: %s\n"
                + "Área de interés: %s\n", 
                nombre, 
                telefono,
                edad, 
                ciudad, 
                pais, 
                interes);
    }
    
    public static void crearInstagram(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String ciudad;
        String correo;

        System.out.println("Ingrese su nombre de usuario:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese su correo electrónico:");
        correo = entrada.nextLine();

        System.out.printf("Usuario registrado con los siguientes datos:\n"
                + "Nombre de usuario: %s\n"
                + "Edad: %d\n"
                + "Ciudad: %s\n"
                + "Correo electrónico: %s\n", 
                nombre,
                edad, 
                ciudad, 
                correo);
    }
}
