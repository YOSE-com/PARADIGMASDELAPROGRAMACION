package Figuras;

public class Cuadrado extends Figura{
    private double lado1;

    public Cuadrado(double lado1) {
        this.lado1 = lado1;
    }

    @Override
    public double calcularArea() {
        return lado1*lado1;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado1;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado1=" + lado1 +
                ", Area=" + calcularArea() +
                ", Perimetro=" + calcularPerimetro() +
                '}';
    }
}

