package ilu2.testW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ilu2.Welcome;

class WelcomeTest1 {

	@Test
	void welcometest1() {
		String nom="bob";
		assertEquals(Welcome.welcome(nom),"Hello,Bob");}
	
	@Test
	void welcometest2() {
		String nom="";
		assertEquals(Welcome.welcome(nom),"Hello,my friend");
		nom=null;
		assertEquals(Welcome.welcome(nom),"Hello,my friend");
		nom="    ";
		assertEquals(Welcome.welcome(nom),"Hello,my friend");
		}
	
	@Test
	void welcometest3() {
		String nom="JERRY";
		assertEquals(Welcome.welcome(nom),"Hello,JERRY!");
	}

	@Test
	void welcometest4() {
		String nom="amy,bob";
		assertEquals(Welcome.welcome(nom),"Hello,Amy,Bob");
	}
	}

