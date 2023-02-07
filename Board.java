//Max Hite
/*On my honor as a student I have not given nor recieved any unauthorized assitance on this assignment*/

import java.util.*;

public class Board
{

   private static int newLocation;
   private static int spinNew;
   
   public Board()
   {
      newLocation = 0;
      spinNew = 0;
   }
   
   
   public static int spinValue()
   {
      spinNew = (int)(Math.random() *6) + 1;
      return spinNew;
   }
   
   public static int getNewLocation(int currentLoc)
   {
      int spinVal = spinValue();
      System.out.println(spinVal);
      int newLoc = currentLoc + spinVal;
      
      //ladder instances
      
      if(newLoc > 100)
      {
         System.out.println("You are stuck on "+ currentLoc);
         return currentLoc;
      }
      System.out.println("You move from "+ currentLoc + " to " + newLoc);
      if(newLoc == 1)
      {
         newLoc = 38;
         System.out.println("you climbed the ladder to " + newLoc + "!");
         return newLoc;
      }
      
      if(newLoc == 4)
      {
         newLoc = 14;
         System.out.println("you climbed the ladder to " + newLoc + "!");
         return newLoc;
      }
      
      if(newLoc == 9)
      {
         newLocation = 31;
         System.out.println("you climbed the ladder to " + newLocation + "!");
         return newLoc;
      }   
      
      if(newLoc == 21)
      {
         newLocation = 42;
         System.out.println("you climbed the ladder to " + newLocation + "!");
         return newLoc;
      }  
      
      if(newLoc == 28)
      {
         newLocation = 84;
         System.out.println("you climbed the ladder to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLoc == 36)
      {
         newLocation = 44;
         System.out.println("you climbed the ladder to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLoc == 51)
      {
         newLocation = 67;
         System.out.println("you climbed the ladder to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLoc == 71)
      {
         newLocation = 91;
         System.out.println("you climbed the ladder to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 80)
      {
         newLocation = 100;
         System.out.println("you climbed the ladder to " + newLocation + "!");
         return newLoc;
      }
      
      //chute instances
      
      if(newLocation == 16)
      {
         newLocation = 6;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 47)
      {
         newLocation = 26;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 49)
      {
         newLocation = 11;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 56)
      {
         newLocation = 53;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 62)
      {
         newLocation = 19;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 64)
      {
         newLocation = 60;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 87)
      {
         newLocation = 24;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 93)
      {
         newLocation = 73;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 95)
      {
         newLocation = 75;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      if(newLocation == 98)
      {
         newLocation = 78;
         System.out.println("you slide down the chute to " + newLocation + "!");
         return newLoc;
      }
      
      //if new location is over 100 return 100
      //if under 100 return new location
      return newLoc;
      
      
   }
}
