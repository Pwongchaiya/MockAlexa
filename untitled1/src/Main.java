public class Main {
  public static void main(String[] args) {
    LivingRoomLight lightSwitch = new LivingRoomLight();
    lightSwitch.setLightSwitch();
    lightSwitch.setBrightnessLvl(80);
    lightSwitch.setLightSwitch();
    lightSwitch.setState("off");
    lightSwitch.setLightSwitch();

    Alexa alexa = new Alexa(new LightSwitch("off"),new Door("open"));
    alexa.setLight("on");
    alexa.setDoor("closed");
    alexa.lightStatus();
    alexa.doorStatus();

  }
}
