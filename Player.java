//Max Hite
/*On my honor as a student I have not given nor recieved any unauthorized assitance on this assignment*/

import java.util.*;

public class Player 
{
   private String name;
   private int space;
   
   public Player (String n)
   {
      name = n;
      space = 0;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getSpace()
   {
      return space;
   }
   
   //idk if void or not
   public int changeSpace(int x)
   {
      space = x;
      return space;
   }
   
   public boolean hasWon()
   {
      if(space == 100)
      {
         return true;
      }
      return false;
   }
   
   public String toString()
   {
      return name + " is on space " + space;
   }  
}