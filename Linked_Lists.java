
import java.util.LinkedList;

public class Linked_Lists {

	public static void main(String[] args) {
		
		//1 
		LinkedList<String> list = new LinkedList<>();
		
		//2
		list.add("stringone");
		list.add("stringtwo");
		list.add("stringthree");
		list.add("stringfour");
		list.add("stringfive");

		//3
		System.out.println("The first list : " + list);
		
		//4). This new string is added to the front of the list.
		list.addFirst("firststring");
		
		//5). This new string is added to the end of the list.
		list.addLast("laststring");
		
		//6 The new list after the modifications is printed.
		System.out.println("The second  list : " + list);

		//7
		list.get(0);
		
		//8
		System.out.println();
		System.out.println("The first item on the list is : " + list.toArray()[0]);
		
		//9
		list.set(0, "newfirststring");
		
		//10
		System.out.println();
		System.out.println("The newly set first item on the list is : " + list.toArray()[0]);
	
		//11
		list.removeFirst();
		list.removeLast();
		
		//12
		System.out.println();
		System.out.println("The list after the removing of first and last element : " + list);
	
		//13
		list.addFirst("helloguysimback");
		list.removeLast();
		
		//14
		System.out.println();
		System.out.println("The final list of five: " + list);
	}

}
