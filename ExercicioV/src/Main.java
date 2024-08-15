public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyata", "Corolla",2024, 4, "169, gasolina");
        Carro carro2 = new Carro("Ford", "Mustang",2024, 2, "450, gasolina");

        Moto moto = new Moto("Harley-Davidson","Street Glide", 2024, "Ape hanger", "114, etanol");
        Moto moto2 = new Moto("Kawasaki","Vulcan", 2024, "Guidao reto", "88, etanol");

        System.out.println("Dados do primeiro carro: " +carro +"\n");
        System.out.println("Dados do segundo carro: " +carro2 +"\n");
        System.out.println("Dados da primeiro moto: " +moto +"\n");
        System.out.println("Dados da segunda moto: " +moto2 +"\n");



    }
}