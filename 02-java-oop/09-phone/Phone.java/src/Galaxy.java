
public class Galaxy extends Phone implements Ringable{
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
       return "Galaxy is ringing";
    }
    @Override
    public String unlock() {
        return "Galaxy is unlocked";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + "Version: " + getVersionNumber()+ " Battery: " + getBatteryPercentage() + " Carrier: " + getCarrier() + " Ringtone: " + getRingTone());
    }
}
