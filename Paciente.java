import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String sintoma;
    private String prioridad;    


    public static  ArrayList<String[]> leer(String archivo) throws IOException {
        String cadena;

        FileReader f = new FileReader("Pacientes.txt"); //abre el archivo
        BufferedReader b = new BufferedReader(f); // lee el archivo
        ArrayList<String[]> Pacientes = new ArrayList<String[]>();
    
        while((cadena = b.readLine())!=null) { // Para separar en comas
            String[] parts = cadena.split(",");
            Pacientes.add(parts);
        }
        b.close();
        return Pacientes;
    }

    /**
     * Getter de nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter de prioridad
     * @return
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Getter de sintomas
     * @return
     */
    public String getSintoma() {
        return sintoma;
    }

    @Override
    public int compareTo(Paciente that) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
