public class Moto extends Veiculo {
    private String tipoDeGuidao;
    private String motor;

    public Moto( String marca, String modelo, int ano,String tipoDeGuidao, String motor){
        super(marca, modelo, ano);
        this.tipoDeGuidao =  tipoDeGuidao;
        this.motor = motor;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("marca é ").append(getMarca());
        sb.append(", modelo ").append(getModelo());
        sb.append(", ano ").append(getAno());
        sb.append(", tipo do guidao é ").append(tipoDeGuidao);
        sb.append(", potencia e tipo = ").append(motor);
        return sb.toString();
    }
}