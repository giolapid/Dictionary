//Gio Lapid
//CS12B
//07/22/13
//PA3
//DictionaryTest.java
//Tests Client for the Dictionary class

public class DictionaryTest{
    
    public static void main(String[] args){
		String v;
		//checks insert()
		Dictionary A = new Dictionary();
		A.insert("1","a");
	       	A.insert("2","b");
	       	A.insert("3","c");
		System.out.println(A);
		////checks delete
		A.delete("1");
		A.delete("3");
		A.delete("2");
		//checks lookup
      		System.out.println(A.lookup("1"));

			       							A.insert("2","a");
				System.out.println(A.size());
				//		A.delete("2");
		System.out.println(A);
		System.out.println(A.size());
		//checks insert() doubling exception
		A.insert("1", "a");
		A.makeEmpty();
		//		A.insert("1", "b");
		System.out.println(A);
		System.out.println(A.size());
		System.out.println(A.isEmpty());
	}
}