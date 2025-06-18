public class StringReverser {

/*Elementary solution:
	public String reverse(String s) {
	    String t = "";
	    for (int i = s.length() - 1; i >= 0; i -= 1) {
	        t += s.charAt(i);
	    }
	    return t;
	}
*/

//with StringBuilder:
	public String reverse(String s) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = s.length()-1; i >= 0; i--) {
	        sb.append(s.charAt(i));
	    }
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		StringReverser sr = new StringReverser();
		String s = sr.reverse("csigaliba");
		System.out.println(s);
	}
}