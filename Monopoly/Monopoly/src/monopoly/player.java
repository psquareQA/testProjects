/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/* Monopoly.java
 * Monopoly
 * Created for CSCI 111
 * Last modified November 18, 2016 5:00 pm
 * @author pphath(Paul Phath)
 *
 */
package monopoly;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author pphath200
 */
public class player 
{
    //  declare properties
    private String playerName;  // the name of the player
    private String playerToken; // the player's token 
    private int playerBankTotal;   // player bank total
    private int playerDiceRoll1;   // player first dice roll
    private int playerDiceRoll2;    //player second dice roll
    private int playerDiceRollSum;  //player total dice roll
    private int playerBoardPosition;    //player board position
    
    //constructor
    public player()
    {
        playerName = "";  // the name of the player
        playerToken = ""; // the player's token
        playerBankTotal = 1500;   // player bank total
        playerDiceRoll1 = 0;   // player first dice roll
        playerDiceRoll2 = 0;    //player second dice roll
        playerDiceRollSum = 0;  //player total dice roll
        playerBoardPosition = 0;    //player board position
    }

    public player(String playerName, String playerToken, int playerBankTotal, int playerDiceRoll1, int playerDiceRoll2, int playerDiceRollSum, int playerBoardPosition)
    {
        this.playerName = playerName;  // the name of the player
        this.playerToken = playerToken; // the player's token
        this.playerBankTotal = playerBankTotal;   // player bank total
        this.playerDiceRoll1 = playerDiceRoll1;   // player first dice roll
        this.playerDiceRoll2 = playerDiceRoll2;    //player second dice roll
        this.playerDiceRollSum = playerDiceRollSum;  //player total dice roll
        this.playerBoardPosition = playerBoardPosition;    //player board position
    }
    
    public String getPlayerName()
    {
        Scanner kb = new Scanner(System.in);
        playerName = kb.nextLine();
        System.out.println("The player name is " + playerName);
        return playerName;
    }
    
    public String getPlayerToken()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please select a token: \n");
        playerToken = kb.nextLine();
        System.out.println("The token you selected is " + playerToken + ".");
        return playerToken;
    }
    
    public int getPlayerBankTotal()
    {
        //System.out.println(playerBankTotal + "\n");
        return playerBankTotal;
    }
    
    public int getPlayerBoardPosition()
    {
        //System.out.println(playerBoardPosition + "\n");
        return playerBoardPosition;
    }
    
    public int getPlayerDiceRollSum()
    {
        Random rnd = new Random();
        int min = 1, max = 6;
        int playerDiceRoll1 = rnd.nextInt(max - min + 1) + min;
        int playerDiceRoll2 = rnd.nextInt(max - min + 1) + min;
        playerDiceRollSum = playerDiceRoll1 + playerDiceRoll2;
        System.out.println("Dice roll 1: " + playerDiceRoll1);
        System.out.println("Dice roll 2: " + playerDiceRoll2);
        System.out.println("The player total dice roll is " + playerDiceRollSum + ".");
        return playerDiceRollSum;
    }
    

    public static void playerInfo(String playerName, String playerToken, int playerBankTotal, int playerBoardPosition)
    {
        System.out.println("Player " + playerName);
        System.out.println("Token " + playerToken);
        System.out.println("The player current bank total is " + playerBankTotal);
        System.out.println("The player position is at " + playerBoardPosition);
        //System.out.println(playerName + ", " + playerToken + ", " + playerBankTotal + ", " + playerBoardPosition);
    }
}
