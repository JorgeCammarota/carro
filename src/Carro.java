public class Carro {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    private int velocidade;

    public Carro(String marca, int ano, double valor, String cor, int portas, int velocidade) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = velocidade;
    }

    public void ligarMotor() {
        System.out.println("O motor do carro da marca " + marca + " foi ligado.");
    }

    public void frear() {
        System.out.println("O carro da marca " + marca + " freou.");
    }

    public void acelerar() {
        System.out.println("O carro da marca " + marca + " acelerou.");
    }
}