package Figuras;

public class ErroresArchivo {
    public static void main(String[] args) {
        int Cifra1=5;
        int Cifra2=0;
        try{
            int div=Cifra1/Cifra2;
        }catch (ArithmeticException e){

        }
        System.out.println(" La division no es posible entre 0 vuelve a intententar con otro");
    }
}
