public interface IntAlumno2 {
    void mostrarGrado();
    int obtenerAnnosdeCarrera();
    public abstract void entrarCurso();
    default void mostrarHorario(){
        System.out.println("horario corrido");
    }
}