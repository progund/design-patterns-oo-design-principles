import java.util.List;
import java.util.ArrayList;
public class Employee{
  private String name;
  private String department;
  private List<Role> roles;
  public Employee(String name, String department, Role initialRole){
    this.name = name;
    this.department = department;
    roles = new ArrayList<Role>();
  }
  public String name(){ return name; }
  public String department(){ return department; }
  public void addRole(Role role){
    roles.add(role);
  }
  public void removeRole(Role role){
    roles.remove(role);
  }
  @Override
  public String toString(){
    return String.format("%s at %s employed as %s", name, department, roles.toString());
  }
}
