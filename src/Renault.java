
public class Renault extends Carro {
    private int velocidade;

    public Renault(int ano, double valor, String cor, int portas, int velocidade) {
        super("Renault", ano, valor, cor, portas, velocidade);
        this.velocidade = 0;
    }

    @Override
    public void ligarMotor() {
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        if (velocidade >= 5) {
            velocidade -= 5;
        } else {
            velocidade = 0;
        }
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }
}
