import java.util.Iterator;
import java.util.ArrayList;

public class EventQueueTest{
	public static void main(String[] args){
		// Three test individuals are constructed 		
		Individual myIndividual = new Individual(new City[0]);
		Event myEvent1 = new Event('m', 300.500, myIndividual);
		
		Individual myIndividual2 = new Individual(new City[1]);
		Event myEvent2 = new Event('r', 200.700, myIndividual);

		Individual myIndividual3 = new Individual(new City[1]);
		Event myEvent3 = new Event('d', 350.700, myIndividual);
		
		// Constructs an ArrayList and adds the three test events
		ArrayList<Event> event = new ArrayList<Event>();		
		event.add(myEvent1);
		event.add(myEvent2);
		event.add(myEvent3);
				
		// Loops through the ArrayList and prints the value
		int i = 0;
		while(i<event.size()){
			System.out.println(event.get(i));
			i= i+1;
		}
	}
}