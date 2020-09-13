
public class Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a=" javatraining";
		System.out.println(a.charAt(5));
		System.out.println(a.indexOf("l"));
		System.out.println(a.subSequence(0, 5));
		System.out.println(a.substring(1, 5));
		System.out.println(a.substring(4));
		System.out.println(a.replace("v", "m"));
		String[] arr=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.trim());
		System.out.println(a.concat(" Sheetal doing"));
	}

}
