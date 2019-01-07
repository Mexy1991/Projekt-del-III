import java.util.Iterator;
import java.util.ArrayList;

public class EventQueueTest{
	
	public static void main(String[] args){
		
		//jeg konstruerer 3 individer som jeg skal bruge til at indsætte i mit array.
		
		Individual myIndividual = new Individual(new City[0]);
		Event myEvent1 = new Event('m', 300.500, myIndividual);
		
		Individual myIndividual2 = new Individual(new City[1]);
		Event myEvent2 = new Event('r', 200.700, myIndividual);

		Individual myIndividual3 = new Individual(new City[1]);
		Event myEvent3 = new Event('d', 350.700, myIndividual);
		
		
		//Constructor som laver min arrayliste "event"
		ArrayList<Event> event = new ArrayList<Event>();
				
				//Jeg tilføljer 3 individer til mit event array.
				event.add(myEvent1);
				event.add(myEvent2);
				event.add(myEvent3);
				
				
				//While loop, som looper indtil der ikke er flere individer i arrayet
				int i = 0;
				while(i<event.size()){
					
					System.out.println(event.get(i));
					i= i+1;
				}
	}}
