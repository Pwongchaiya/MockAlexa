public class LightSwitch {
  private String state;

  public LightSwitch (String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setLightSwitch(String o){
    if (o.equalsIgnoreCase("on")){
      System.out.println("Lights are on");
      this.setState("on");
    }else if(o.equalsIgnoreCase("off")){
      System.out.println("Lights are off");
      this.setState("off");
    }
  }

}
