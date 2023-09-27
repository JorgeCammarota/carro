public class Hyundai extends Carro {
    private int velocidade;  // Adicionamos um campo de velocidade específico para o Hyundai

    public Hyundai(int ano, double valor, String cor, int portas, int velocidade) {
        super("Hyundai", ano, valor, cor, portas, velocidade);
        this.velocidade = 5;  // Inicializa a velocidade como 5 km/h ao criar um Hyundai
    }

    @Override
    public void ligarMotor() {
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        if (velocidade >= 2) {
            velocidade -= 2;
        } else {
            velocidade = 0;
        }
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void acelerar() {
        velocidade += 15;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }
}