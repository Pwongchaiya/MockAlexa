public class Main {
  public static void main(String[] args) {
    LivingRoomLight lightSwitch = new LivingRoomLight();
    lightSwitch.setLightSwitch();
    lightSwitch.setBrightnessLvl(80);
    lightSwitch.setLightSwitch();
    lightSwitch.setState(false);
    lightSwitch.setLightSwitch();

    Alexa alexa = new Alexa(new LightSwitch(false),new Door(true));
    alexa.setLight(true);
    alexa.setDoor(false);
    alexa.lightStatus();
    alexa.doorStatus();
  }
}
