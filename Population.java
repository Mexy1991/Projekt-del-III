import java.util.ArrayList;
import java.util.Iterator;

public class Population
{
  private Object population;
  private City[] bestPath;
  private Object[] params = new Object[2];
  
  public Population(double omega)
  {
	this.population = new ArrayList();
    this.bestPath = null;
    this.params[0] = Double.valueOf(Double.MAX_VALUE);
    this.params[1] = Double.valueOf(omega);
		
  }
  
  public void add(Individual i)
  {
		population.add(i);
    if (i.cost() < ((Double)this.params[0]).doubleValue())
    {
      this.params[0] = Double.valueOf(i.cost());
      this.bestPath = i.path();
    }
  }
  
  	/*	population.add(i);
		if(i.cost() < lowestCost){
			lowestCost = i.cost();
			bestPath = i.path();
		}
  */
  
  
  
  public void remove(Individual i)
  {
    Iterator localIterator = ((ArrayList)this.population).iterator();
    while (localIterator.hasNext()) {
      if (localIterator.next() == i) {
        localIterator.remove();
      } else {
        localIterator.hasNext();
      }
    }
  }
  
  public boolean contains(Individual i)
  {
    return ((ArrayList)this.population).contains(i);
  }
  
  public int size()
  {
    return ((ArrayList)this.population).size();
  }
  
  public void epidemic()
  {
    for (int i = 0; i < 5; i++) {
      pigeon();
    }
    ArrayList localArrayList = new ArrayList();
    Object localObject;
    for (int j = 0; j < 5; j++)
    {
      localObject = eagle();
      remove((Individual)localObject);
      localArrayList.add(localObject);
    }
    for (Iterator localIterator = ((ArrayList)this.population).iterator(); localIterator.hasNext();)
    {
      localObject = localIterator.next();
      if (RandomUtils.getRandomEvent(Math.pow(fitness((Individual)localObject), 2.0D))) {
        localArrayList.add(localObject);
      }
    }
    this.population = localArrayList;
  }
  
  public double fitness(Individual i)
  {
    double d1 = ((Double)this.params[0]).doubleValue();
    d1 *= d1;
    double d2 = ((Double)this.params[1]).doubleValue();
    return (d2 + d1 / (i.cost() * i.cost())) / (1.0D + 2.0D * d2);
  }
  
  private void pigeon()
  {
    double d = Double.MIN_VALUE;
    Individual localIndividual = null;
    for (Object localObject : (ArrayList)this.population) {
      if (((Individual)localObject).cost() > d)
      {
        d = ((Individual)localObject).cost();
        localIndividual = (Individual)localObject;
      }
    }
    remove(localIndividual);
  }
  
  private Individual eagle()
  {
    Double localDouble = Double.valueOf(Double.MAX_VALUE);
    Individual localIndividual = null;
    for (Object localObject : (ArrayList)this.population) {
      if (((Individual)localObject).cost() < localDouble.doubleValue())
      {
        localDouble = Double.valueOf(((Individual)localObject).cost());
        localIndividual = (Individual)localObject;
      }
    }
    return localIndividual;
  }
  
  public City[] bestPath()
  {
    return this.bestPath;
  }
}
