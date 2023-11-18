package JV4;

//Butchi.java
public class Butchi extends Product {
    
    private int id;
    private String pencilColor, pencilMaterial, pencilHardness;

    
    @Override
    public void getFullInfo() {
        super.getFullInfo();
        System.out.println("Pencil Color:    " + pencilColor + "\n"
        				+  "Pencil Material: " + pencilMaterial + "\n"
        				+  "Pencil Hardness: " + pencilHardness);
    }
    public boolean containsKeyword(String keyword) {
        String productDetails = super.toString().toLowerCase() +
                                " Pencil Color: " + pencilColor +
                                " Pencil Material: " + pencilMaterial +
                                " Pencil Hardness: " + pencilHardness;

        return productDetails.contains(keyword) ||
               String.valueOf(getId()).equals(keyword);
    }

    public Butchi(String name, double price, String brand, String pencilColor, String pencilMaterial, String pencilHardness) {
        super(name, price, brand);
        this.pencilColor = pencilColor;
        this.pencilMaterial = pencilMaterial;
        this.pencilHardness = pencilHardness;
    }
    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPencilColor() {
        return pencilColor;
    }

    public void setPencilColor(String pencilColor) {
        this.pencilColor = pencilColor;
    }

    public String getPencilMaterial() {
        return pencilMaterial;
    }

    public void setPencilMaterial(String pencilMaterial) {
        this.pencilMaterial = pencilMaterial;
    }

    public String getPencilHardness() {
        return pencilHardness;
    }

    public void setPencilHardness(String pencilHardness) {
        this.pencilHardness = pencilHardness;
    }
}
