/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestwordfinder;

/**
 *
 * @author aphil
 */
public class LongestWOrdFinder {

    public static void main(String[] args) 
    {
        
       String longestMsg = "Java is powerful and popular";
          String[]str = longestMsg.split(" ");
          String longest = "";
          
         for (String c : str) 
         {
             if (str.length>longest.length()) 
             {
                longest = c; 
             }
         }
          System.out.println("longest message:"+longest);
    }
    
}
