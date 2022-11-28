import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private Integer InvoiceCode;
    private String InvoiceDate;
    private Clients Client;
    private List<Products> Products= new ArrayList<>();
    private List<Services> Service= new ArrayList<>();
    private Integer TaxBase;
    private Integer Total;
    private Integer Searcher = 0;

    public void addProducts(Products products){
        this.Products.add(products);
    }
    public Products getProduct(){
        return Products.get(Searcher);
    }
    public Integer getProductSize(){
        return Products.size();
    }
    public void addServices(Services services) {
        this.Service.add(services);
    }
    public Services getServices(){
        return Service.get(Searcher);
    }
    public Integer getServicesSize(){
        return Service.size();
    }
    public Integer getInvoiceCode () {
        return InvoiceCode;
    }

    public void setInvoiceCode (Integer invoiceCode) {
          InvoiceCode = invoiceCode;
    }

    public String getInvoiceDate () {
        return InvoiceDate;
    }

    public void setInvoiceDate (String invoiceDate) {
        this.InvoiceDate = invoiceDate;
    }

    public Clients getClient () {
        return Client;
    }

    public void setClient (Clients client) {
        this.Client = client;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        this.Total = total;
    }

    public Integer getTaxBase() {
        return TaxBase;
    }

    public void setTaxBase(Integer taxBase) {
        this.TaxBase = taxBase;
    }
}