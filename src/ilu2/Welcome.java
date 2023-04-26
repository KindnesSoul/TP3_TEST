package ilu2;

public class Welcome {
	
	public static String welcome(String input) {
		if(input==null){return "Hello,my friend";}
		input=input.trim(); 
		if(input==""){return "Hello,my friend";}
		if ((input.toUpperCase().equals(input))){return("Hello,"+input+"!");}
		String[] word=input.split(",");
		if (word.length==2) {return ("Hello,"+Maj(word[0])+","+Maj(word[1]));}
		if (word.length>2) {return("Hello"+StrNom(word));}
		return("Hello,"+Maj(input));
	}
	public static String Maj(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	public static String StrNom(String[] word) {
		String input="";
		for (int i=0;i<word.length;i++) {
			input=input+","+Maj(word[i]);}
		return input;
	}
}
