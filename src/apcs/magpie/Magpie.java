package apcs.magpie;

/**
 * This class implements a Chatbot named Magpie It is loosely based on the
 * COllege Board Magpie Lab:
 * http://media.collegeboard.com/digitalServices/pdf/ap/ap-compscia-magpie-lab-student-guide.pdf
 *
 */
public class Magpie {
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		statement = statement + " ";
		statement = statement.toLowerCase();
		String response = "";
		if(statement.indexOf("no ") != -1) {
			response = "Why not?";
		}
		else if(statement.indexOf("yes ") != -1) {
			response = "That's good to hear, how's life?";
		}
		else if(statement.indexOf("mother ") != -1 || statement.indexOf("brother ") != -1 || statement.indexOf("sister ") != -1 || statement.indexOf("father ") != -1) {
			response = "Tell me more about your family";
		}
		else if(statement.indexOf("? ") != -1) {
			int i = (int)(Math.random()* 4);
			if(i == 1) {
			response = "yep";
			}
			if(i == 0) {
			response = "nope";
			}
			if(i == 3) {
			response = "bad";
			}
			if(i == 2) {
			response = "good";
			}
		}
		else if(statement.indexOf("im ") != -1 || statement.indexOf("i'm ") != -1 || statement.indexOf("i am ") != -1 ) {
			response = "Hi " + statement.substring(statement.indexOf("m") + 2) + ", I'm dad.";
		}
		
		else {
			response = this.getRandomResponse();
		}
		
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		int type = (int) (Math.random() * 9);
		String[] resp = new String[9];
		resp[0] = "That's cool, how's life?";
		resp[1] = "Nice, how was your day?";
		resp[2] = "What is up with that?";
		resp[3] = "Good weather we are having, isn't it?";
		resp[4] = "So how's it going?";
		resp[5] = "Cool, I don't care";
		resp[6] = "That sounds like so much fun";
		resp[7] = "Whats your name?";
		resp[8] = "Interesting, tell me more";

		String response = resp[type];

		return response;
	}
}
