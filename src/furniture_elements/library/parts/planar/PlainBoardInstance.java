package furniture_elements.library.parts.planar;

import furniture_elements.library.materials.edgebanding.Edgeband;
import furniture_elements.library.materials.wooden_materials.UniverInstanceOne;

public class PlainBoardInstance {
    private float width;
    private float length;
    private float thickness;
    private UniverInstanceOne material;
    private Edgeband edge1;
    private Edgeband edge2;
    private Edgeband edge3;
    private Edgeband edge4;
    private float price;
    private Hole[] holes;
    private String nameOfBoard;
    private String description;

    public Hole[] getHoles() {
        return holes;
    }

    public void setHoles(Hole[] holes) {
        this.holes = holes;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Edgeband getEdge1() {
        return edge1;
    }

    public Edgeband getEdge2() {
        return edge2;
    }

    public Edgeband getEdge3() {
        return edge3;
    }

    public Edgeband getEdge4() {
        return edge4;
    }

    public void setEdge1(Edgeband edge1) {
        this.edge1 = edge1;
    }

    public void setEdge2(Edgeband edge2) {
        this.edge2 = edge2;
    }

    public void setEdge3(Edgeband edge3) {
        this.edge3 = edge3;
    }

    public void setEdge4(Edgeband edge4) {
        this.edge4 = edge4;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public UniverInstanceOne getMaterial() {
        return material;
    }

    public void setMaterial(UniverInstanceOne material) {
        this.material = material;
    }

    public float getArea() {
        float area;
        area = width * length;
        return area;
    }

}
