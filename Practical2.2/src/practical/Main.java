package practical;

public class Main {

	public static void main(String[] args) {
		
		Csc2001LinkedListG<String> genericlist1 = new Csc2001LinkedListG<String>();
		Csc2001LinkedListG<Integer> genericlist2 = new Csc2001LinkedListG<Integer>();
		
		System.out.println(genericlist1.isEmpty());
		genericlist1.addFirst("Hello");
		genericlist1.addAtEnd("World");
		System.out.println(genericlist1.toString());
		System.out.println(genericlist1.getHead().data);
		System.out.println(genericlist1.removeFirst());
		System.out.println(genericlist1.toString());
		

	}

}
