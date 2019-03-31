//© A+ Computer Science  -  www.apluscompsci.com

//Player class

public class Player
{
	private String name;
	private String choice;

	public Player(String nm)
	{
		setName (nm);
		choice= "rock";

	}

	public Player(String nm, String ch)
	{
		name = nm;
		choice = ch;

	}

	public void setName( String nm)
	{
		name = nm;

	}

	public void setChoice( String ch )
	{
		choice = ch;
	}

	public String getChoice()
	{
		String result;
			result = choice ;
		return result;
	}

	public String getName()
	{
		String result;
		result = name ;
		return result;
	}

	public String toString()
	{
		return name + " " + choice;
	}
}

//Runner

