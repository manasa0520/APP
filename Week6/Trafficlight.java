package Week6;
public class Trafficlight {
    private String color_010;
    public Trafficlight(String initialColor, int initialDuration) {
        color_010 = initialColor;

    }
    public String getColor_010() {
        return color_010;
    }
    public void changeColor_010(String newColor, int newDuration) {
        color_010 = newColor;
    }
    public boolean isRed_010() {
        return color_010.equalsIgnoreCase("red");
    }
    public boolean isGreen_010() {
        return color_010.equalsIgnoreCase("green");
    }
     public static void main(String[] args) {
        Trafficlight trafficLight = new Trafficlight("red", 60);
        System.out.println("Current color: " + trafficLight.getColor_010());
        System.out.println("Is it red? " + trafficLight.isRed_010());
        System.out.println("Is it green? " + trafficLight.isGreen_010());
        trafficLight.changeColor_010("green", 45);
        System.out.println("\nUpdated color: " + trafficLight.getColor_010());
        System.out.println("Is it red? " + trafficLight.isRed_010());
        System.out.println("Is it green? " + trafficLight.isGreen_010());
    }
}
