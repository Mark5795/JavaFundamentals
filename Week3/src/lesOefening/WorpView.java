package lesOefening;

import java.util.Observer;
import java.util.Observable;

public class WorpView implements Observer
{
	private WorpModel worp;
	private DobbelsteenConsoleView[] steenViews;
	
	public WorpView(WorpModel worp)
	{
		this.worp = worp;
		worp.addObserver(this);
		
		int aantal = worp.getAantalStenen();
		steenViews = new DobbelsteenConsoleView[aantal];
		
		for (int i = 0; i < aantal; i++) 
		{
			steenViews[i] =	new DobbelsteenConsoleView(worp.getDobbelsteen(i));
		}
	}
	
//	stap 3
//	public void refresh()
	private void refresh()
	{
		// ik heb DobbelsteenView verandert in DobbelsteenConsoleView 
		for (DobbelsteenConsoleView view : steenViews) 
		{
			view.refresh();
		}
		
		System.out.println("totaal: " + worp.getWaarde() );
	}

	@Override
	public void update(Observable worp, Object info) {
		refresh();		
	}
}
