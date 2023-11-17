package JV4;

//Voghi.java
public class Voghi extends Product {
    
    private int id;
    private int page;
    private String pageType, pageColor, pageMaterial, pageSize;

    public Voghi(String name, double price, String brand, int page, String pageType, String pageColor, String pageMaterial, String pageSize) {
        super(name, price, brand);
        this.page = page;
        this.pageType = pageType;
        this.pageColor = pageColor;
        this.pageMaterial = pageMaterial;
        this.pageSize = pageSize;
    }
    public boolean containsKeyword(String keyword) {
        String productDetails = super.toString().toLowerCase() +
                                " Page: " + page +
                                " Page Type: " + pageType +
                                " Page Color: " + pageColor +
                                " Page Material: " + pageMaterial +
                                " Page Size: " + pageSize;

        return productDetails.contains(keyword) ||
               String.valueOf(getId()).equals(keyword);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String getPageColor() {
        return pageColor;
    }

    public void setPageColor(String pageColor) {
        this.pageColor = pageColor;
    }

    public String getPageMaterial() {
        return pageMaterial;
    }

    public void setPageMaterial(String pageMaterial) {
        this.pageMaterial = pageMaterial;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }
    
}