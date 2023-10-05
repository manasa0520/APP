package Week6;
interface Flyable {
    void fly_obj_010();
}
class Spacecraft_010 implements Flyable {
    private String name_010;
    public Spacecraft_010(String name_010) {
        this.name_010 = name_010;
    }
    @Override
    public void fly_obj_010() {
        System.out.println(name_010 + " is flying in space.");
    }
}
class Airplane_010 implements Flyable {
    private String model_010;
    public Airplane_010(String model_010) {
        this.model_010 = model_010;
    }
    @Override
    public void fly_obj_010() {
        System.out.println(model_010 + " is flying in the sky.");
    }
}
    class Helicopter_010 implements Flyable {
    private String brand_010;
    public Helicopter_010(String brand_010) {
        this.brand_010 = brand_010;
    }
    @Override
    public void fly_obj_010() {
        System.out.println(brand_010 + " is flying in the air.");
    }
    public static void main(String[] args) {
        Spacecraft_010 spacecraft = new Spacecraft_010("Voyager");
        Airplane_010 airplane = new Airplane_010("Boeing 747");
        Helicopter_010 helicopter = new Helicopter_010("Apache");
        spacecraft.fly_obj_010();
        airplane.fly_obj_010();
        helicopter.fly_obj_010();
    }
}

