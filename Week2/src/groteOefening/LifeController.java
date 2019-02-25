package groteOefening;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LifeController implements ActionListener
{
	LifeModel lifeModel;

	public LifeController(LifeModel lifeModel)
	{
		this.lifeModel = lifeModel;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		lifeModel.volgendeGeneratie();
	}
}
