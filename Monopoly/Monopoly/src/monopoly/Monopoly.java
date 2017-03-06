/* Monopoly.java
 * 
 * CSCI 111 Fall 2013 
 * last edited November 2, 2013 by C. Herbert
 * 
 * This package contains code that can be used as the basis of a monopoly game
 * It has a class of BoardSquares for the board squares in a Monopoly game,
 * and a main program that puts the squares into an array.
 * 
 * The main method has code to test the program by printing the data from the array
 * 
 * This is for teaching purposes only. 
 * Monopoly and the names and images used in Monopoly are 
 * registered trademarks of Parker Brothers, Hasbro, and others.
 */

/* Monopoly.java
 * Monopoly
 * Created for CSCI 111
 * Last modified November 18, 2016 5:00 pm
 * @author pphath(Paul Phath)
 */

package monopoly;
import java.util.*;

/**
 *
 * @author cherbert
 */
public class Monopoly {

    /**
     * @param args the command line arguments
     */
    
    
    Monopoly monoConst = new Monopoly();
    public static void main(String[] args) throws Exception 
    {   
        String inPlayerName;
        String inPlayerToken;
        
        BoardSquare[] square = new BoardSquare[40]; // array of 40 monopoly squares
        
        int boardPosition; // a loop counter
        
        // call the method to load the array
        loadArray(square);
        //loadArray(rent);
        
        // test the code by printing the data for each square
        
        System.out.println("Data from the array of Monopoly board squares. Each line has:\n");
        System.out.println("name of the square, type, rent, price, color\n");
        for(boardPosition = 0; boardPosition < 40; boardPosition++)
            System.out.println(boardPosition + ", " + square[boardPosition].toString());
            //System.out.println("test print " + square[boardPosition].toString());
        
//        System.out.println();
//        String x = "Go, plain, 0, 1, null";
//        String [] rent1 = x.split(",");
//        System.out.println(rent1[2]);
        
        //Ask the player to enter a name
        System.out.println();
        System.out.println("Enter players Name: \n");
        player Object1 = new player();
        inPlayerName = Object1.getPlayerName();
        
        //Ask the player to select a token
        player object1 = new player();
        System.out.println();
        String[] playerTokenSelection = {"Scottish Terrier", "Battleship", "Automoblile", "Top Hat", "Thimble", "Boot", "Wheelbarrow", "Cat"};
        for(int i = 0; i < playerTokenSelection.length; i++)
        {
            System.out.println(playerTokenSelection[i]);
        };
        
        System.out.println();
        inPlayerToken = object1.getPlayerToken();
        System.out.println();
        
        int inPlayerBankTotal = object1.getPlayerBankTotal();
        int inPlayerBoardPosition = object1.getPlayerBoardPosition();
        
        //Get Player Info
        System.out.println("Get Player Info: ");
        object1.playerInfo(inPlayerName, inPlayerToken, inPlayerBankTotal, inPlayerBoardPosition);
        
        System.out.println();
        System.out.println("The player " + inPlayerName + " and the token " + inPlayerToken + " is currently on GO.");
        
        int count = 0;
        while(count < inPlayerBankTotal && inPlayerBoardPosition < 39){
            
            //Random rnd = new Random();
            Scanner kb = new Scanner(System.in);
            System.out.println();
            System.out.println("Do you want to continue? y/n \n");
            String playerResponse = kb.nextLine();
            
                //Yes or no response to enter the loop
                if (playerResponse.matches("y"))
                {
                System.out.println();
                System.out.println("The player's current dice roll is: \n");
                int diceRoll = object1.getPlayerDiceRollSum();
                System.out.println("The player will move " + diceRoll + " spaces.");
                System.out.println();
                inPlayerBoardPosition = diceRoll + inPlayerBoardPosition;
                //inPlayerBankTotal = inPlayerBankTotal - rnd.nextInt(200);
                square[inPlayerBoardPosition].toString();
                String [] property = square[inPlayerBoardPosition].toString().split(", ");
                
                System.out.println("The player is on " + property[0]);
                String [] rent = square[inPlayerBoardPosition].toString().split(", ");
                System.out.println("The rent for this property is " + rent[2] + ".");
                int newRent = Integer.parseInt(rent[2]);
                inPlayerBankTotal = inPlayerBankTotal - newRent;
                object1.playerInfo(inPlayerName, inPlayerToken, inPlayerBankTotal, inPlayerBoardPosition);
                System.out.println(property[0] + ".");
                } else {
                        System.out.println("End of the player's turn. \n");
                        break;
                }
        }
        
    } // main()
    //***********************************************************************
    
    // method to load the BoardSquare array from a data file
    public static void loadArray(BoardSquare[] square) throws Exception
    {
        int i; // a loop counter
        
        // declare temporary variables to hold BoardSquare properties read from a file
        String inName;    
        String inType;
        int inPrice;
        int inRent;
        String inColor;
        
        // Create a File class object linked to the name of the file to be read
        java.io.File squareFile = new java.io.File("squares.txt");

        // Create a Scanner named infile to read the input stream from the file
        Scanner infile = new Scanner(squareFile);

        
        /* This loop reads data into the square array.
         * Each item of data is a separate line in the file.
         * There are 40 sets of data for the 40 squares.
         */
        for( i=0; i<40; i++)
        {
            // read data from the file into temporary variables
            // read Strings directly; parse integers
            inName  = infile.nextLine(); 
            inType  = infile.nextLine(); 
            inPrice = Integer.parseInt( infile.nextLine() );
            inRent  = Integer.parseInt( infile.nextLine() );
            inColor = infile.nextLine(); 
         
            // intialze each square with the BoardSquare constructor
            square[i] = new BoardSquare(inName, inType, inPrice, inRent, inColor);
            
        } // end for
        infile.close();
    } // endLoadArray
    //***********************************************************************
    
} // end class Monopoly
//***************************************************************************


/* code for a class of Monopoly squares
 * 
 * CSCI 111 Fall 2013 
 * last edited November 2, 2013 by C. Herbert
 * Each object in this class is a square for the board game Monopoly.
 * 
 * This is for teaching purposes only. 
 * Monopoly and the names and images in the game are 
 * registered trademarks of Parker Brothers, Hasbro, and others.
 */
