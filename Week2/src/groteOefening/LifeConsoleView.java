package groteOefening;

import java.util.Observable;
import java.util.Observer;

// De klasse LifeConsoleView implementeert de Observer-interface.
public class LifeConsoleView implements Observer
{
	private LifeModel model;

//	Geef de klasse een constructor die het LifeModel ontvangt en onthoudt in een instance-variabele.
	public LifeConsoleView(LifeModel model)
	{
		this.model = model;
//		Registreer je view bij het model als Observer.
		model.addObserver(this);
	}

//	Geef de klasse een methode toonCel( int rij, int kolom ), die de inhoud van één cel op de
//	console toont.
	public void toonCel(int rij, int kolom)
	{
		System.out.printf(String.format("%3s", model.cellToString(model.isLevend(rij, kolom))));
	}

//	Geef de klasse een methode refresh(), die de inhoud van het model op het scherm toont. Deze
//	methode maakt natuurlijk gebruik van de methode toonCel.
	private void refresh()
	{
		for (int a = 0; a < model.getRow(); a++)
		{
			for (int b = 0; b < model.getColumn(); b++)
			{
				toonCel(a, b);
			}
			System.out.printf(String.format("%n"));
		}
		System.out.println();
	}

//	De methode refresh kan nu private worden i.p.v. public, omdat deze niet meer extern gebruikt hoeft te worden.
	@Override
	public void update(Observable model, Object info)
	{
		refresh();
	}
}
