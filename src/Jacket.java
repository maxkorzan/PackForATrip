public class Jacket extends Clothes {
    //VARIABLES
    private String name;
    private String color;
    private String material;

    //CONSTRUCTORS
    public Jacket(){
    }
    public Jacket(String name, String color, String material) {
        this.name = name;
        this.color = color;
        this.material = material;
    }

    @Override
    public String toString(){
        return this.name+this.color+this.material;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
