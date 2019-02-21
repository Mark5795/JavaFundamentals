package oefeningLes;

import java.util.Scanner;

import javax.swing.Timer;


public class DobbelsteenApplicatie
{
	
	public DobbelsteenApplicatie()
	{
//		stap 1
//		DobbelsteenModel steen = new DobbelsteenModel();		
//		System.out.println(steen.getWaarde());
		
//		stap 2
//		int i = 0;
//		while (i != 10) {
//			steen.werp();
//			System.out.println(steen.getWaarde());
//			i++;
//		}
		
//		stap 3
//		DobbelsteenModel steen = new DobbelsteenModel();
//		DobbelsteenConsoleView view = new DobbelsteenConsoleView(steen);
		
//		int i = 0;
//		while (i != 10) {
//			steen.werp();
//			view.refresh();
//			i++;
//		}
				
//		WorpModel worp = new WorpModel(5);		
//		WorpView view = new WorpView(worp);
		
//		worp.werp();
//		view.refresh();
		
//		stap 4
//		WorpModel worp = new WorpModel(5);
//		WorpView view = new WorpView(worp);
//		
//		worp.werp();
//		view.update(null, worp);
		
//		stap 5
		WorpModel worp = new WorpModel(5);
		WorpView view = new WorpView(worp);
		
		Timer pulse = new Timer(1000, new PulseController(worp));
		pulse.start();
		view.update(null, worp);
		
		waitForEnter();
	}
	
	public static void main( String[] args )
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
