import java.util.ArrayList;
import java.util.Iterator;

//public class EventQueue implements Iterable<Event>{
	
/*
	private int current = 0; 
	private String[] contents;

	//Contructor
	EventQueue eventQueue = new EventQueue();
	ArrayList<Events> queue = new ArrayList<Events>();
		
	



	public void add(Event e){
		//Adds event e to this queue
		for (Event e : queue) {
		   queue.add(e);
		   }
	}

	public Event next(){
		//Returns the next event in this queue and removes it afterwards
	/*	if (eventQueue.hasNext())
			return e.next();
		else return;
		*/

/*		Event nextEvent = queue.get(0);
		ArrayList tempArrayList = queue;

		for (ArrayList whatever : tempArrayList){
		//Do something
		if(whatever.time() < nextEvent.time()){
			nextEvent = whatever;
			}
		}

		tempArrayList.remove(nextEvent);

		return nextEvent;

	}

	public boolean hasNext(){
		//Returns true if the queue is not empty
		/*if(eventQueue == isEmpty())
			return false;
	*/
			//return (current < contents.length);

		/*	if(queue =!isEmpty()) {
			return true;
			}
			else{
			return false;
			}


			
	}

	*/


/******

This class implements a data structure usually known as a priority queue: it can store elements of a particular
type (in our case, Events) and returns them in an order inherent to that type (in our case, Events are returned
ordered by the time at which they occur).

This class should provide the following methods:
• a constructor that constructs a new, empty event queue;
• a method void add(Event e) that adds e to this event queue;
• a method Event next() that returns the next event in this queue, also removing it;
• a method boolean hasNext() returning true if this event queue is not empty.

Your class should also implement the Iterable<Event> interface. The iterator should visit all the events in the
order in which they are returned by next().


******/


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

    	//Mangler hele tids-halløjet

    	for (Object tempEvent : tempListOfEvents){
    		if(((Event)tempEvent).time() < firstEvent.time())
    			firstEvent = (Event)tempEvent;
    	}

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
