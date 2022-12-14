public class Services implements Sales{
    private Integer ServiceCode;
    private String Name;
    private String Price;
    private String IvaType;

    public Integer getServiceCode() {
        return ServiceCode;
    }

    public void setServiceCode(Integer serviceCode) {
        ServiceCode = serviceCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
