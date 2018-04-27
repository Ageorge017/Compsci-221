/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_carusage;

/**
 *
 * @author albertgeorge
 */
import java.util.Scanner;

public class Lab5_CarUsage {
    
    
    private double TotalMiles, MoneyForGas;
    private int TotalGallons;
    
    public Lab5_CarUsage(){
        TotalMiles = 0;
        MoneyForGas = 0;
        TotalGallons = 0;
    }
    
    public void AddGas(int gallonsBought, double pricePaid){
        MoneyForGas = gallonsBought * pricePaid;
        TotalGallons = TotalGallons + gallonsBought;
        
    }
    
    public void AddMiles (double milesDriven){
        TotalMiles = TotalMiles + milesDriven;
       
    }
    
    public double Calc_MPG (){
         return TotalMiles / TotalGallons;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lab5_CarUsage myCar = new Lab5_CarUsage();
        Scanner scnr  = new Scanner(System.in);
        
        System.out.print("Enter \"gas stop\" or \"driving distance\" or \"get info\" ");
        String Options = scnr.nextLine();
        while ("gas stop".equals(Options) || "driving distance".equals(Options) || "get info".equals(Options)){
            switch (Options){
                
                case "gas stop": System.out.print("How many Gallons added? :");
                                 int gallons = scnr.nextInt();
                                 System.out.print("What is the price per gallons ");
                                 double price = scnr.nextDouble();
                                 myCar.AddGas(gallons, price);
                                 break;
                
                case "driving distance": System.out.print("How long have you been driving? : ");
                                         double distance = scnr.nextDouble();
                                         myCar.AddMiles(distance);
                                         break;
                                         
                case "get info": System.out.print( "Your miles per gallon is " + myCar.Calc_MPG() + "MPG \n" );
                                 break;
                
                default : System.out.print("Invalid Selection");
            }
            
            
            System.out.print("Enter \"gas stop\" or \"driving distance\" or \"get info\" ");
            scnr.nextLine();
            Options = scnr.nextLine();
            
            
            
        }
        
   }   
}


