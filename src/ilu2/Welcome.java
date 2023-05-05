package ilu2;

import java.util.*;

public class Welcome {
	
	public static String welcome(String input) {
		if(input==null){return "Hello,my friend";}
		input=input.trim(); 
		if(input==""){return "Hello,my friend";}
		if (MajEquals(input)){return("Hello,"+input+"!");}
		String[] word=input.split(",");
		if (word.length==2) {return ("Hello,"+Maj(word[0])+" and "+Maj(word[1]));}
		if (word.length>2) {return(StrNom(word));}
		return("Hello,"+Maj(input));
	}
	public static String Maj(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	public static String StrNom(String[] word) {
		String input="";
		String Majinput="";
		List<String> wordMinuscule=TrieMin(word),wordMajuscule=TrieMaj(word);
		if (wordMajuscule.size()>0) {Majinput=".AND HELLO";}
		for ( int i=0;i<wordMajuscule.size();i++) {
			if ((i==wordMajuscule.size()-1)&&(wordMajuscule.size()>1)) {Majinput=Majinput+" AND "+wordMajuscule.get(i)+"!";}
			else{Majinput=Majinput+","+wordMajuscule.get(i);}}
		for (int i=0;i<wordMinuscule.size();i++) {
			if ((i==wordMinuscule.size()-1)&&(wordMinuscule.size()-1>0)) {input=input+" and "+Maj(wordMinuscule.get(i));}
			else {input=input+","+Maj(wordMinuscule.get(i));}}
		if (input==""){return "HELLO,"+Majinput;}
		if(wordMajuscule.size()==1) {Majinput=Majinput+"!";}
		return "Hello"+input+Majinput;
	}
	public static List<String> TrieMaj(String[] word) {
		List<String> wordMajuscule= new LinkedList<String>();
		for (int i=0;i<word.length;i++) {
			if (MajEquals(word[i])) {wordMajuscule.add(word[i]);}
		}
		return  (wordMajuscule) ; 
	}
	public static Boolean MajEquals(String input) {
		return ((input.toUpperCase().equals(input)));} 
	
	public static List<String> TrieMin(String[] word) {
		List<String> wordMinuscule = new LinkedList<String> ();
		for (int i=0;i<word.length;i++) {
			if (!MajEquals(word[i])) {wordMinuscule.add(word[i]);}}
		return( wordMinuscule);
		}

}