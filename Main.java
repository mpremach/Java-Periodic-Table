import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        PeriodicTable periodicTable = new PeriodicTable();
        periodicTable.readPeriodicInfo("PeriodicInfo.txt");

        Scanner scnr = new Scanner(System.in);
        

        while (true) {
            System.out.print("Enter element symbol (or 'exit' to quit): ");
            String symbol = scnr.nextLine();
        if(symbol.equalsIgnoreCase("exit")) {
            break;
        
    
         } else {
            System.out.println(periodicTable.toString(symbol));
        }
        }      
        
    } 
}
    



