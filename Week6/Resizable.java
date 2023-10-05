package Week6;
interface Resizable {
    void resizeWidth(int width_010);
    void resizeHeight(int height_010);
}
class Rectangle_010 implements Resizable {
    private int width_010;
    private int height_010;
    public Rectangle_010(int width_010, int height_010) {
        this.width_010 = width_010;
        this.height_010 = height_010;
    }
    @Override
    public void resizeWidth(int width_010) {
        this.width_010 = width_010;
    }
    @Override
    public void resizeHeight(int height_010) {
        this.height_010 = height_010;
    }
    public void display() {
        System.out.println("Width: " + width_010);
        System.out.println("Height: " + height_010);
    }
    public static void main(String[] args) {
        Rectangle_010 rectangle = new Rectangle_010(10, 5);
        System.out.println("Original Rectangle:");
        rectangle.display();
        rectangle.resizeWidth(15);
        rectangle.resizeHeight(8);
        System.out.println("\nResized Rectangle:");
        rectangle.display();
    }
}

