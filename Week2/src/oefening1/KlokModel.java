package oefening1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class KlokModel extends Observable
{

//	list of views who subscribed
	private List<Observer> views = new ArrayList<>();

	private int aantalUren;
	private int aantalMinuten;
	
	public void setUren(int uren)
	{
		this.aantalUren = uren;
	}

	public void volgendeMinuut()
	{
		aantalMinuten++;
		if (aantalMinuten == 60)
		{
			aantalUren++;
			aantalMinuten = 0;
		}
		notifyObservers();
	}

	public int getMinuten()
	{
		return aantalMinuten;
	}

	public int getUren()
	{
		return aantalUren;
	}

	@Override
	public void addObserver(Observer view)
	{
		views.add(view);
	}

//	@Override
//	public void removeObserver(Observer view)
//	{
//		views.remove(view);
//	}

	@Override
	public void notifyObservers()
	{
		for (Observer view : views)
		{
			view.update(null, view);
		}
	}
}
