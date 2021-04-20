

public class PieFactory implements DessertFactory
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
      return new ApplePie();
    }
    else if (  type == 1 )
    {
      return new LemonPie();
    }
    else
    {
      return new PumpkinPie();
    }
  }
}