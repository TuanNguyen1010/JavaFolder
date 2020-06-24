package academy.learnprogramming;

public class Sofa {
    private String model;
    private Dimension dimension;
    private String material;

    public Sofa(String model, Dimension dimension, String material) {
        this.model = model;
        this.dimension = dimension;
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getMaterial() {
        return material;
    }
}
