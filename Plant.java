/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zo.plantcalculator;

/******************************************************************************
Programmer: Zoe Cope
Date: 04/21/2022
Final  Project
Instructor: Professor Ortega
College: San Antonio College

This program contains fields for plant class
*******************************************************************************/
import java.util.*;
import java.time.*;
import java.text.*;
import java.io.*;

                            /*1: tomato", 
                              2: basil", 
                              "onion", 
                              "lettuce", 
                              "rosemary",
                              "dill",
                              "bell pepper",
                              "bok choy",
                              "cabbage",
                              "carrot"
                              */

public class Plant 
{
   String [] name = {"tomato", 
                              "basil", 
                              "onion", 
                              "lettuce", 
                              "rosemary",
                              "dill",
                              "bell pepper",
                              "bok choy",
                              "cabbage",
                              "carrot"};
                             
   String [] scientificName = {"Solanum lycopersicum", 
                              "Ocimum basilicum", 
                              "Allium cepa", 
                              "Lactuca sativa", 
                              "Salvia rosmarinus",
                              "Anethum graveolens",
                              "Capsicum annuum",
                              "Brassica rapa: B. chinensis",
                              "Brassica oleracea: capitata ",
                              "Daucus carota: sativus" };
 
   String [] desc = {"A flowering plant of the nightshade family (Solanaceae), cultivated extensively for its edible fruits. Labelled as a vegetable for nutritional purposes, tomatoes are a good source of vitamin C.", 
                                 "An annual herb of the mint family (Lamiaceae), grown for its aromatic leaves. Basil is widely grown as a kitchen herb. The leaves are used fresh or dried to flavor meats, fish, salads, and sauces.", 
                                 "An herbaceous biennial plant in the amaryllis family (Amaryllidaceae) grown for its edible bulb. Onions are grown throughout the world and are valued for their flavor.", 
                                 "An annual leaf vegetable of the aster family (Asteraceae). Lettuce is generally a rich source of vitamins K and A, though the nutritional quality varies, depending on the variety.", 
                                 "A small evergreen plant of the mint family (Lamiaceae), the leaves of which are used to flavor foods. Rosemary is widely grown in gardens in warm climates. The leaves have a pungent, slightly bitter taste and, dried or fresh, are generally used to season foods,",
                                 "An annual or biennial herb of the parsley family (Apiaceae) and its dry fruit and leaves which are used to season foods.",
                                 "Bell peppers are in the nightshade family (Solanaceae), grown for its thick, mild fruits. Bell peppers are high in vitamin A and vitamin C.",
                                 "A member of the mustard family (Brassicaceae) that is a variety (chinensis) of Brassica rapa.",
                                 "A member of the mustard family (Brassicaceae), the various agricultural forms of which have been developed by long cultivation from the wild cabbage (Brassica oleracea). The edible portions of all cabbage forms—which include kale, broccoli, and Brussels sprouts—are low in calories and are an excellent source of vitamin C. ",
                                 "An herbaceous, generally biennial plant of the Apiaceae family that produces an edible taproot." };
                             
   String [] seed = {"Sow seedlings 1/2-inch deep", 
                                 "Sow seedlings 1/2-inch deep, 12-18 inches apart. Every 4-6 inches of growth, pinch center leaves off to encourage more growth.", 
                              "Plant in early Spring through fall, leaving at least 4 weeks of warm weather. Fall onions remain dormant until the following Spring.", 
                              "Direct sow seeds 1/8-1/4 inch deep, allowing sun to reach seeds. Thin to 4-8 inches apart, depending on variety. Sow every 2 weeks for continual harvest.", 
                              "Rosemary's low germination rate makes it a great candidate for transplanting. Sow more seeds than you expect to grow.",
                              "Direct sow in spring 1/4-inch deep.",
                              "Sow seeds 1/4-inch deep. Start seeds indoors 8-10 weeks before last frost date.",
                              "Direct sow 1/3-1/2 inch deep in nitrogen-rich, fertile soil in Spring. Can sow 50 days before first frost for Fall crop.",
                              "Direct sow 1/4-inch deep, spaced 12-24 inches apart in mid-late summer for Fall harvest. Can start seeds indoors 6-8 weeks before last frost. ",
                              "Direct sow 2-3 weeks before last Spring frost. Till soil at least 10 inches deep before sowing seeds 1/4-inch deep, spaced 2-3 inches apart." };

                              
    String [] germTime = {"5 days, can start indoors 6-8 weeks before first frost. Harvest ripened fruit frequently for greater yield.", //need to get germination (time to sprout)
                              "7-14 days germination. \n                   Harvest once plant reaches 6-8 inches high.", 
                              "Start seeds inside and transplant when nighttime soil temperature reaches over 50F. Onion sets mature in 14 weeks.", 
                              "7-15 days. Prefers cool weather, difficult to sprout if temperature exceeds 72F.", 
                              "15-25 days. May also be grown from cuttings.",
                              "10-14 days. Best germination results in temperatures 60F-70F. Thin to 10-12 inches apart.",
                              "7-21 days germination. \nHarvest 60-80 days after transplanting.",
                              "7-10 days",
                              "7-10 days",
                              "14-21 days" };
    String [] harvest = {"Harvest ripened fruit frequently for greater yield.", 
                              "Harvest once plant reaches 6-8 inches high.", 
                              "Onion sets mature in 98 days (14 weeks).", 
                              "Ready to harvest in 30-70 days. ", 
                              "Can harvest as needed after 8 inches. Cuttings recommended due to low seed germination rate.",
                              "May harvest after 4-5 leaves.",
                              "Harvest 60–80 days after transplanting.",
                              "45 days",
                              "60-90 days after planting",
                              "80 days after planting" };
                              
