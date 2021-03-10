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
      System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
      double gpumhz;
      gpumhz = keyboard.nextDouble();
      
      //Get the CPU speed from the user in Megahertz.
      System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
      double cpumhz;
      cpumhz = keyboard.nextDouble();
      
      //Get the number of cores in users CPU.
      System.out.print("Please enter the number of cores of your processor: ");
      int cpucores;
      cpucores = keyboard.nextInt();
      
      //Get resolution of monitor.
      System.out.println("What is the resolution of your monitor?");
      System.out.println("    1. 1280 x 720");
      System.out.println("    2. 1920 x 1080");
      System.out.println("    3. 2560 x 1440");
      System.out.println("    4. 3840 x 2160");
      System.out.print("Please select from the options above: ");
      int monitor;
      monitor = keyboard.nextInt();
      
      //Create multiplier for later calculation.
      double multiplier;
      String resolution;
      if (monitor == 4)
      {
         resolution = "3840 x 2160";
         multiplier = 0.35;
      }
      else if (monitor == 3)
      {
         resolution = "2560 x 1440";
         multiplier = 0.55;
      }
      else if (monitor == 2)
      {
         resolution = "1920 x 1080";
         multiplier = 0.75;
      }
      else
      {
         resolution = "1280 x 720";
         multiplier = 1;
      }
      
      //Calculate the performance score.
      double performance;
      performance = ((5 * gpumhz) + (cpucores * cpumhz)) * multiplier;
      
      //Calculate the graphics quality.
      String graphics;
      if (performance > 17000)
      {
         graphics = "Ultra";
      }
      else if (performance > 15000)
      {
         graphics = "High";
      }
      else if (performance > 13000)
      {
         graphics = "Medium";
      }
      else if (performance > 11000)
      {
         graphics = "Low";
      }
      else 
      {
         graphics = "Unable to Play";
      }
      
      //Create heading.
      String heading;
      heading = "Computer Hardware Graphics Quality Recommendation Tool";
      
      
      //Display results.
      System.out.println("");
      System.out.println("");
      System.out.println(heading);
      System.out.println("");
      System.out.println("");
      System.out.println("GPU Clock Speed: " + gpumhz + " MHz");
      System.out.println("CPU Clock Speed: " + cpumhz + " MHz");
      System.out.println("Number of cores: " + cpucores);
      System.out.println("Monitor Resolution: " + resolution);
      System.out.println("Performance Score: " + performance);
      System.out.println("Recommended Graphics Quality: " + graphics);
   }
}