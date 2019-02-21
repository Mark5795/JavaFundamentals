package oefening1;

import java.util.Observable;
import java.util.Observer;

public class KlokConsoleView implements Observer
{

	private KlokModel klok = null;

	public KlokConsoleView(KlokModel klok)
	{
		this.klok = klok;
	}

	private void toon()
	{
		System.out.println(klok.getUren() + ":" + klok.getMinuten());
	}

	@Override
	public void update(Observable observable, Object arg)
	{
		toon();
	}
}
