//Deeshan M. Period 2 AP CompSci
//Completed on October 28 2020
import java.util.*;
public class TestGeoClass {
    public static void main(String args[]) {
     
      int count = 0;
      int upper = 8;
      int lower = 2;
      int sentinel = 0;
      int trigger = 0;
      int tries = 0;
     
      double inputHeight;
      double inputRadius;
      double inputWidth;
      double inputLength;
     
      double inputHeightUpper = 20;
      double inputHeightLower = 2;
      double inputRadiusUpper = 10;
      double inputRadiusLower = 1;
      double inputWidthUpper = 30;
      double inputWidthLower = 8;
      double inputLengthUpper = 15;
      double inputLengthLower = 3;
      double averageArea = 0;
      double averageVolume = 0;
      double masterMeanSA = 0;
      double masterMeanV = 0;
      double SA = 0;
      double V = 0;
      double SDSA = 0;
      double SDV = 0;
      
      ArrayList<Double> arraySA = new ArrayList<>();
      ArrayList<Double> arrayV = new ArrayList<>();
     
      sentinel = (int)(Math.random()*(upper - lower + 1) + lower);
     
      while(sentinel != trigger) {
         
          count = count + 1;
         
          GeoSolid GS = new GeoSolid(inputHeightUpper, inputHeightLower, inputRadiusUpper, inputRadiusLower, inputWidthUpper, inputWidthLower, inputLengthUpper, inputLengthLower);
         
          System.out.println(count + ") " + GS);
         
          SA = GS.getArea() + SA;
          V = GS.getVolume() + V;
         
          trigger = (int)(Math.random()*(upper - lower + 1) + lower);
          
          arraySA.add(GS.getArea());
          arrayV.add(GS.getVolume());
          
          tries = tries + 1;
      }//end while
      
      averageArea = (SA / tries);
      averageVolume = (V / tries);
      
      for(int i = 0; i < arraySA.size(); i++) {
          
          masterMeanSA = (masterMeanSA + Math.pow((arrayV.get(i) - averageVolume), 2) / arraySA.size());
          masterMeanV = (masterMeanV + Math.pow((arraySA.get(i) - averageArea), 2) / arrayV.size());
      }//end for
      
      
      SDSA = Math.sqrt(masterMeanSA);
      SDV = Math.sqrt(masterMeanV);
      
      System.out.println("\nThe trigger was: " + trigger);
      System.out.println("The sentinel has the final answer of: " + sentinel);
      System.out.println("It took " + tries + " attempts to activate the trigger\n\n");
      
      System.out.printf("The average surface area is: %.2f\n", averageArea);
      System.out.printf("The average volume is: %.2f\n", averageVolume);
      System.out.printf("The standard deviation for surface area is: %.2f\n", SDSA);
      System.out.printf("The standard deviation for volume is: %.2f\n\n", SDV);
    }//end main
}//end TestGeoClass
