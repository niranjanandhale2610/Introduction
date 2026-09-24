package basics;

public class JavaBrushUp2 {

	public static void main(String[] args) {
		
		String s = "My name is neerja";
		String[] splittedS = s.split("is");
		System.out.println(splittedS[0]);
		System.out.println(splittedS[1].trim());
		
		for(int i =s.length()-1;i>=0 ;i--)
		{
			System.out.println(s.charAt(i));
		}



	}

}
