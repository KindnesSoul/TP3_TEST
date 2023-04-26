package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if(input==null){return "Hello,my friend";}
		input=input.trim(); 
		if(input==""){return "Hello,my friend";}
		if ((input.toUpperCase().equals(input))){return("Hello,"+input+"!");}
		String[] word=input.split(",");
		if (word.length==2) {return ("Hello,"+Maj(word[0])+","+Maj(word[1]));}
		return("Hello,"+Maj(input));
	}
	public static String Maj(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}

}
