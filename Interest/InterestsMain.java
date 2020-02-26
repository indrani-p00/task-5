package cleancode.Interest;



import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;



public class InterestsMain

{

	private static final Logger LOGGER= LogManager.getLogger(InterestsMain.class);

	

	public static void main(String[] args)

	{

		Scanner sc = new Scanner(System.in);

		int timePeriod;

		double principalAmount,rateOfInterest;

		int choice;

		LOGGER.info("1. SimpleInterest  2. CompundInterest\n");

		LOGGER.info("Enter your choice : ");

		choice=sc.nextInt();

		if(choice!=1 && choice!=2)

		{

			LOGGER.info("Invalid Choice");

		}

		else 

		{

			LOGGER.info("Enter principle amount : ");

			principalAmount=sc.nextDouble();

			LOGGER.info("Enter rate of Interest : ");

			rateOfInterest=sc.nextDouble();

			LOGGER.info("Enter timePeriod in years : ");

			timePeriod=sc.nextInt();

			SimpleCompoundInterest obj=new SimpleCompoundInterest(principalAmount,rateOfInterest,timePeriod);

			if(choice==1)

				LOGGER.info("Simple Interest is "+obj.SimpleInterest()+"\n");

			else

				LOGGER.info("Compound Interest is "+obj.CompoundInterest()+"\n");

		}

	}

}