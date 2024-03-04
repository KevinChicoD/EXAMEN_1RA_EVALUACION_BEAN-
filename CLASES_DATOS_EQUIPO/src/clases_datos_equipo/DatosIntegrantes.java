/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases_datos_equipo;

/**
 *
 * @author ihdzg
 */
public class DatosIntegrantes {
    private static String noControl1 = "23550366";
    private static String apellidos1 = "Hernandez Garcia";
    private static String nombres1 = "Ivan";
    private static String carrera1 = "Ingenieria en Sistemas Computacionales";
    
    private static String noControl2 = "23550365";
    private static String apellidos2 = "Chico Diaz";
    private static String nombres2 = "Kevin Rene";
    private static String carrera2 = "Ingenieria en Sistemas Computacionales";
    
    private static String noControl3 = "22540562";
    private static String apellidos3 = "Cano Villa";
    private static String nombres3 = "Diego Alfonso";
    private static String carrera3 = "Ingenieria en Sistemas Computacionales";
    
    private static String noControl4 = "23550419";
    private static String apellidos4 = "Hernandez Granados";
    private static String nombres4 = "Jorge Alejandro";
    private static String carrera4 = "Ingenieria en Sistemas Computacionales";
    
    private static String eqname = "BING$";
    
    
    public static void imprimirDtosEquipo(){
        System.out.println("Dtos del equipo: " + eqname);
        System.out.println("Integrante 1: " + nombres1 + " " + apellidos1 + ", Numero de control: " + noControl1 + ", Carrera: " + carrera1);
        System.out.println("Integrante 2: " + nombres2 + " " + apellidos2 + ", Numero de control: " + noControl2 + ", Carrera: " + carrera2);
        System.out.println("Integrante 3: " + nombres3 + " " + apellidos3 + ", Numero de control: " + noControl3 + ", Carrera: " + carrera3);
        System.out.println("Integrante 4: " + nombres4 + " " + apellidos4 + ", Numero de control: " + noControl4 + ", Carrera: " + carrera4);
    }
    
    public static void imprimirProblemas(){
        System.out.println("Problemas resueltos:");
        System.out.println("CLASE DATOS DEL EQUIPO");
        System.out.println("CLASE CONTRASEÑA");
        System.out.println("CLASE TEST COVID");
        System.out.println("FIBONACCI");
    }
}
