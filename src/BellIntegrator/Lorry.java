package BellIntegrator;

public class Lorry extends Car {

    private float loadСapacity;
    public float getLoadСapacity() {return loadСapacity;}

    public Lorry(String brand,float weight,float power,float loadСapacity){
        super(brand,weight,power);
        this.loadСapacity=loadСapacity;
    }
    public void setLoadСapacity(float newLoadCapacity){
        if(newLoadCapacity>0){
            this.loadСapacity = newLoadCapacity;
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
        System.out.println("Грузоподъемность(кг):"+loadСapacity);
    }

}
