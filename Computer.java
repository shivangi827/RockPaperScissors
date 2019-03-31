//computer

//© A+ Computer Science  -  www.apluscompsci.com

//Computer class

public class Computer
{
	//instance / member variables
   private String choice;

	public Computer()
	{
		randomSetChoice();
	}

	public String getChoice()
	{

		return choice;
	}

	public void randomSetChoice()
	{
		int temp;
		temp = (int)(Math.random () * (3-1+1)+ 1); //use Math.random()
		//set a int variable like temp to a random number 1 - 3

		switch (temp)
		{															//use switch case on temp
		case 1: choice = "rock"; break; 										//1 - set choice to "rock"
		case 2: choice = "paper"; break;											//2 - paper
		case 3: choice = "scissors"; break;											//3 - set it to scissors
		}
	}

	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice

	 	use p.getChoice() to get the players choice

	 	you need to use if/else if /else for the choices.
	 */
	public int didIWin(Player p)
	{
		if (choice.equals(p.getChoice()))
			return 0;
		else if (choice.equals("rock") && p.getChoice().equals("scissors"))
			return 1;
		else if (choice.equals("paper") && p.getChoice().equals("rock"))
			return 1;
		else if (choice.equals("scissors") && p.getChoice().equals("paper"))
			return 1;
		else if (choice.equals("rock") && p.getChoice().equals("paper"))
			return -1;
		else if (choice.equals("paper") && p.getChoice().equals("scissors"))
			return -1;
			else
		return -1;
	}

	public String toString()
	{

		return  "Computer chose " + choice;	//print the computer's choice same as player
	}
}
