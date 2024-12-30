package chapter_3;

import javax.swing.JOptionPane;

// driver class for Invoice.java



public class InvoiceTest {
	public static void main(String[] args)
	{
		// create invoices
		Invoice invoice1 = new Invoice("12345", "screwdriver", 3, 5.90);
		Invoice invoice2 = new Invoice("56789", "nuts", -2, -560.5);
		
		// print the invoices
		printInvoice(invoice1);
		printInvoice(invoice2);
		
		// modify invoice2
		modifyInvoice(invoice1);
		modifyInvoice(invoice2);
		
		// print the invoices
		printInvoice(invoice1);
		printInvoice(invoice2);
		
		
		
	}
	
	public static void modifyInvoice(Invoice invoice) // modify every value in the invoice
	{
		// part number
		String partNumber = JOptionPane.showInputDialog(
				String.format("Enter new part number (leave blank to keep the current value [%s])", 
						invoice.getPartNumber()));
		if (!partNumber.equals(""))
			invoice.setPartNumber(partNumber);
		
		// part description
		String partDescription = JOptionPane.showInputDialog(
				String.format("Enter new part description (leave blank to keep the current value [%s])", 
						invoice.getPartDescription()));
		if (!partDescription.equals(""))
			invoice.setPartDescription(partDescription);
		
		// quantity
		String quantityString = JOptionPane.showInputDialog(
				String.format("Enter new quantity (leave blank to keep the current value [%d])", 
						invoice.getQuantity()));
		if (!quantityString.equals(""))
			invoice.setQuantity(Integer.parseInt(quantityString));
		
		// price per item
		String pricePerItemString = JOptionPane.showInputDialog(
				String.format("Enter new price per item (leave blank to keep the current value [%.2f]",
						invoice.getPricePerItem()));
		if (!pricePerItemString.equals(""))
			invoice.setPricePerItem(Double.parseDouble(pricePerItemString));
	}
	
	
	public static void printInvoice(Invoice invoice) // print the invoice information
	{
		System.out.printf("Invoice for item %s - %s%n"
				+ "Quantity: %d%n"
				+ "Price per item: $%.2f%n"
				+ "Total: $%.2f%n%n",
				invoice.getPartNumber(), invoice.getPartDescription(), 
				invoice.getQuantity(), invoice.getPricePerItem(), invoice.getInvoiceAmount());
	}
}
