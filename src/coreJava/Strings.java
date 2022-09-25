package ConceptBased;

public class Strings {
	public static void main (String args[]) {
		
		String p = "hello";
		String  k = p.concat("world");
		System.out.println(p);
		System.out.println(k);
		System.out.println("*********************");
		System.out.println(p.equals("hello"));
		System.out.println(p.equalsIgnoreCase("HELLO"));
		
		String s = "praveen";
		System.out.println(s.charAt(4));
		System.out.println(s.contains("l"));
		String o = "hii this is,praveen kumar podela";
		System.out.println(o.substring(11,19));
		System.out.println(o.toUpperCase());
		System.out.println(o.toLowerCase());
		System.out.println(o.split(","));
		
	}
}
