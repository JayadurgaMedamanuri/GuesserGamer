package com.gusserGame;


import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Dear Guesser kindly guess the number between 1 to 10");
		//System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		if(guessNum<=10 && guessNum>0) {
			return guessNum;
		}
		else {
			System.out.println("Guessor please enter number between 1 to 10");
			return 0;
		}
		
	}	
}

class Player
{
	int guessNum;
	
	int guessNum1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Dear Player kindly guess the number between 1 to 10");
		//System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		if(guessNum<=10 && guessNum>0) {
			return guessNum;
		}
		else {
			System.out.println("Player please enter number between 1 to 10");
			return 0;
		}
	}
	int guessNum2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Dear Player kindly guess the number between 1 to 10");
		//System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		if(guessNum<=10 && guessNum>0) {
			return guessNum;
		}
		else {
			System.out.println("Player please enter number between 1 to 10");
			return 0;
		}
	}
	int guessNum3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Dear Player kindly guess the number between 1 to 10");
		//System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		if(guessNum<=10 && guessNum>0) {
			return guessNum;
		}
		else {
			System.out.println("Player please enter number between 1 to 10");
			return 0;
		}
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
		if(numFromGuesser==0) {
			g.guessNum();
		}
		
	}
	void collectNumFromPlayers()
	{
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum1();
		if(numFromPlayer1==0) {
			numFromPlayer1=p1.guessNum1();
		}
		numFromPlayer2=p2.guessNum2();
		if(numFromPlayer2==0) {
			numFromPlayer2=p2.guessNum2();
		}
		numFromPlayer3=p3.guessNum3();
		  if(numFromPlayer3==0) {
			numFromPlayer3=p3.guessNum3();
		}
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}

public class GuesserGame {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}


