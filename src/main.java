import java.util.Scanner;
public class main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);


        Freelance freelance = new Freelance();
        freelance.setClientCode(1);
        freelance.setName("Javier");
        freelance.setSurname("Apellido1 Apellido2");
        freelance.setPoblation("Avila");
        freelance.setProvince("Avila");
        freelance.setAdress("Dir Avila");
        freelance.setDni("00000000A");
        freelance.setEmail("email@email.es");
        freelance.setPhoneNumber("600000000");


        Societies societies = new Societies();
        societies.setClientCode(1);
        societies.setBusinessName("Javier s.l");
        societies.setPoblation("Avila");
        societies.setProvince("Avila");
        societies.setAdress("Dir Avila");
        societies.setCif("B00000000");
        societies.setEmail("email@email.es");
        societies.setPhoneNumber("70000000");


        Products products = new Products();
        products.setProductCode(1);
        products.setName("cable");
        products.setBrand("OKI");
        products.setModel("TV");
        products.setPrice("18");
        products.setIvaType("10");


        Services services = new Services();
        services.setServiceCode(1);
        services.setName("instalacion");
        services.setPrice("25");
        services.setIvaType("10");


        Invoice invoice = new Invoice();
        invoice.setInvoiceCode(1);
        invoice.setInvoiceDate("25/11/2022");
        invoice.setClient(freelance);
        invoice.addProducts(products);
        invoice.addServices(services);
        invoice.setTotal(185);
        invoice.setTaxBase(210);

        InvoicePrinter invoicePrinter = new InvoicePrinter();
        invoicePrinter.PrintInvoice(invoice);
    }
}
