class Carro {
    // Atributos da classe
    private String marca;
    private String modelo;
    private int anoFabr;
    private String cor;
    private int velocAtual;

    Carro(String marca, String modelo, int anoFabr, String cor, int velocAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabr = anoFabr;
        this.cor = cor;
        this.velocAtual = velocAtual;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAnoFabr(){
        return anoFabr;
    }

    public String getCor(){
        return cor;
    }

    public int getVelocAtual(){
        return velocAtual;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // Criando um objeto da classe Carro chamado "carro1"
        Carro carro1 = new Carro("BYD", "Seal", 2022, "Branco", 220);
        
        // Usando os métodos getters para obter e imprimir as informações do carro
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano de Fabricação: " + carro1.getAnoFabr());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Velocidade Atual: " + carro1.getVelocAtual());
    }
}
