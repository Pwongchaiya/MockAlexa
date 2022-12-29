public class Alexa {

  private LightSwitch lightSwitch;
  private Door door;

  public Alexa(LightSwitch lightSwitch, Door door) {
    this.lightSwitch = lightSwitch;
    this.door = door;
  }

  public LightSwitch getLightSwitch() {
    return lightSwitch;
  }

  public void setLightSwitch(LightSwitch lightSwitch) {
    this.lightSwitch = lightSwitch;
  }

  public Door getDoor() {
    return door;
  }

  public void setDoor(Door door) {
    this.door = door;
  }

  public void setLight(String bool){
    lightSwitch.setState(bool);
  }

  public void setDoor(String bool){
    door.setState(bool);
  }

  public void doorStatus(){
    System.out.println("The Door is: "+door.getState());
  }

  public void lightStatus(){
    System.out.println("The Light is: "+lightSwitch.getState());
  }
}
