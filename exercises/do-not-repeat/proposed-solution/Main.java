public class Main{
  public static void main(String[] args){
    Person p1 = new Person("Ben Afflec");
    Person p2 = new Person("Ben Stiller", "ben@hollywood.com");
    Person p3 = new Person("Ben Kingsley", "dentist@email.com", "555-123-124");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    //new Person(null);
    //new Person(null, "asdf");
    //new Person(null, "lkj", "sdf");
  }
}
