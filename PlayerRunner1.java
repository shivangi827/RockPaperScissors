/**
 * @(#)PlayerRunner1.java
 *
 *
 * @Shivangi Vyas
 * @version 1.00 2017/3/27
 */

import java.awt.*;

public class PlayerRunner1
{
	public static void main(String[] args)
	{
		Player s = new Player("Michael Jackson", "rock");

		System.out.println(s.getChoice());			//outs rock
		System.out.println(s.getName());			//call the getName() method 					//outs Michael Jackson
		System.out.println(s);						//outs Michael Jackson rock

		s.setChoice("paper");
		System.out.println(s );
			System.out.println("\n");						//outs Michael Jackson paper

		//instantiate a new Player named jb named Jim Bob that chose scissors
		//print out Jim Bob

			Player jb = new Player("Jim Bob", "scissors");
			System.out.println(jb.getChoice());			//outs rock
			System.out.println(jb.getName());			//call the getName() method 					//outs Michael Jackson
			System.out.println(jb);						//outs Michael Jackson rock


	}

}

