//Runner
//© A+ Computer Science  -  www.apluscompsci.com

//Computer Runner

public class ComputerRunner
{
	public static void main(String[] args)
	{
		Computer c = new Computer();
		System.out.println("Computer chose " + c.getChoice());
		c.randomSetChoice();	//call and print out getChoice()				//outs random choice
		System.out.println(c);								//outs pooter random choice

		c.randomSetChoice();								//call randomChoice
		System.out.println(c);								//outs pooter random choice

		//this code will test didIWin( Player p )
		System.out.println(c.didIWin(new Player("dude" , "rock")));
		System.out.println(c.didIWin(new Player("dude","paper")));
		System.out.println(c.didIWin(new Player("dude","scissors")));
	}
}


