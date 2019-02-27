package lesOefening;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class DobbelsteenApplicatie extends JFrame
{

	public DobbelsteenApplicatie()
	{
		setBounds(100, 100, 350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Dobbelsteen applicatie");
//		JButton knop = new JButton("klik");
//		knop.addActionListener();
//		add(knop);


		WorpModel worpModel = new WorpModel(5);
		WorpView view = new WorpView(worpModel);
		
		int waarde = worpModel.waarde;
		JButton button1 = new JButton();
		button1.setBounds(50,50, 100,30);  
		setVisible(true);
		
		Timer pulse = new Timer(1000, new PulseController(worpModel));
		pulse.start();

		waitForEnter();
	}

	public static void main(String[] args)
	{
		new DobbelsteenApplicatie();

	}

	@SuppressWarnings("resource")
	private void waitForEnter()
	{
		new Scanner(System.in).nextLine();
		System.exit(0);
	}
}
