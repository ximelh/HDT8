public class Paciente implements Comparable<Paciente>{

    private String nombre;
    private String padecimiento;
    private String prioridad;
    

    public Paciente(String nom, String pad, String cod){
        this.setNombre(nom);
        this.setPadecimiento(pad);
        this.setPrioridad(prioridad);
    }

    public int compareTo(Paciente otro){
        return this.prioridad.compareTo(otro.getPrioridad());
    }

    public String toString(){
        return this.nombre + ", "+this.padecimiento +", "+this.prioridad;
    }

    public String getNombre() {
        return nombre;
    }
    public String getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    public String getPadecimiento() {
        return padecimiento;
    }
    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
