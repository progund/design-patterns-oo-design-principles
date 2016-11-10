public class Main{
  public static void main(String[] args){
    Employee bob = new Employee("Bob", "IT Department", new Role("Engineer"));
    bob.addRole(new Role("Group manager"));
    bob.addRole(new Role("Union representative"));
    System.out.println(bob);
    bob.removeRole(new Role("Group manager"));
    System.out.println(bob);
    java.util.HashSet<Role> set = new java.util.HashSet<Role>();
    set.add(new Role("This is a test"));
    System.out.println("Does hashCode work with contains()? " + 
                       set.contains(new Role("This is a test")));
    System.out.println(set);
    // Set's should have unique members
    set.add(new Role("This is a test"));
    set.add(new Role("This is a test"));
    set.add(new Role("This is a test"));
    System.out.println("After multiple adds of the same: " + set);
    set.add(new Role("This is another test"));
    System.out.println("Should contain two elements: " + set);
    set.remove(new Role("This is another test"));
    System.out.println("Should contain only the first: " + set);    
  }
}
