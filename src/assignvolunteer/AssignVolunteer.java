/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignvolunteer;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class AssignVolunteer {

   
    public static void main(String[] args) {
       sampleClass();
    }
    
    public static void sampleClass()
    {
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco"; 
        
        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this:?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else... ");
        donationType = input.nextInt();
        
        if(donationType == CLOTHING_CODE)
            volunteer = CLOTHING_PRICER;
        else
            volunteer = OTHER_PRICER;
        
        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
    }
}
