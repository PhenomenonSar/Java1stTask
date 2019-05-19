package BellIntegrator;

public class Car {

    protected String brand;
    private float weight;
    private float power;
    public String getBrand() {return brand;}
    public float getWeight() {return weight;}
    public float getPower() {return power;}

    public Car(String brand,float weight,float power){
        this.brand=brand;
        this.weight=weight;
        this.power=power;
    }
    public void setPower(float newPower){
        if(newPower>0){
            power = newPower;
        }
        else {
            System.out.println("Некорректное значение мощности!");
        }
    }
    public void setBrand(String newBrand){
        if(newBrand!=""){
            brand = newBrand;
        }
        else {
            System.out.println("Некорректное значение марки автомобиля!");
        }
    }
    public void displayCharacteristics(){
        System.out.println("Марка:"+brand+"; Вес(кг):"+weight+"; Мощность(л.с.):"+power);
    }

}
