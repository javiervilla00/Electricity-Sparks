public class Freelance implements Clients{
    private Integer clientCode;
    private String name;
    private String surname;
    private String dni;
    private String adress;
    private String poblation;
    private String province;
    private String email;
    private String phoneNumber;

    public void setClientCode(Integer clientCode) {
        this.clientCode = clientCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
        return name;
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
