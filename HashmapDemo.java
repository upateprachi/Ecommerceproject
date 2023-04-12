import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> studDetails = new HashMap<Integer, String>(); // combination of keys and values

		studDetails.put(1, "monika"); // Entry
		studDetails.put(2, "kajal");
		studDetails.put(3, "raj");
		studDetails.put(4, "amol");
		studDetails.put(1, ""); // default 16.load factor 0.75
		studDetails.put(0, "");

		// one key can be null
		// but we can have multiple null values

		for (Map.Entry<Integer, String> st : studDetails.entrySet()) {
			System.out.println(st.getKey() + "" + st.getValue());
		}
	}

}
