import java.util.ArrayList;
import java.util.Iterator;

public class EventQueue{
	EventQueue eventQueue;
	//ArrayList<Event> listOfEvents = new ArrayList<Event>();
	ArrayList<Event> queue = new ArrayList<Event>();
	//arryalist eller linkedlist fordi de er variable størrelser og ordered

	public EventQueue(){
		// Constructs a new empty queue
		//EventQueue queue = new EventQueue();

		queue = this.queue;
	}


	public void add (Event e){
		//Adds the event e to this event queue
		queue.add(e);

	}
	
	

	public Event next(){
		// Return the next event in the queue and removes it afterwards. 
    	// Events are sorted after time
    	// Precondition: There is a next event. (Ikke?)

    	/*
    	* OBS OBS OBS OBS - Jeg synes, det der forloop er liiidt meget 
    	* copy-paste. Måske vi kan finde på en anden måde?
    	* Måske det bliver bedre med Iterator
    	*/
		
		    	Event firstEvent = queue.get(0);
    	ArrayList tempListOfEvents = queue;

		
		
		Iterator a =queue.iterator();
		
			while(a.hasNext()){
				
			System.out.println(a.next());
			}

    	//Mangler hele tids-halløjet



		tempListOfEvents.remove(firstEvent);

    	return firstEvent;

    	

    }

   public boolean hasNext(){
    	//This method returns true, if the event queue is not empty
    	if(queue.isEmpty()==true)
    		return false;
    		else return true;
    	}

    	
}

    	







		/*

    Event firstEvent = listOfEvents.get(0);
    Event nextEvent = listOfEvents.get(firstEvent+1);
    ArrayList tempListOfEvents = listOfEvents;
    for (nextEvent2 : tempListOfEvents) {
      if (nextEvent.time() < firstEvent.time()) {
        firstEvent = (Event)nextEvent;
      }
    }
    tempListOfEvents.remove(firstEvent);
    return firstEvent;
    */
