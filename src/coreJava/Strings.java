package PracticeBased;

public class Strings {
	public static void main (String args[]) {
		
		String p = "mist";
		String  k = p.concat("college");
		System.out.println(p);
		System.out.println(k);
		System.out.println("*********************");
		System.out.println(p.equals("mist"));
		System.out.println(p.equalsIgnoreCase("Mist"));
		
		String s = "praveen";
		System.out.println(s.charAt(4));
		System.out.println(s.contains("l"));
		String o = "the ramayan written, by vaalmiki";
		System.out.println(o.substring(11,19));
		System.out.println(o.toUpperCase());
		System.out.println(o.toLowerCase());
		System.out.println(o.split(","));
		
	}
}
