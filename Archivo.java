
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Archivo {
    public VectorHeap<Paciente> pac() throws IOException{
        VectorHeap<Paciente> p =  new VectorHeap<Paciente>();
        String cadena;

        FileReader f = new FileReader("Pacientes.txt"); //abre el archivo
        BufferedReader b = new BufferedReader(f); // lee el archivo
        while((cadena = b.readLine())!=null) { // Para separar con espacios
            String[] parts = cadena.split(" ");
            p.add(new Paciente(parts[0],parts[1],parts[2].replaceAll(" ","")));   
        }
        b.close();
        return p;
    }
}