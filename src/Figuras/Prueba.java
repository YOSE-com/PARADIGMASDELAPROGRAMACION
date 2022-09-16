package Figuras;

public class Prueba {
        public static void main(String[] args) {
            Figura[] figs=new Figura[3];
            figs[0]=new Cuadrado(6);
            figs[1]=new Triangulo(9,4,4);
            figs[2]=new Cuadrado(5);

            for(Figura fg:figs){
                System.out.println(fg.toString());
            }
        }
}

