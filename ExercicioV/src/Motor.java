public class Motor {
    private double potencia;
    private String tipo;

    public Motor(double potencia, String tipo){
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", tipo=" + tipo +
                '}';
    }
}
