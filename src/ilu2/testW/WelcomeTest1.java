package ilu2.testW;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ilu2.Welcome;

class WelcomeTest1 {

	@Test
	void welcometest1() {
		String nom="bob";
		assertEquals(Welcome.welcome(nom),"Hello,Bob");}
	}

