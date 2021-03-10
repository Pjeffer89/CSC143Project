import java.util.Scanner;

/**
 This program assesses user computer hardware for gaming.
 */
 
public class Project_patrick_jeffers
{
   public static void main(String[] args)
   {
      //Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner (System.in);
      
      //Get GPU clock speed from user in Megahertz.
      System.out.print("Enter your GPU's speed in Megahertz: ");
      double gpumhz;
      gpumhz = keyboard.nextDouble();
      
      //Get the CPU speed from the user in Megahertz.
      System.out.print("Enter your CPU's speed in Megahertz: ");
      double cpumhz;
      cpumhz = keyboard.nextDouble();
      
      //Get the number of cores in users CPU.
      System.out.print("Enter the number of cores your CPU has: ");
      int cpucores;
      cpucores = keyboard.nextInt();
      
      //Get resolution of monitor.
      System.out.println("1. 1280 x 720");
      System.out.println("2. 1920 x 1080");
      System.out.println("3. 2560 x 1440");
      System.out.println("4. 3840 x 2160");
      System.out.print("Please select the number coresponding to your monitors resolution: ");
      int monitor;
      monitor = keyboard.nextInt();
   }
}