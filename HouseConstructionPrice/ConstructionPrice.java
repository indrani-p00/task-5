package cleancode.houseconstruction;



class ConstructionPrice

{

	ConstructionPrice(double totalarea,int typeofhouse) // totalarea = Total Area of the House and typeofhouse = Type of House

	{

		double constructioncost;

		double totalarea = this.totalarea;

		int typeofhouse = this.typeofhouse;

		double squarefeet = totalarea/10.764; // Converting Area into Square Feet

		//Type of House ... "1.Standard Material 2.Above Standard Material 3.High Standard Material 4.High Standard Material and Fully Automated Home"

		switch(typeofhouse)

		{

			case 1 : return 1200 * squarefeet; // Construction Cost for Standard Material

			case 2 : return 1500 * squarefeet; // Construction Cost for Above Standard Material

			case 3 : return 1800 * squarefeet; // Construction Cost for High Standard Material

			case 4 : return 2500 * squarefeet; // Construction Cost for High Standard Material and Fully Automated Home

		}
}
}