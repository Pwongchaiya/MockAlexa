public class Alexa {

  private final LightSwitch lightSwitch;
  private final Door door;

  public Alexa(LightSwitch lightSwitch, Door door) {
    this.lightSwitch = lightSwitch;
    this.door = door;
  }

  public void doorStatus(){
    System.out.println("The Door is: "+door.getState());
  }

  public void lightStatus(){
    System.out.println("The Light is: "+lightSwitch.getState());
  }
    public void setLight(String bool){
    lightSwitch.setState(bool);
  }

  public void setDoor(String bool){
    door.setState(bool);
  }
}
