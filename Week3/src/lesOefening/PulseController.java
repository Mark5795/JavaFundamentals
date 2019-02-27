package lesOefening;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PulseController implements ActionListener
{
	private WorpModel worp;
	
	public PulseController(WorpModel worp)
	{
		this.worp = worp;
	}
	
	@Override
	public void actionPerformed(ActionEvent event)
	{
		worp.werp();
	}
}
