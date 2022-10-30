package furniture_elements.library.materials.edgebanding;

public class Edgeband {
    private float thickness;
    private EdgebandMaterial edgebandMaterial;

    public Edgeband(float thickness, EdgebandMaterial edgebandMaterial) {
        this.thickness = thickness;
        this.edgebandMaterial = edgebandMaterial;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    public EdgebandMaterial getEdgebandMaterial() {
        return edgebandMaterial;
    }

    public void setEdgebandMaterial(EdgebandMaterial edgebandMaterial) {
        this.edgebandMaterial = edgebandMaterial;
    }
}
