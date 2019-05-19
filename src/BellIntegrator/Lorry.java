package BellIntegrator;

public class Lorry extends Car {

    private float loadCapacity;
    public float getLoadCapacity() {return loadCapacity;}

    public Lorry(String brand,float weight,float power,float loadCapacity){
        super(brand,weight,power);
        this.loadCapacity = loadCapacity;
    }
    public void setLoadCapacity(float newLoadCapacity){
        if(newLoadCapacity>0){
            this.loadCapacity = newLoadCapacity;
        }
        else {
            System.out.println("Некорректное значение грузоподъемности!");
        }
    }
    @Override
    public void setBrand(String newBrand){
        if(newBrand.length()!= 0){
            this.brand="Грузовик "+newBrand;
        }
        else {
            System.out.println("Некорректное значение марки грузовика!");
        }
    }
    @Override
    public void displayCharacteristics(){
        super.displayCharacteristics();
        System.out.println("Грузоподъемность(кг):"+ loadCapacity);
    }

}
