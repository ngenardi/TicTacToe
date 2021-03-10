public class RoachPopulation
{
	public double population;
		
	public RoachPopulation(double userInput)
	{
		population=userInput;
	}
	
	public void breed() 
	{
		population= population*2;
	}
		
	public double spray(double percent) 
	{
		double deathpop = population *(percent/100); 
		population = population - deathpop;  
	return deathpop;
	}

	public double getRoaches()
	{
		return population;
	}
}