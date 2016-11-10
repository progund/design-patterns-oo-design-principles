import java.util.List;
import java.util.LinkedList;
public class Main{
  public static void main(String[] args){
    List<Person> persons = new LinkedList<>();
    
    persons.add(new Person("Bob", "bob@email.com"));
    persons.add(new Person("Ben", "ben@email.com"));
    persons.add(new Person("Pam", "pam@email.com"));
    persons.add(new Person("Eve", "eve@email.com"));
    persons.add(new Person("Guy", "guy@email.com"));
    persons.add(new Person("Lis", "lis@email.com"));
    persons.add(new Person("Ann", "ann@email.com"));
    System.out.println(persons);
    Storage.save(persons);
    System.out.println("Saved");
    persons=Storage.fetchPersons();
    System.out.println(persons);
  }
}
