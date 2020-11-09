
public interface Ringable {
	public default String ring(){
		return "Phone is ringing!!";
	}
	public default String unlock() {
		return "Phone is now unlocked";
	}
}
