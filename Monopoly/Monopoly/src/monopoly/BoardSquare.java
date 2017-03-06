/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author C301
 */
class BoardSquare 
{

    private String name;    // the name of the square
    private String type;    // property, railroad, utility, plain, tax, or  toJail 
    private int price;      // cost to buy the square; zero means not for sale
    private int rent;       // rent paid by a player who lands on the square 
    private String color;   // many are null; this is not the Java Color class

    // constructors
    public BoardSquare() 
    {
        name = "";
        type = "";
        price = 0;
        rent = 0;
        color = "";
    } // end Square()

    public BoardSquare(String name, String type, int price, int rent, String color) 
    {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rent = rent;
        this.color = color;
    } // end Square((String name, String type, int price, int rent, String color)

    // accesors for each property
    public String getName() 
    {
        return name;
    } //end  getName()

    public String getType() 
    {
        return type;
    } //end  getType()

    public int getPrice() 
    {
        return price;
    } //end  getPrice()

    public int getRent() 
    {
        return rent;
    } //end  getRent()

    public String getColor() 
    {
        return color;
    } //end  getColor()
        
    // a method to return the BoardSquare's data as a String
    public String toString() 
    {
    String info;
    info = (name +", "+type+", "+price + ", "+ rent+ ", "+color);
    return info;    
    } //end  toString()

    String split() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int split(String _) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean substring(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
} // end class BoardSquare
//***************************************************************************
