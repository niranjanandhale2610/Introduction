package basics;

import java.util.Arrays;
import java.util.List;

public class javaBrushUp {

	public static void main(String[] args) {
		
		int[] arr2 = {1,2,3,4,5,6};
		
		for(int i=0; i<arr2.length; i++) 
		{
			if(arr2[i] % 2 == 0 )
				
			System.out.println(arr2[i]);
			
			else 
			{
				System.out.println(arr2[i]+" is not multiply by 2");
			}
		}
		
//		String [] name = {"Niranjan","Laxman","Andhale"};
//		
//		for(String  s :name) 
//		{
//			System.out.println(s);
//		}
		
		String [] name = {"Niranjan","Laxman","Andhale"};
		
		List<String> nameList = Arrays.asList(name);
		System.out.println(nameList.contains("Niranjan"));

	}

}
