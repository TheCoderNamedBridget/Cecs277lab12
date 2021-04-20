

public class CakeFactory implements DessertFactory
{
  public int makeDessert( int type )
  {
    Dessert des = createDessert( type );
    int time = des.prepare() + des.bake();
    return time;
  }

  public Dessert createDessert( int type )
  {
    if ( type == 0 )
    {
      return new CarrotCake();
    }
    else if (  type == 1 )
    {
      return new ChocolateCake();
    }
    else
    {
      return new PoundCake();
    }
  }

}