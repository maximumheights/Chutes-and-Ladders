//Max Hite
/*On my honor as a student I have not given nor recieved any unauthorized assitance on this assignment*/

import java.util.*;

public class Client
{   
   public static void main (String[] args)
   {
      Player A, B, C = null, D = null;
      int k = 2;//(int) (Math.random() * 3) + 2;
         
      A = new Player("Chaerry");
      B = new Player("Jo");
      System.out.println(A);
      System.out.println(B);
      if (k > 2)
      {
         C = new Player("Hop");
         System.out.println(C);
         if(k>3)
         {
            D = new Player("Leigh");
            System.out.println(D);
         }
      }
      
      
      
   
   
      while (true)
      {
      //Player A
         System.out.print(A.getName()+" spins ");
         int numberSpun = Board.getNewLocation(A.getSpace());
         A.changeSpace(numberSpun);
         System.out.println(A+"\n");
         
         if (A.hasWon())
         {
            System.out.println(A.getName() + " has won");
            break;
         }
         //Player B
         System.out.print(B.getName()+" spins ");
         numberSpun = Board.getNewLocation(B.getSpace());
         B.changeSpace(numberSpun);
         System.out.println(B+"\n");
         if (B.hasWon())
         {
            System.out.println(B.getName() + " has won");
            break;
         }
         //Player C
         if (C != null)
         {
           System.out.print(C.getName()+" spins ");
         numberSpun = Board.getNewLocation(C.getSpace());
         C.changeSpace(numberSpun);
         System.out.println(C+"\n");
         if (C.hasWon())
         {
            System.out.println(B.getName() + " has won");
            break;
         } 
         
         //Player D
            if (D != null)
            {
            
            System.out.print(D.getName()+" spins ");
         numberSpun = Board.getNewLocation(D.getSpace());
         D.changeSpace(numberSpun);
         System.out.println(D+"\n");
         if (D.hasWon())
         {
            System.out.println(D.getName() + " has won");
            break;
         }
            
            }
         }
         
      }
   }
}