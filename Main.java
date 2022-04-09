/**
 * Main.java
 * @since 4/5/22
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido a la simulación de hostital\n ");
        System.out.println("Seleccione el número de la opción que desea realizar");

            int opcion = 5;
            while (opcion > 3){
            	System.out.println("1. Llenar ficha de ingreso de un paciente.");
            	System.out.println("2. Mostrar cola de pacientes.");
            	System.out.println("3. Mostrar siguiente paciente.");
                scan = new Scanner(System.in);
            	try{opcion = scan.nextInt();}
            	catch(Exception e){System.out.println("INVALIDO");}

            	if (opcion == 1){
                    Ingreso();}
            	else if (opcion == 2){

                } 
            	else if (opcion == 3){

                }
                else if(opcion == 4) {
                    System.exit(0);
                }
                else{ System.out.println("Agregue una entrada valida del menu");}
            }

        
    }
/**
 * Método que permite ingresar la ficha de otro paciente
 * @throws IOException
 */
    public static void Ingreso() throws IOException{
        String s = System.lineSeparator();
        String nombre;
        String padecimiento;
        String prioridad;

        Scanner scan = new Scanner(System.in);


        System.out.println("Ingrese el nombre del paciente"); // Recibe el nombre del paciente
        nombre = scan.nextLine();
        
        System.out.println("Ingrese el padecimiento del paciente"); //Recibe el padecimiento
        padecimiento = scan.nextLine();

        System.out.println("Ingrese la prioridad para atender al paciente, una letra de la A a la E."); //Recibe la prioridad
        prioridad = scan.nextLine();



        Writer output;
        output = new BufferedWriter(new FileWriter("Pacientes.txt", true)); //Ingresa la ficha del paciente al archivo txt
        output.append(s + nombre+", "+padecimiento+", "+prioridad);
        output.close();
    }
}
