public class Runner {
  public static void main(String[] args) {
        Car Audi = new Car(1998,"Audi", 130 , "Q3" );
        System.out.println(Audi.toString());
        Audi.setMiles(10000 );
      System.out.println(Audi.toString());
      Rectangle solia = new Rectangle( 17 , 7 );
      System.out.println(solia.getArea());
      System.out.println(solia.getDiagonal());
      System.out.println(solia.isSquare());
  }

}
