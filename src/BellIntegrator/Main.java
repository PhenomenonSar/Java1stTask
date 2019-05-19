package BellIntegrator;

public class Main {

    public static void main(String[] args) {

        Car lada = new Car("Лада",1080.0F , 89.0F);
        Lorry kamaz = new Lorry("КамАЗ",8410.0F , 220.0F,6000.0F);
        lada.displayCharacteristics();
        lada.setBrand("Ладища");
        lada.setPower(1000.0F);
        lada.displayCharacteristics();
        kamaz.displayCharacteristics();
        kamaz.setBrand("Камазик");
        kamaz.setLoadСapacity(520.0F);
        kamaz.displayCharacteristics();

    }
}
