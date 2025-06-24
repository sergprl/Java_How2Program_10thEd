package chapter_3;

// Exercise 3.12

import javax.swing.JOptionPane;

public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
	{
		// set partNumber and partDescription
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		
		// validate quantity (if quantity is not positive, set to 0)
		if (quantity > 0)
			this.quantity = quantity;
		
		// validate pricePerItem (if not positive, set to 0)
		if (pricePerItem > 0)
			this.pricePerItem = pricePerItem;
		
	}
	
	public void setPartNumber(String partNumber) // set the part number
	{
		this.partNumber = partNumber;
	}
	
	public String getPartNumber() // get part number
	{
		return partNumber;
	}
	
	public void setPartDescription(String partDescription) // set the part description
	{
		this.partDescription = partDescription;
	}
	
	public String getPartDescription() // get the part's description
	{
		return partDescription;
	}
	
	public void setQuantity(int quantity)	// set the quantity, make sure it isn't negative
	{
		if (quantity > 0)
			this.quantity = quantity;
		else
			JOptionPane.showMessageDialog(null, "Please enter a positive quantity");
	}
	
	public int getQuantity() // get the quantity
	{
		return quantity;
	}
	
	public void setPricePerItem(double pricePerItem) // set the price per item, make sure it isn't negative
	{
		if (pricePerItem > 0)
			this.pricePerItem = pricePerItem;
		else
			JOptionPane.showMessageDialog(null, "Please enter a positive value (price per item)");
	}
	
	public double getPricePerItem() // get the price per item
	{
		return pricePerItem;
	}
	
	public double getInvoiceAmount() // calculate the total invoice amount and return it
	{
		return pricePerItem * quantity;
	}
}
