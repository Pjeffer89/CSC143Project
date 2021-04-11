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
      
      //Create heading.
      String heading = "Computer Hardware Graphics Quality Recommendation Tool";
      
      //New variables.
      int numberOfComputers = 0;
      
      //Get number of Cumputers to test.
      System.out.print("How many computers are being processed? ");
      numberOfComputers = keyboard.nextInt();
      
      //Validation
      while(numberOfComputers < 1)
      {
         System.out.print("Please enter a number greater than 0.\nHow many computers are being processed? ");
         numberOfComputers = keyboard.nextInt();
      }

      
      //Heading
      System.out.println("");
      System.out.println("");
      System.out.println(heading);
      System.out.println("");
      System.out.println("");
      
      //For
      while (numberOfComputers > 0)
      {
         //Get GPU clock speed from user in Megahertz.
         System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
         double gpumhz;
         gpumhz = keyboard.nextDouble();
         while (gpumhz < 800 || gpumhz > 2000)
            {
               System.out.print("The GPU clock speed should be between 800 and 2000MHz.\nPlease enter the clock speed (in Megahertz) of your graphics card: ");
               gpumhz = keyboard.nextDouble();
            }
      
         //Get the CPU speed from the user in Megahertz.
         System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
         double cpumhz;
         cpumhz = keyboard.nextDouble();
         while (cpumhz < 1000 || cpumhz > 5500)
            {
               System.out.print("The CPU clock speed should be between 1000 and 5500MHz.\nPlease enter the clock speed (in Megahertz) of your processor: ");
               cpumhz = keyboard.nextDouble();
            }
      
         //Get the number of cores in users CPU.
         System.out.print("Please enter the number of cores of your processor: ");
         int cpucores;
         cpucores = keyboard.nextInt();
         while (cpucores < 1 || cpucores > 16)
            {
               System.out.print("The number of cores should be between 1 and 16.\nPlease enter the number of cores of your processor: ");
               cpucores = keyboard.nextInt();
            }
      
         //Get resolution of monitor.
         System.out.println("What is the resolution of your monitor?");
         System.out.println("    1. 1280 x 720");
         System.out.println("    2. 1920 x 1080");
         System.out.println("    3. 2560 x 1440");
         System.out.println("    4. 3840 x 2160");
         System.out.print("Please select from the options above: ");
         int monitor;
         monitor = keyboard.nextInt();
         while (monitor < 1 || monitor > 4)
            {
               System.out.print("Please make a selection between 1 and 4. ");
               monitor = keyboard.nextInt();
            }
      
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
      
      
         //Display results.
         System.out.println("");
         System.out.println("");
         System.out.println("GPU Clock Speed: " + gpumhz + " MHz");
         System.out.println("CPU Clock Speed: " + cpumhz + " MHz");
         System.out.println("Number of cores: " + cpucores);
         System.out.println("Monitor Resolution: " + resolution);
         System.out.println("Performance Score: " + performance);
         System.out.println("Recommended Graphics Quality: " + graphics);
         System.out.println("");
         System.out.println("");
      numberOfComputers--;
      }     
   }
}