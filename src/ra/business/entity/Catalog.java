package ra.business.entity;

public class Catalog {
    private static int autoId = 0;
    private int catalogId;
    private String categoryName,description;

    public Catalog() {
        this.catalogId = ++autoId;
    }

    public Catalog(int catalogId, String categoryName, String description) {
        this.catalogId = catalogId;
        this.categoryName = categoryName;
        this.description = description;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "catalogId=" + catalogId +
                ", categoryName='" + categoryName + '\'' +
                ", description='" + description + '\'' ;
    }
}
