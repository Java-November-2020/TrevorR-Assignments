
public class PhoneTest {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("X", 100, "Verizon","Beep");
        Galaxy galaxy = new Galaxy("S9", 85 , "Sprint", "Boop");
        
        iphone.displayInfo();
        System.out.println(iphone.ring());
        System.out.println(iphone.unlock());
        
        galaxy.displayInfo();
        System.out.println(galaxy.ring());
        System.out.println(galaxy.unlock());
    }

}
