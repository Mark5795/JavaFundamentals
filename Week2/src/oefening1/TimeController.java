package oefening1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimeController implements ActionListener
{
	private KlokModel klokModel;

	public TimeController(KlokModel klokModel)
	{
		this.klokModel = klokModel;
	}

	@Override
	public void actionPerformed(ActionEvent event)
	{
		klokModel.volgendeMinuut();
	}

}
