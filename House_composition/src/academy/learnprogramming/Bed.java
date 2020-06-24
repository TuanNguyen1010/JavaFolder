package academy.learnprogramming;

public class Bed {
    private String model;
    private String material;
    private Dimension dimension;

    public Bed(String model, String material, Dimension dimension) {
        this.model = model;
        this.material = material;
        this.dimension = dimension;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
