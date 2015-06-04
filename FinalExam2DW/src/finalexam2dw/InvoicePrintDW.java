// InvoicePrintDW.java
// Final Examination Part 2 Option 2
// David Wu
// July 13, 2012

package finalexam2dw;

public class InvoicePrintDW // start of class InvoicePrintDW
{
    public void displayInvoice() // start of method displayInvoice
    {
        
        // CREATES INVOICE OBJECTS FOR METHOD CALLING
        InvoiceDW invoice1 = new InvoiceDW("00001", "Fun puzzle that's challenging for everyone to solve!", 5, 12.99);
        InvoiceDW invoice2 = new InvoiceDW("00002", "A book that teaches you how to program in Java!", 1, 29.99);
        InvoiceDW invoice3 = new InvoiceDW("00003", "The fastest computer in the world!", 1, 5099.99);
        InvoiceDW invoice4 = new InvoiceDW("00004", "A perfect gift for anyone who likes lamps.", 1, 14.99);
        InvoiceDW invoice5 = new InvoiceDW("00005", "The best in headphone technology.", 1, 39.99);
        InvoiceDW invoice6 = new InvoiceDW("00006", "A standard pencil.", 20, .99);
        InvoiceDW invoice7 = new InvoiceDW("00007", "Ream of white copy paper.", 2, 5.99);
        InvoiceDW invoice8 = new InvoiceDW("00008", "Starcraft 2, Wings of Liberty.", 10, 59.99);
        InvoiceDW invoice9 = new InvoiceDW("00009", "Starcraft 2, Heart of the Swarm expansion pack.", 1, 49.99);
        InvoiceDW invoice10 = new InvoiceDW("00010", "A jar of air, perfect for anyone who likes breathing.", 1000, .01);
        
        
        // PRINTS OUT EACH SEPARATE INVOICE PER ITEM
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice1.getPartNumber(), invoice1.getPartDescription(), invoice1.getPartQuantity(), invoice1.getPartPrice(), invoice1.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice2.getPartNumber(), invoice2.getPartDescription(), invoice2.getPartQuantity(), invoice2.getPartPrice(), invoice2.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice3.getPartNumber(), invoice3.getPartDescription(), invoice3.getPartQuantity(), invoice3.getPartPrice(), invoice3.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice4.getPartNumber(), invoice4.getPartDescription(), invoice4.getPartQuantity(), invoice4.getPartPrice(), invoice4.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice5.getPartNumber(), invoice5.getPartDescription(), invoice5.getPartQuantity(), invoice5.getPartPrice(), invoice5.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice6.getPartNumber(), invoice6.getPartDescription(), invoice6.getPartQuantity(), invoice6.getPartPrice(), invoice6.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice7.getPartNumber(), invoice7.getPartDescription(), invoice7.getPartQuantity(), invoice7.getPartPrice(), invoice7.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice8.getPartNumber(), invoice8.getPartDescription(), invoice8.getPartQuantity(), invoice8.getPartPrice(), invoice8.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice9.getPartNumber(), invoice9.getPartDescription(), invoice9.getPartQuantity(), invoice9.getPartPrice(), invoice9.getInvoiceAmount());
        
        System.out.printf("Part number: %s\nPart description: %s\nPart quantity: %d\nPart price: $%5.2f\nInvoice amount: $%5.2f\n\n\n", invoice10.getPartNumber(), invoice10.getPartDescription(), invoice10.getPartQuantity(), invoice10.getPartPrice(), invoice10.getInvoiceAmount());
        
        // PRINTS OUT TOTAL OF INVOICE
        System.out.printf("The total is: $%5.2f\n", invoice1.getInvoiceAmount()+invoice2.getInvoiceAmount()+invoice3.getInvoiceAmount()+invoice4.getInvoiceAmount()+invoice5.getInvoiceAmount()+invoice6.getInvoiceAmount()+invoice7.getInvoiceAmount()+invoice8.getInvoiceAmount()+invoice9.getInvoiceAmount()+invoice10.getInvoiceAmount());
    
    } // end of method displayInvoice 
    
} // end of class InvoicePrintDW
