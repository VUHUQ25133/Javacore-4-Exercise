package JV4;

//Butmuc.java
public class Butmuc extends Product {
    private int id;
    private String penColor, penMaterial, penType, penSmooth;

    @Override
    public void getFullInfo() {
        super.getFullInfo();
        System.out.println("Pen Color: 	     " + penColor + "\n"
        				+  "Pen Material:    " + penMaterial + "\n"
        				+  "Ink Type: 	     " + penType + "\n"
        				+  "Pen Smoothness:  " + penSmooth);
    }
    
    public boolean containsKeyword(String keyword) {
        String productDetails = super.toString().toLowerCase() +
                                " Pen Color: " + penColor +
                                " Pen Material: " + penMaterial +
                                " Pen Type: " + penType +
                                " Pen Smooth: " + penSmooth;

        return productDetails.contains(keyword) ||
               String.valueOf(getId()).equals(keyword);
    }
    public Butmuc(String name, double price, String brand, String penColor, String penMaterial, String penType, String penSmooth) {
        super(name, price, brand);
        this.penColor = penColor;
        this.penMaterial = penMaterial;
        this.penType = penType;
        this.penSmooth = penSmooth;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPenColor() {
        return penColor;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public String getPenMaterial() {
        return penMaterial;
    }

    public void setPenMaterial(String penMaterial) {
        this.penMaterial = penMaterial;
    }

    public String getPenType() {
        return penType;
    }

    public void setPenType(String penType) {
        this.penType = penType;
    }

    public String getPenSmooth() {
        return penSmooth;
    }

    public void setPenSmooth(String penSmooth) {
        this.penSmooth = penSmooth;
    }
}
