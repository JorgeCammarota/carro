public class Main {
    public static void main(String[] args) {
        // Exemplo de carros de cada marca
        Renault renaultCar = new Renault(2020, 30000.0, "Prata", 4, 0);
        Fiat fiatCar = new Fiat(2019, 25000.0, "Vermelho", 4, 3);
        Hyundai hyundaiCar = new Hyundai(2021, 35000.0, "Azul", 5, 5);

        // Demonstrar o comportamento dos carros
        renaultCar.ligarMotor();
        renaultCar.acelerar();
        renaultCar.frear();

        fiatCar.ligarMotor();
        fiatCar.acelerar();
        fiatCar.frear();

        hyundaiCar.ligarMotor();
        hyundaiCar.acelerar();
        hyundaiCar.frear();
    }
}