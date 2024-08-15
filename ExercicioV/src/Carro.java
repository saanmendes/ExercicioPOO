public class Carro extends Veiculo {
    private int numeroDePortas;
    private String motor;

    //Metodo construdor
    public Carro(String marca, String modelo, int ano, int numeroDePortas, String motor){
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
        this.motor = motor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("marca é ").append(getMarca());
        sb.append(", modelo ").append(getModelo());
        sb.append(", ano ").append(getAno());
        sb.append(", total de portas é ").append(numeroDePortas);
        sb.append(", potencia e tipo = ").append(motor);
        return sb.toString();
    }
}

