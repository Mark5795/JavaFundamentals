package oefeningLes;

import java.util.Observer;

public class WorpView implements Observer
{
	private Worp worp;
	private DobbelsteenConsoleView[] steenViews;
	
	public WorpView(Worp worp)
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
	
	public void refresh()
	{
		// ik heb DobbelsteenView verandert in DobbelsteenConsoleView 
		for (DobbelsteenConsoleView view : steenViews) 
		{
			view.refresh();
		}
		
		System.out.println("totaal: " + worp.getWaarde() );
	}
	
	@Override
	public void update( Observable worp, Object info )
	{
		refresh();
	}
}
