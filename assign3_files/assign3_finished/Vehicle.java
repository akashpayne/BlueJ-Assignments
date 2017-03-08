/**
 * A Vehicle 
 * Vehicles have an unique ID, a location and sometimes a destination.
 * They are either free or occupied.
 * 
 * @author Akash Payne
 * @version Vehicle V1.0
 * @date 06/01/2013
 * 
 */
public class Vehicle
{    
    // An unique ID for this Vehicle.
    private String id;
    // The destination of this Vehicle.
    private String destination;
    // The location of this Vehicle.
    private String location;
    
    /**
     * Constructor for objects of class Vehicle
     *
     * @param base The name of the company's base.
     * @param id This Vehicle's unique id.
     */
    public Vehicle(String id, String base)
    {
        this.id = id;
        location = base;
        destination = null;
    }

    /**
     * Return the ID of the Vehicle.
     * @return The ID of the Vehicle.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the location of the Vehicle.
     * @return The location of the Vehicle.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * Return the destination of the Vehicle.
     * @return The destination of the Vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Return the status of this Vehicle.
     * @return The status of this Vehicle.
     */
    public String getStatus()
    {
        // checks if vehicle has any destination 
        //      if not, tells the user that vehicle 
        //              is avaliable
        //      if it does, prints information
        if (destination == null) {
            return id + " at " + location + 
                " and is avaliable for a new job.";
        } 
        else { 
            return id + " at " + location + 
                " and is heading for " + destination
                +".";
        }
    }
    
    /**
     * Set the intented destination of the Vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    
    /**
     * Set the location of the Vehicle to the destination
     * or set location to a string variable. 
     * @param location The reached destination.
     * @param arrived Whether or not to use location string. 
     */
    public void setLocation(String location)
    {
        if (location == null) {
            this.location = destination;
            destination = null; 
        } 
        else {
            this.location = location; 
        }
    }
}