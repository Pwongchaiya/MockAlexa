public class LivingRoomLight extends LightSwitch{

  private int BrightnessLvl;

  public LivingRoomLight() {
    super("on");
    BrightnessLvl = 100;
  }


  public int getBrightnessLvl() {
    return BrightnessLvl;
  }

  public void setBrightnessLvl(int brightnessLvl) {
    this.BrightnessLvl = brightnessLvl;
  }

  public void setLightSwitch(){
    if (getState().equalsIgnoreCase("on")){
      System.out.println("Lights are " + getState() + " and bright brightness is at "+ getBrightnessLvl()+"%");
    }else if(getState().equalsIgnoreCase("off")){
      setBrightnessLvl(0);
      System.out.println("Lights are off");
    }
  }

}
