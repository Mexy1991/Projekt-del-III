import java.util.ArrayList;

public class Population{

	private ArrayList population;
	private double omega;
	private double lowestCost;
	private City[] bestPath;
	
	public Population(double omega){
		// Constructor that takes double omega as input and creates a new, empty population
		ArrayList population = new ArrayList();
		omega = this.omega;
		population = this.population;
		lowestCost = Double.MAX_VALUE;
	}

	public void add(Individual i){
		// This method adds the individual i to this population
		population.add(i);
		if(i.cost() < lowestCost){
			lowestCost = i.cost();
			bestPath = i.path();
		}
	}

	public boolean contains(Individual i){
		// This method returns true if this population contains the individual i
		return population.contains(i);
	}

	public void remove(Individual i){
		// This methos removes the individual i from this population, if it exists
		if(population.contains(i))
		population.remove(i);
	}
	
	public int size(){
	// This method returns the amount of individuals in the current population
		return population.size();
	}

	public double fitness(Individual i){
		// This method returns the fitness of individual i 
		return((omega + Math.pow((lowestCost/i.cost()),2))/(1.0+(2.0*omega)));
	}

	public City[] bestPath(){
		// This method returns a copy of the best path ever present in an Individual in the current population
		return bestPath;
	}

	public void epidemic(){
		// This method models epidemic in this population

		// Finds the five worst fitted individuals
		int i = 0;
		while(i < 5){
			findWorstFitted();
			i++; 
		}

	ArrayList tempList = new ArrayList();
	Object tempIndividual;

	// Finds the five best fitted individuals, removes them from the population and stores them in a temporary ArrayList
	int j = 0;
	while(j < 5){
		tempIndividual = findBestFitted(); 
		remove((Individual)tempIndividual);
		tempList.add(tempIndividual);
	} 

	// Creates a random event to determine when the epidemic should take place. It is calculated by the formula fit(p)^2 and added to the population
	for (Object temp : (ArrayList)population)
		if (tempList.size() > 0) {
			RandomUtils.getRandomEvent(Math.pow(fitness((Individual)temp), 2.0));
			tempList.add(temp);
		}
		population = tempList;
}

	public void findWorstFitted(){
		// Finds the worst fitted individual with the highest cost in the current population and removes them
		double min = Double.MIN_VALUE;
		Individual tempIndividual = null;

		for (Object temp : (ArrayList)population)
			if (((Individual)temp).cost() > min) {
				min = ((Individual)temp).cost();
				tempIndividual = (Individual)temp;
			}
		remove(tempIndividual);
	}

	public Individual findBestFitted(){
		// Returns the best fitted individual with the lowest cost in the current population
		double max = Double.MAX_VALUE;
		Individual tempIndividual = null;
		
		for (Object temp : (ArrayList)population)
			if (((Individual)temp).cost() < max) {
				max = ((Individual)temp).cost();
				tempIndividual = (Individual)temp;
			}
		return tempIndividual;
	}
}
