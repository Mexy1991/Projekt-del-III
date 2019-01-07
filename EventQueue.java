import java.util.ArrayList;
import java.util.Iterator;

public class EventQueue{
	EventQueue eventQueue;
	ArrayList<Event> queue = new ArrayList<Event>();

	public EventQueue(){
		// Constructs a new empty event queue
		queue = this.queue;
	}

	public void add (Event e){
		// Adds the event e to this event queue
		queue.add(e);
	}
	
	public Event next(){
		// Return the next occuring event in the queue and removes it afterwards		
		Event firstEvent = queue.get(0);
    	ArrayList tempListOfEvents = queue;
	
		/*
		Iterator it = queue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/

		for (Object tempIndividual : tempListOfEvents) 
			if (((Event)tempIndividual).time() < firstEvent.time()) 
			  firstEvent = (Event)tempIndividual;
		tempListOfEvents.remove(firstEvent);
		return firstEvent;
	}




	/*tempListOfEvents.remove(firstEvent);
    return firstEvent;
	}*/
	


   public boolean hasNext(){
		//This method returns true, if the event queue is not empty
    	if(queue.isEmpty() == true)
    		return false;
			else return true;
		}


    

    	
}
