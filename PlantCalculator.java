/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zo.plantcalculator;

/******************************************************************************
Programmer: Zoe Cope
Date: 04/21/2022
Final  Project
Instructor: Professor Ortega
College: San Antonio College

This program calls and displays information in PlantArray which stores information about 10 plants
*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.time.*;  
import java.text.*;


public class PlantCalculator 
{
    public static void main(String[] args)throws ParseException, InputMismatchException
    {
      Scanner s=new Scanner(System.in);
      
      System.out.println("Welcome to Plant Calculator!\n");
      System.out.println("Make your choice by typing a number 1-10 to learn more: ");
      Plant.menu();  //prints menu options
         try{
           makePlant();  
           }catch (InputMismatchException e){
               int choice=0;
               System.out.println("ERROR: INVALID INTEGER.\nPlease enter 1-10 to make another choice, or '0' to exit: \n");
               Plant.menu();
               makePlant();}      
      } 
      
      public static void makePlant() throws ParseException, InputMismatchException{
       Scanner s=new Scanner(System.in);
       
       try{
         int choice=s.nextInt(); //choice represents 1-10 plant on plantarray list
                                 // String fields called from array in while loop instead of get/set methods
                                         
          while(choice>10 || choice<0){
               System.out.println("INVALID integer. Please enter 1-10 to make another choice, or '0' to exit: ");
               choice=choice*0;
               Plant.menu();
               
               choice+=s.nextInt();

               Plant myPlant= new Plant();
             //  myPlant.display(choice);

            }
            try{  //catches non-int input
                 while (choice>=1 && choice<=10){
                    Plant myPlant= new Plant();
                    myPlant.display(choice);
                    choice=choice*0;   //reset choice
                    System.out.println("\nEnter 1-10 to make another choice, or '0' to exit: ");
                    choice=choice+s.nextInt();
                    while(choice>10 || choice<0){
                        System.out.println("INVALID integer. Please enter 1-10 to make another choice, or '0' to exit: ");
                        choice=choice*0;
                        Plant.menu();
                        
                        choice+=s.nextInt();
                     }
                  }
            }catch (InputMismatchException e){  
                choice=choice*0;
               System.out.println("ERROR: INVALID INTEGER. \nPlease enter a number 1-10, or 0 to exit: ");
               Plant.menu();
               try{
                 makePlant();
               }catch (InputMismatchException err){
                System.out.println("REPEATED ERROR: INVALID INTEGER. \nPlease Reload.");
               }
            }     
      }  //end makePlant();
        
          catch(InputMismatchException repeatErr){ //catches repeat errors
               System.out.println("ERROR: INVALID INTEGER. \nPlease enter a number 1-10, or 0 to exit: ");
               Plant.menu();
               try{
                 makePlant();
               }catch (InputMismatchException err){
                System.out.println("REPEATED ERROR: INVALID INTEGER. \nPlease Reload.");
               }}}}

   

