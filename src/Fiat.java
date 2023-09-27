
public class Fiat extends Carro {
    private int velocidade;

    public Fiat(int ano, double valor, String cor, int portas, int velocidade) {
        super("Fiat", ano, valor, cor, portas, velocidade);
        this.velocidade = 3;
    }

    @Override
    public void ligarMotor() {
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        if (velocidade >= 6) {
            velocidade -= 6;
        } else {
            velocidade = 0;
        }
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void acelerar() {
        velocidade += 12;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }
}
