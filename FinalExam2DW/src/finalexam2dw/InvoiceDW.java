// InvoiceDW.java
// Final Examination Part 2 Option 2
// David Wu
// July 13, 2012

package finalexam2dw;

public class InvoiceDW // start of class InvoiceDW
{
   
   // PRIVATE INSTANCE VARIABLES 
   private String partNumber;
   private String partDescription;
   private int partQuantity;
   private double partPrice;
   private double invoiceAmount;
   
    public InvoiceDW(String number, String description, int quantity, double price) // start of constructor
    {
        // setting instance variables
        partNumber = number;
        partDescription = description;
        partQuantity = quantity;
        partPrice = price;
    } // end of constructor
    
    public void setPartNumber(String number) // set partNumber to String number
    {
        partNumber = number;
    }
    
    public String getPartNumber() // return String partNumber
    {
        return partNumber;
    }
    
    
    public void setPartDescription(String description) // sets partDescription to string description
    {
        partDescription = description;
    }
    
    public String getPartDescription() // returns String value partDescription
    {
        return partDescription;
    }
    
    
    public void setPartQuantity(int quantity) // sets partQuantity to int quantity
    {
        partQuantity = quantity;
        
        
    }
    
    public int getPartQuantity() // returns int value partQuantity
    {
        if (partQuantity < 0)
        {
            partQuantity = 0;
        }
        
        return partQuantity;
    }

    
    public void setPartPrice(double price) // sets partPrice to double price
    {
        partPrice = price;
    }
    
    public double getPartPrice() // returns double value partPrice
    {
        if (partPrice < 0)
        {
            partPrice = 0;
        }
        
        return partPrice;
    }
    
    public double getInvoiceAmount() // calculates invoice total and returns double value
    {
        invoiceAmount = partPrice*partQuantity;
        return invoiceAmount;
    }
} // end of class InvoiceDW