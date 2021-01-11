/*
 * 
 * Author: Deeshan Mahida
 * Date: November 4 2020
 * IDE: Eclipse 2020
 * 
 */

import java.util.ArrayList;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class TestGeoSolids {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		int count = 0;
	    int upper = 8;
	    int lower = 2;
	    int sentinel = 0;
	    int trigger = 0;
	    int tries = 0;
	    
	    String hUpper = JOptionPane.showInputDialog("What is your upper boundary for height?");
	    String hLower =	JOptionPane.showInputDialog("What is your lower boundary for height?");
	    String rUpper =	JOptionPane.showInputDialog("What is your upper boundary for radius?");
	    String rLower =	JOptionPane.showInputDialog("What is your lower boundary for radius?");
        String wUpper = JOptionPane.showInputDialog("What is your upper boundary for width?");
	    String wLower =	JOptionPane.showInputDialog("What is your lower boundary for width?");
	    String lUpper =	JOptionPane.showInputDialog("What is your upper boundary for length?");
	    String lLower =	JOptionPane.showInputDialog("What is your lower boundary for length?");
	    
	    int inputHeightUpper = Integer.parseInt(hUpper);
	    int inputHeightLower = Integer.parseInt(hLower);
	    int inputRadiusUpper = Integer.parseInt(rUpper);
	    int inputRadiusLower = Integer.parseInt(rLower);
	    int inputWidthUpper = Integer.parseInt(wUpper);
	    int inputWidthLower = Integer.parseInt(wLower);
	    int inputLengthUpper = Integer.parseInt(lUpper);
	    int inputLengthLower = Integer.parseInt(lLower);
	    
	    while(inputHeightUpper <= 1 || inputHeightLower <= 1 || inputRadiusUpper <= 1 || inputRadiusLower <= 1 || inputWidthUpper <= 1 || inputWidthLower <= 1 || inputLengthUpper <= 1 ||  inputLengthLower <= 12) {
	    	
	    	if(inputHeightUpper <= 1) {
	    		
	    		hUpper = JOptionPane.showInputDialog("Please enter a upper height boundary greater than 1");
	    	}//end if
	    	
	    	else if(inputHeightLower <= 1) {
	    		
	    		hLower = JOptionPane.showInputDialog("Please enter a lower height boundary greater than 1");
	    	}//end if

	    	else if(inputRadiusUpper <= 1) {
	
	    		rUpper = JOptionPane.showInputDialog("Please enter a upper radius boundary greater than 1");
	    	}//end if

	    	else if(inputRadiusLower <= 1) {
	
	    		rLower = JOptionPane.showInputDialog("Please enter a lower radius boundary greater than 1");
	    	}//end if

	    	else if(inputWidthUpper <= 1) {
	
	    		wUpper = JOptionPane.showInputDialog("Please enter a upper width boundary greater than 1");
	    	}//end if

	    	else if(inputWidthLower <= 1) {
	
	    		wLower = JOptionPane.showInputDialog("Please enter a lower width boundary greater than 1");
	    	}//end if

	    	else if(inputLengthUpper <= 1) {
	
	    		lUpper = JOptionPane.showInputDialog("Please enter a upper length boundary greater than 1");
	    	}//end if

	    	else if(inputLengthLower <= 1) {
	
				lLower = JOptionPane.showInputDialog("Please enter a lower length boundary greater than 1");
			}//end if
			
			inputHeightUpper = Integer.parseInt(hUpper);
		    inputHeightLower = Integer.parseInt(hLower);
		    inputRadiusUpper = Integer.parseInt(rUpper);
		    inputRadiusLower = Integer.parseInt(rLower);
		    inputWidthUpper = Integer.parseInt(wUpper);
		    inputWidthLower = Integer.parseInt(wLower);
		    inputLengthUpper = Integer.parseInt(lUpper);
		    inputLengthLower = Integer.parseInt(lLower);
	    	
			count = count + 1;
			
	    }//end while
	    
	    System.out.println("User corrected " + count + " boundary errors.\n");
	    
	    ArrayList<Double> arraySA = new ArrayList<>();
	    ArrayList<Double> arrayV = new ArrayList<>();
		
	    sentinel = (int)(Math.random()*(upper - lower + 1) + lower);
	    
	    while(sentinel != trigger) {
	         
	          count = count + 1;
	         
	          GeoSolid GS = new GeoSolid(inputHeightUpper, inputHeightLower, inputRadiusUpper, inputRadiusLower, inputWidthUpper, inputWidthLower, inputLengthUpper, inputLengthLower);
	          
	          trigger = (int)(Math.random()*(upper - lower + 1) + lower);
	          
	          System.out.println(count + ") " +GS);
	          
	          arraySA.add(GS.getArea());
	          arrayV.add(GS.getVolume());
	          
	          tries = tries + 1;
	      }//end while
	    
	      MiscUtils MU = new MiscUtils();
	      
	      DecimalFormat f = new DecimalFormat("0.00");
	      
	      System.out.println("\nThe trigger was: " + trigger);
	      System.out.println("The sentinel has the final answer of: " + sentinel);
	      System.out.println("It took " + tries + " attempts to activate the trigger\n\n");
	      
	      System.out.println("The average surface area is: " + f.format(MU.FindAvgs(arraySA)));
	      System.out.println("The average volume is: " + f.format(MU.FindAvgs(arrayV)));
	      System.out.println("The standard deviation for surface area is: " + f.format(MU.FindSTDDev(arraySA)));
	      System.out.println("The standard deviation for volume is: " + f.format(MU.FindSTDDev(arrayV)));
	    
	}//end main

}//end TestGeoSolids
