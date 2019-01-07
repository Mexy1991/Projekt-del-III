import java.util.ArrayList;
import java.util.Iterator;

public class Population
{
  private Object contents;
  private City[] bestPath;
  private Object[] params = new Object[2];
  
  public Population(double paramDouble)
  {
    this.contents = new ArrayList();
    this.bestPath = null;
    this.params[0] = Double.valueOf(Double.MAX_VALUE);
    this.params[1] = Double.valueOf(paramDouble);
  }
  
  public void add(Individual paramIndividual)
  {
    ((ArrayList)this.contents).add(paramIndividual);
    if (paramIndividual.cost() < ((Double)this.params[0]).doubleValue())
    {
      this.params[0] = Double.valueOf(paramIndividual.cost());
      this.bestPath = paramIndividual.path();
    }
  }
  
  public void remove(Individual paramIndividual)
  {
    Iterator localIterator = ((ArrayList)this.contents).iterator();
    while (localIterator.hasNext()) {
      if (localIterator.next() == paramIndividual) {
        localIterator.remove();
      } else {
        localIterator.hasNext();
      }
    }
  }
  
  public boolean contains(Individual paramIndividual)
  {
    return ((ArrayList)this.contents).contains(paramIndividual);
  }
  
  public int size()
  {
    return ((ArrayList)this.contents).size();
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
    for (Iterator localIterator = ((ArrayList)this.contents).iterator(); localIterator.hasNext();)
    {
      localObject = localIterator.next();
      if (RandomUtils.getRandomEvent(Math.pow(fitness((Individual)localObject), 2.0D))) {
        localArrayList.add(localObject);
      }
    }
    this.contents = localArrayList;
  }
  
  public double fitness(Individual paramIndividual)
  {
    double d1 = ((Double)this.params[0]).doubleValue();
    d1 *= d1;
    double d2 = ((Double)this.params[1]).doubleValue();
    return (d2 + d1 / (paramIndividual.cost() * paramIndividual.cost())) / (1.0D + 2.0D * d2);
  }
  
  private void pigeon()
  {
    double d = Double.MIN_VALUE;
    Individual localIndividual = null;
    for (Object localObject : (ArrayList)this.contents) {
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
    for (Object localObject : (ArrayList)this.contents) {
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
