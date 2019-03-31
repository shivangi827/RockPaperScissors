//Main of all

//© A+ Computer Science  -  www.apluscompsci.com

//Rock / Paper / Scissors

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class RockPaperScissorsRunner extends JFrame implements ActionListener
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 200;

	//this variable is the area to which all text is written
	private JTextArea text;

	//these are the buttons that can be clicked
	private JButton rock;
	private JButton paper;
	private JButton scissors;

	//use these variables to keep track of the players
	private Player player;
	private Computer pooter;

	//use these variables to keep track of the score
   private int playerWinCount;
   private int pooterWinCount;
   private String  win;
   private String  lose;



	public RockPaperScissorsRunner()
	{
		super("RockPaperScissors Runner");

		setSize(WIDTH,HEIGHT);

		//initialize all variables - player / pooter and the counts
		player = new Player("dude");
		pooter = new Computer();

		//this is the panel to which all objects will be added
		JPanel main = new JPanel();
																			//use X.AXIS or Y.AXIS
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

		//these panels will be used to divide the screen
		JPanel top = new JPanel();
		JPanel bot = new JPanel();

		top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));

		//instantiate a new JTextArea
		text = new JTextArea();
		text.setText("WELCOME TO ROCK-PAPER-SCISSORS!!!\n\nPress one of the options to start the game!!!\n\n");
	


		//instantiate a new JButton and refer rock to it
		rock = new JButton("Rock");
		rock.addActionListener(this);
		rock.setActionCommand("rock");

		//instantiate a new JButton and refer paper to it
		paper = new JButton("Paper");
		paper.addActionListener(this);
		paper.setActionCommand("paper");

		//instantiate a new JButton and refer scissors to it
		scissors = new JButton("Scissors");
		scissors.addActionListener(this);
		scissors.setActionCommand("scissors");

		//add all three buttons to the bottom panel
		bot.add(rock);
		bot.add(paper);
		bot.add(scissors);


		//add the text to the top panel
		top.add(text);

		//add both panels to the main panel
		main.add(top);
		main.add(bot);


		//add the main panel to the frame
		getContentPane().add(main);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

    public void actionPerformed(ActionEvent e)
    {
    	//instantiate a new Computer and refer pooter to it
    	pooter = new Computer();

    	//get the String value from the button pressed
		player.setChoice(e.getActionCommand());

		//set screenText to the toString() value of each player reference
		String screenText = "\n" + pooter.toString() + "\n" + player.toString();

		//call the Computer's didIWin(Player p) method to find the winner
									//you must pass in the Player as a parameter to the method
		int result = pooter.didIWin(player);

		//if the result is 0 - draw
		if(result == 0)
		{

			screenText = screenText + "\n" + "DRAW!";

			}
		//if the result is 1 - pooter wins  & update pooter wins
		if (result == 1)
		{

			screenText = screenText + "\n" + "POOTER WINS!";
			pooterWinCount++;

		}

		//if the results is -1 - player wins & update playerwins
		if (result == -1)
		{

			screenText = screenText + "\n" + "PLAYER WINS!";
			playerWinCount++;

		}

		//add in player and pooter wins to screentext


		//add to screenText wins for computer and player
		screenText = screenText + "\n" + "Pick Again Sucka!" + "\nComputer wins:" + pooterWinCount + "\nPlayer Wins:" + playerWinCount ;




		//set the text to the screen using setText( String txt )
		text.setText(screenText);


    }


	public static void main( String args[] )
	{
		RockPaperScissorsRunner run = new RockPaperScissorsRunner();

	}
}
