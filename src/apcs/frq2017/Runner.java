package apcs.frq2017;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phrase phrase1 = new Phrase("A cat ate late.");
		phrase1.replaceNthOccurrence("at", 1, "rane");
		System.out.println("Should be: A crane ate late.");
		System.out.println(phrase1);
		
		Phrase phrase2 = new Phrase("A cat ate late.");
		phrase2.replaceNthOccurrence("at", 6, "xx");
		System.out.println("Should be: A cat ate late.");
		System.out.println(phrase2);
		
		Phrase phrase3 = new Phrase("A cat ate late.");
		phrase3.replaceNthOccurrence("bat", 2, "xx");
		System.out.println("Should be: A cat ate late.");
		System.out.println(phrase3);
		
		Phrase phrase4 = new Phrase("aaaa");
		phrase4.replaceNthOccurrence("aa", 1, "xx");
		System.out.println("Should be: xxaa");
		System.out.println(phrase4);
		
		Phrase phrase5 = new Phrase("aaaa");
		phrase5.replaceNthOccurrence("aa", 2, "bbb");
		System.out.println("Should be: abbba");
		System.out.println(phrase5);
		
		Phrase phrase6 = new Phrase("A cat ate late.");
		System.out.println("Should be 11");
		System.out.println(phrase6.findLastOccurrence("at"));
		System.out.println("Should be 2");
		System.out.println(phrase6.findLastOccurrence("cat"));
		System.out.println("Should be -1");
		System.out.println(phrase6.findLastOccurrence("bat"));
	}

}
