public class LightSwitch {
  private Boolean state;

  public LightSwitch (Boolean state) {
    this.state = state;
  }

  public Boolean getState() {
    return state;
  }

  public void setState(Boolean state) {
    this.state = state;
  }

  public void setLightSwitch(Boolean o){
    if (o){
      System.out.println("Lights are on");
    }else {
      System.out.println("Lights are off");
    }
  }

}

