/*
Names: Bridget Naylor, Andy
Date:
Lab 12
Description: 
*/

class Main {
  public static void main(String[] args) {

    int minutesInDay = 600;
    int dayOfWeek = 7;
    CakeFactory cakeFact = new CakeFactory();
    PieFactory pieFact = new PieFactory();
    int numPiesMade = 0;
    int numCakesMade = 0;
    while( dayOfWeek != 0 )
    {
      if ( dayOfWeek % 2 == 1 )//pie
      {
        while ( minutesInDay > 0 )
        {
          int random = (int)(Math.random() * 3);
          int time = pieFact.makeDessert(random);
          minutesInDay -= time;
          numPiesMade++;
        }
      }
      else//cake
      {
        while ( minutesInDay > 0 )
        {
          int random = (int)(Math.random() * 3);
          int time = cakeFact.makeDessert(random);
          minutesInDay -= time;
          numCakesMade++;
        }
      }
      if ( dayOfWeek == 7 )
      {//mon
        System.out.println("Mon: Pies Made: " + numPiesMade);
      }
      else if ( dayOfWeek == 6 )
      {
        System.out.println("Tues: Cakes Made: " + numCakesMade);
      }
      else if ( dayOfWeek == 5 )
      {
        System.out.println("Wed: Pies Made: " + numPiesMade);
      }
      else if ( dayOfWeek == 4 )
      {
        System.out.println("Thurs: Cakes Made: " + numCakesMade);
      }
      else if ( dayOfWeek == 3 )
      {
        System.out.println("Fri: Pies Made: " + numPiesMade);
      }
      else if ( dayOfWeek == 2 )
      {
        System.out.println("Sat: Cakes Made: " + numCakesMade);
      }
      else if ( dayOfWeek == 1 )
      {
        System.out.println("Sun: Pies Made: " + numPiesMade);
      }
      dayOfWeek --;
      minutesInDay = 600;
      numPiesMade = 0;
      numCakesMade = 0;
    }
  }
}