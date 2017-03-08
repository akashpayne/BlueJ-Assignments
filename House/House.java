/**
 * @title - House class - David Barnes, 14th October 2013
 * @due - 1st November 2013
 * 
 * @discription - A software system for an estate agent selling houses.
 * A class whose instances can store some basic details 
 * about a house: its address and asking price. The
 * class will need a field to store an amount of money 
 * (a whole number of pounds) for the price and a field 
 * (a String) for the address. There will also be methods
 * that allow the price to be altered. 

 * @author - Akash Payne (ap567)
 * @version - House_V.1 21/10/13
 */

public class House
{
    // Declaring -- field "Price" - integer field that can store the price of 
    // the house in WHOLE number of pounds £ 
    private int price;
	
    // The field that stores the address for the house 
    private String address; 
    
	/** initialisation of house - sets the default price to 1000000
      * initialise House, price = 1000000
	  * (assessment changed this to setPrice)
	  */
    public void initialisePrice()
	{
		// initialise price to have a value of 1000000.
		price = 1000000;
	}
        
    /**
     * Obtain House, set price 
     */
    public void setPrice(int amount)
    {
        // set the of the house.
        // checks if amount entered is a positive amount
        // if condition proves false, error message is displayed
        if (amount > 0)
        {
            price = amount;
        }
        else if (amount < 0) // amount is less than zero
        {
            System.out.println("You must insert a positive integer amount, rather than : "+
								amount);
			price = 0; 
        }
		else // amount is zero
		{
			System.out.println("You have not inserted a positive integer amount. ("+
								amount+")");
			price = 0; 
		}
    }
    
    /**
     * Obtain House, set address (label)
     */
    public void setAddress(String label)
    {
        // set the address(label) of the house.
        address = label; 
    }
    
    /**
     * Return the price of the house.
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Return the address of the house.
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * Obtains an amount increase for the house 
     * price and gets a total
     * checks that the amount is sensible
     * if not displays error message, identifying both what was called 
     * incorrectly, and the incorrect parameter value that was used.
     */
    public void increasePrice (int amount)
    {
        // 
        if ( amount > 0) 
        {
            price = price + amount;
        }
        else 
        {  
            System.out.println("increasePrice was called with a negative amount: "+
                                amount);
			// no need to set amount to zero
        }
    }
	
	/**
     * Obtains an amount decrease for the house 
     * price and gets a total
     * checks that the amount is sensible
     * if not displays error message, identifying both what was called 
     * incorrectly, and the incorrect parameter value that was used.#
     * Could make an additional IF ELSE statement for when the user enters a positive amount
     * "You have entered a positive match" "Do you want to decrease price by this amount? Y/N"
     * if yes then decrease the value so price = price - amount; if no then error message.
     */
    public void decreasePrice (int amount)
    {
        // 
        if ( amount < 0) 
        {
            price = price + amount;
        }
        else 
        {  
            System.out.println("increasePrice was called with a positive amount: "+
                                amount);
        }
    }
    
    /**
     * Prints the address of the house and its price
     * on a single output line
     * checks that the amount is sensible
     */
    public void printHouse()
    {
        // Output
        System.out.println(address + " is priced at " + price + " pounds");
    }
    
}
 