package cleancode.houseconstruction;



import java.util.Scanner;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;



public class ConstructionPriceMain

{

	private static final Logger LOGGER= LogManager.getLogger(Main.class);

	

	public static void main(String [] args)

	{

		ConstructionPrice obj=new ConstructionPrice();

		int typeofhouse;

		double totalarea;

		Scanner sc=new Scanner(System.in);

		LOGGER.info("Available materials types\n");

		//Type of House is ... "1.Standard Material 2.Above Standard Material 3.High Standard Material 4.High Standard Material and Fully Automated Home"

		LOGGER.info("1.Standard materials\t2.Above standard materials\t3.High Standard material\t4..High Standard Material and Fully Automated Home");

		LOGGER.info("Choose a Type of House :");

		typeofhouse=sc.nextInt();

		if typeofhouse>4

		{

			LOGGER.info("Invalid choice\n");

			return;

		}

		LOGGER.info("Enter area : ");

		totalarea = sc.nextDouble();

		LOGGER.info("Cost of House construction is : "+obj.ConstructionCost(totalarea,typeofhouse)+"\n");

	}

}