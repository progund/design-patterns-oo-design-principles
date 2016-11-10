public class Role{
  private String name;
  public Role(String roleName){
    this.name = roleName;
  }

  public String name(){ return name; }
  @Override
  public String toString(){
    return name;
  }

  @Override
  public boolean equals(Object o){
    if(! (o instanceof Role)){
      return false;
    }
    return ((Role)o).name.equals(this.name);
  }
  @Override
  public int hashCode(){
    return 17 + 31*name.hashCode();
  }
}
