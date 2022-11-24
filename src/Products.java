public class Products implements Sales{
    private Integer ProductCode;
    private String Name;
    private String Brand;
    private String Model;
    private String Price;
    private String IvaType;

    public Integer getProductCode() {
        return ProductCode;
    }

    public void setProductCode(Integer productCode) {
        ProductCode = productCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getIvaType() {
        return IvaType;
    }

    public void setIvaType(String ivaType) {
        IvaType = ivaType;
    }

    @Override
    public Integer SaleCode() {
        return null;
    }

    @Override
    public String Name() {
        return null;
    }

    @Override
    public String Price() {
        return null;
    }

    @Override
    public String IvaType() {
        return null;
    }
}
