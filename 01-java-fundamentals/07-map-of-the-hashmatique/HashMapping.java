
import java.util.HashMap;
import java.util.Set;

public class HashMapping {
    public static void main(String[] args) {
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Nose On The Grindstone", "It takes twice as long to build bridges you've burned.");
        trackList.put("Heavy","Come heavy or don't come at all.");
        trackList.put("Frogman","Last of the bare knuckle fighters");
        trackList.put("Hard Times","My sweat and my wages they don't seem to weight out.");
        Set<String> track = trackList.keySet();
        System.out.println(trackList.get("Heavy"));
        for (String key : track){
            System.out.println(key +  " : "+ trackList.get(key));
        }
    }
}
