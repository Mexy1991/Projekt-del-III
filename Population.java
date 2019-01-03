public class Population{
	private Population population;
	private double omega;


/******

KUN ET UDSNIT AF BESKRIVELSEN:

Specifically, this class should provide the following methods:
• a constructor taking a parameter double omega as input and creating a new, empty population whose
fitness normalization parameter is omega;
• a method void add(Individual i) that adds i to this population;
• a method boolean contains(Individual i) that returns true if this population contains i;
• a method void remove(Individual i) that removes i from this population, if it is there;
• a method int size() returning the number of individuals currently in this population;
• a method void epidemic() that models an epidemic in this population;
• a method double fitness(Individual i) that returns the fitness of individual i with respect to this
population;
• a method City[] bestPath() that returns a copy of the best path ever present in an Individual in this
population.
To implement epidemics you need to decide whether or not to perform an action with a given probability.
You should use method boolean getRandomEvent(double probability) in class RandomUtils to make this
decision.



******/



	//Constructor

	public Population(double omega){
		//Constructs a new empty population
		Population population = new Population(omega);
		this.population = population;
		this.omega = omega;

	}

	public void add(Individual i){
		//Adds individual i to this population
		return;
	}

	public boolean contains(Individual i){
		//Returns true if this this population contains the individual i
		if()
		return;

	}

	public void remove(Individual i){
		//Removes the individual i from this population, if it exists
		return;
	}

	public int size(){
		//Returns the number of individuals in this population
		return;
	}

	public void epidemic(){
		//This method models an epidemic
		return;
	}

	public double fitness(Individual i){
		//Returns the fitness of the individual i with respect to this population
		return;
	}

	public City bestPath(){
		//Returns a copy of the best path ever present in an Individual in this population
		return;
	}

	//Har vi brug for at redefinere toString?


}