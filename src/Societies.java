import javax.naming.Name;

public class Societies implements Clients{
    private Integer clientCode;
    private String businessName;
    private String cif;
    private String adress;
    private String poblation;
    private String province;
    private String email;
    private String phoneNumber;

    public void setClientCode(Integer clientCode) {
        this.clientCode = clientCode;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setPoblation(String poblation) {
        this.poblation = poblation;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Integer getClientCode() {
        return clientCode;
    }

    @Override
    public String getName() {
        return businessName;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public String getPoblation() {
        return poblation;
    }

    @Override
    public String getProvince() {
        return province;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
