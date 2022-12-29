public class Door {

  private String state;

  public Door(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setDoorStatus(String s){
    if ("open".equalsIgnoreCase(s)){
      System.out.println("The door is open");
      setState("open");

    }else if(s.equalsIgnoreCase("closed")){
      System.out.println("The door closed");
      setState("closed");
    }
  }
}
