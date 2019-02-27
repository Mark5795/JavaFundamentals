package lesOefening;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Observable;

//set of dice == model
public class WorpModel extends Observable
{
	private DobbelsteenModel[] stenen;
//	private List<WorpView> worpViews = new ArrayList<WorpView>();
	int waarde;
	
	DobbelsteenModel dobbelsteen = new DobbelsteenModel();
	
	public WorpModel(int aantal)
	{
		stenen = new DobbelsteenModel[aantal];
		
		for( int i = 0; i < aantal; i++ )
		{
			stenen[i] = new DobbelsteenModel();
		}
		
//		werp();
	}
	
	public void werp() 
	{
		waarde = 0;
		for(DobbelsteenModel steen : stenen)
		{
			steen.werp();
			waarde = waarde + steen.getWaarde();

		}
		setChanged();
		notifyObservers();
	}


	public int getWaarde() 
	{
		return waarde;
	}
	
	public int getAantalStenen() 
	{ 
		int aantal = 0;
		for (int i = 0; i < stenen.length; i++)
		{
			aantal++;
		}
		return aantal;
	}
	
	public DobbelsteenModel getDobbelsteen(int nummer) 
	{  
		return stenen[nummer];
	}

//	public void addObserver(WorpView worpView) {
//		worpViews.add(worpView);		
//	}
}