      String [] water = {"1-2 inches of water per week. Ensure steady watering to avoid cracking. Prefers soil pH of 6.0-6.8", //need to get water info
                              "water well after planting. Basil is extremely cold-sensitive (>42 degrees F), and needs moist, nutrient-rich soil that drains well.", 
                              "keep top inch moist, in well draining soil.", 
                              "mist while sprouting, will dramatically wilt if thirsty.", 
                              "Let dry in between watering. Do not overwater as seedlings develop. Hardy once mature.",
                              "Water freely. Prefers soil with pH 6.5-7.0",
                              "Water regularly with 1-2 inches of water per week. Ensure daily watering in hot regions",
                              "1 inch of water per week or more. Prefers morning water to prepare for hottest part of the day.",
                              "2 inches per square foot per week ",
                              "Frequent, shallow watering" };
                              
      String [] sun = {"8-10 hours of full sun. Plant or transfer outside once night temperatures remain over 50 degrees", //need to get sunlight info
                              "6-8 hours of sun daily", 
                              "Full sun", 
                              "Partial sun, Shade a must in hotter regions. Benefits from rows covers to avoid bolting.", 
                              "Full sun",
                              "Full sun",
                              "Full sun",
                              "3-5 hours partial sun, full sun if soil can be kept cool.",
                              "Full sun",
                              "Full sun" };

  public static void menu(){   //calling this method prints the menu
      System.out.println("1 for tomato ");
      System.out.println("2 for basil ");
      System.out.println("3 for onion ");
      System.out.println("4 for lettuce ");
      System.out.println("5 for rosemary ");
      System.out.println("6 for dill ");
      System.out.println("7 for bell pepper ");
      System.out.println("8 for bok choy ");
      System.out.println("9 for cabbage ");
      System.out.println("10 for carrot ");

  }
  
  public void display(int choice)throws ParseException{
      switch (choice){
      
      
        case 1:{
         System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
         System.out.println("\nScientific name: "+ scientificName[choice-1]);
         System.out.println("Description: "+ desc[choice-1]);
         System.out.println("Sunlight: "+ sun[choice-1]);
         System.out.println("Water: "+ water[choice-1]);
         System.out.println("Planting instructions: "+ seed[choice-1]);
         System.out.println("Time to germinate: "+ germTime[choice-1]);
         
         LocalDate harvestDay = LocalDate.now().plusDays(60);
         System.out.println("Earliest harvest date is: "+ harvestDay);
               break;
         
         }
                  
           case 2:{ 
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(28);
              System.out.println("Earliest harvest date is: "+ harvestDay);

            break;               
               }
         case 3:{ 
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(98);
              System.out.println("Earliest harvest date is: "+ harvestDay);

            break;
                    }
        case 4:{ 
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(30);
         System.out.println("Earliest harvest date is: "+ harvestDay);
            break;
                  }    
         case 5: {
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(450);
             LocalDate harvestCut = LocalDate.now().plusDays(42);
         System.out.println("Earliest harvest date is: "+ harvestDay+" for rosemary started from seed.");
         System.out.println("Cuttings can be harvested after "+ harvestCut+".");
            break;}
                 
         case 6: {
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(28);
         System.out.println("Earliest harvest date is: "+ harvestDay);

            break;
            }
                        
        case 7: {
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(60);
              System.out.println("Earliest harvest date is: "+ harvestDay);

            break;
            }
        case 8: {
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(45);
             System.out.println("Earliest harvest date is: "+ harvestDay);

            break;
            }
                     
       case 9: {
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(60);
               System.out.println("Earliest harvest date is: "+ harvestDay);

            break;
            }               
   
      case 10: {
            System.out.println("Name: "+name[choice-1]);   //message that will say name: list(choice-1)
            System.out.println("\nScientific name: "+ scientificName[choice-1]);
            System.out.println("Description: "+ desc[choice-1]);
            System.out.println("Sunlight: "+ sun[choice-1]);
            System.out.println("Water: "+ water[choice-1]);
            System.out.println("Planting instructions: "+ seed[choice-1]);
            System.out.println("Time to germinate: "+ germTime[choice-1]);
            
            LocalDate harvestDay = LocalDate.now().plusDays(80);
             System.out.println("Earliest harvest date is: "+ harvestDay);
            break;
            }
               
       default:
           break;
                     }
            
         }




      
      }
   
