public class Alexa {

  private final LightSwitch lightSwitch;
  private final Door door;

  public Alexa(LightSwitch lightSwitch, Door door) {
    this.lightSwitch = lightSwitch;
    this.door = door;
  }


  public void setLight(boolean bool){
    lightSwitch.setState(bool);
  }

  public void setDoor(Boolean bool){
    door.setState(bool);
  }

  public void doorStatus(){
    System.out.println("The Door is: "+door.getState());
  }

  public void lightStatus(){
    System.out.println("The Light is: "+lightSwitch.getState());
  }
}
