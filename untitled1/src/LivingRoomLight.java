public class LivingRoomLight extends LightSwitch{

  private int BrightnessLvl;

  public LivingRoomLight() {
    super(true);
    BrightnessLvl = 100;
  }


  public int getBrightnessLvl() {
    return BrightnessLvl;
  }

  public void setBrightnessLvl(int brightnessLvl) {
    this.BrightnessLvl = brightnessLvl;
  }

  public void setLightSwitch(){
    if (getState()){
      System.out.println("Lights are " + getState() + " and brightness level is at "+ getBrightnessLvl()+"%");
    }else{
      setBrightnessLvl(0);
      System.out.println("Lights are off");
    }
  }
}
