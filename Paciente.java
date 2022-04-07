public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private String sintoma;
    private String prioridad;    


    Pacie

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
