package furniture_elements.library.materials.wooden_materials;

public class UniverInstanceOne {

    private String materialName;
    private float materialPrice;

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public float getMaterialPrice() {
        return materialPrice;
    }

    public void setMaterialPrice(float materialPrice) {
        this.materialPrice = materialPrice;
    }

    public UniverInstanceOne(String materialName, float materialPrice) {
        this.materialName = materialName;
        this.materialPrice = materialPrice;

    }
}
