package Figuras;

import java.util.Scanner;



public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner((System.in));
        Figura [ ] figuras=new Figura[3];
        int opcion;
        do  {
            menu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    int opcionF;
                    double lado;
                    System.out.print("Ingrese el lado: ");
                    lado = entrada.nextDouble();
                    figuras[0]=new Cuadrado (lado) ;
                    System.out.println("Selecciona uno: ");
                    System.out.println("1. Area");
                    System.out.println("2. Perimetro:");
                    opcionF =entrada.nextInt();
                    if (opcionF==1) {
                        System.out.println(figuras[0].calcularArea());
                    }
                    if (opcionF==2) {
                        System.out.println(figuras[0].calcularPerimetro());
                    }
                    break;
                case 2:
                    System.out.println("Ingrese los lados: ") ;
                    double lado1, lado2, lado3;
                    System.out.print("Lado1: ");
                    lado1= entrada.nextDouble();
                    System.out.print("Lado2: ");
                    lado2= entrada.nextDouble();
                    System.out.print("Lado3: ");
                    lado3= entrada.nextDouble();
                    figuras[1]=new Triangulo(lado1, lado2, lado3) ;
                    System.out.println("Selecciona uno: ");
                    System.out.println("1.  Area");
                    System.out.println("2. Perimetro:");
                    opcionF = entrada.nextInt();
                    if(opcionF==1){
                        System.out.println(figuras[1].calcularArea());
                    }else {
                        System.out.println(figuras[1].calcularPerimetro());
                    }
                    break;
                case 3:
                    System.out.println("SALIR");
                    break;
                default:
                    System.out.println("NO VALIDO") ;
                    break;
            }
        } while (opcion != 3);
    }
    private static void menu() {
        System.out.println();
        System.out.println("Selecciona una figura");
        System.out.println("1. Cuadrado") ;
        System.out.println("2. Triangulo");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");
    }
}