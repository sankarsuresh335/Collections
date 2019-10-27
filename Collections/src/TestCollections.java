import java.util.ArrayList;

public class TestCollections {

	public static void main(String[] args) {
		
		
		ArrayList<String> books= new ArrayList<>();
		
		System.out.println("book sizw"+books.size());
		
		books.add("c");
		
		books.add("c++");
		
		books.add("java");
		
		System.out.println("books size"+ books.size());
		
		System.out.println("books size"+books.toString());
		
		books.add(1,"python");
		System.out.println("boooks size"+books.toString());
		
		books.remove("c");
		
		System.out.println("removing c ");
		
		System.out.println("books after removing c"+books.toString());
		
			

	}

}
