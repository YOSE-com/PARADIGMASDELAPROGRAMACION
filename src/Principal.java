public class Principal {
    public static void main(String[] args) {
        Persona p1=new Persona("Maria",12,"F","jocotitlan");
        Estudiante e1=new Estudiante("juan",17,"M","atlacomulco","0123","paradigmas","B+");
        Estudiante e2=new Estudiante();
        e1.mostrarInfo();
        p1.mostrarInfo();



    }
}