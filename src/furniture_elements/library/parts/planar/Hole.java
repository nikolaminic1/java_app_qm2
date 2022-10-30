package furniture_elements.library.parts.planar;

public class Hole {
    private float xPosition;
    private float yPosition;
    private float depth;
    private float diameter;
    private float priceOfDrilling;
    private String description;
    private String typeOfHole;

    public Hole(float depth, float diameter) {
        this.depth = depth;
        this.diameter = diameter;
    }

    public float getxPosition() {
        return xPosition;
    }

    public void setxPosition(float xPosition) {
        this.xPosition = xPosition;
    }

    public float getyPosition() {
        return yPosition;
    }

    public void setyPosition(float yPosition) {
        this.yPosition = yPosition;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }
}
