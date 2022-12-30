public class Door {

  private Boolean state;

  public Door(Boolean state) {
    this.state = state;
  }

  public Boolean getState() {
    return state;
  }

  public void setState(Boolean state) {
    this.state = state;
  }

  public void setDoorStatus(Boolean s){
    if (s){
      System.out.println("The door is open");
    }else{
      System.out.println("The door closed");
    }
  }
}

