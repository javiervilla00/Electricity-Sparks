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

        System.out.println("Client code: " ); int  ClientCode = sc.nextInt();
        System.out.println("Name: " ); String  Name = sc.nextLine();
        System.out.println("Surname: " ); String  Surname = sc.nextLine();
        System.out.println("Poblation: " ); String  Poblation = sc.nextLine();
        System.out.println("Province: " ); String  Province = sc.nextLine();
        System.out.println("Adress: " ); String  Adress = sc.nextLine();
        System.out.println("Dni: " ); String  Dni = sc.nextLine();
        System.out.println("Email: "); String Email = sc.nextLine();
        System.out.println("Phone number: "); Long PhoneNumber = sc.nextLong();


        Societies societies = new Societies();
        societies.setClientCode(1);
        societies.setBusinessName("Javier s.l");
        societies.setPoblation("Avila");
        societies.setProvince("Avila");
        societies.setAdress("Dir Avila");
        societies.setCif("00000000A");
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


    }
}
