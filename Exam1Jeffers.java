import java.util.Scanner;

/** This program helps determine COVID-19 risk and whether a return to work is safe.
   */
   
public class Exam1Jeffers
{
   public static void main(String[] args)
   {
   
      //Create Scanner object for keyboard input.
      Scanner keyboard = new Scanner (System.in);
      
      //Declare and initializing variables.
      double countyResidents = 0, //Total number of residents in county.
             covidCases = 0,      //Total number of COVID-19 cases in the last 14 days.
             casesPer100k = 0;    //Total number of COVID-19 cases in the last 14 days per 100,000.
      
      String countyName = "",     //Name of the county.
             riskTier = "",       //Risk tier color.
             warning = "";        //For warning message.
      
      //Declare and initialize constants.
      final String TITLE = "COVID-19 Risk Assessment Utility";  //Title for output, the following 2 are the warning options.
      final String WARNING_RED_ORANGE = "Based on your current risk tier, it is not possible for you to return to work in person. \n\nPlease remind all employees to guard against COVID-19 spread by following all CDC guidelines.";
      final String WARNING_YELLOW = "Based on your current risk tier, it is possible for you to return to work in person. \n\nEmployees returning to work in person are required to submit to a temperature check before being allowed to enter the workplace. \n\nEmployees must wear masks at all times, remain at least 6 feet apart, and wash their hands frequently.";
      
      //Get the name of the county.
      System.out.print("What is the name of the county? ");
      countyName = keyboard.nextLine();
      
      //Get the number of COVID-19 cases in the last 14 days.
      System.out.print("What is the number of cases of COVID-19 in the last 14 days? ");
      covidCases = keyboard.nextDouble();
      
      //Get the number of county residents.
      System.out.print("What is the current number of residents in the county? ");
      countyResidents = keyboard.nextDouble();
      
      //Perform calculation per 100,000.
      casesPer100k = ((covidCases / countyResidents) * 100000);
      
      //Determine the Risk Tier.
      if (casesPer100k > 200)
         {
         riskTier = "Red";
         warning = WARNING_RED_ORANGE;
         }
      else if (casesPer100k > 100)
         {
         riskTier = "Orange";
         warning = WARNING_RED_ORANGE;
         }
      else
         {
         riskTier = "Yellow";
         warning = WARNING_YELLOW;
         }
      
      //Output
      System.out.println("");
      System.out.println(TITLE);
      System.out.println("County: " + countyName);
      System.out.printf("Cases per 100,000 Residents (Last 14 Days): %,.0f\n", casesPer100k);
      System.out.println("Risk Tier: " + riskTier);
      System.out.println("");
      System.out.println(warning);
   }
}