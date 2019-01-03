public class EventQueue{

	//Contructor
	EventQueue eventQueue = new EventQueue();




	public void add(Event e){
		//Adds event e to this queue

		return;

	}

	public Event next(){
		//Returns the next event in this queue and removes it afterwards
		if (eventQueue.hasNext())
			return e.next();
		else return;
	}

	public boolean hasNext(){
		//Returns true if the queue is not empty
		if(eventQueue == isEmpty())
			return false;
	}


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


}