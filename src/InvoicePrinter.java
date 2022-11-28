public class InvoicePrinter {
    public void PrintInvoice(Invoice invoice){
        for (int i=0; i < invoice.getProductSize(); i++){
            System.out.println("Producto: " + invoice.getProduct());
        }
        System.out.println("___________________________________________");
        for (int i=0; i < invoice.getServicesSize(); i++){
            System.out.println("Servicio: " + invoice.getProduct());
        }
        System.out.println("___________________________________________");
        System.out.println("Total sin IVA: " + invoice.getTotal() + "\n" + "Total (IVA incluido): " + invoice.getTaxBase());
        System.out.println("___________________________________________");
    }
}
