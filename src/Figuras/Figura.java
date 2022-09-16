package Figuras;

public abstract class Figura {
    private int lados;
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura{}";
    }
}
