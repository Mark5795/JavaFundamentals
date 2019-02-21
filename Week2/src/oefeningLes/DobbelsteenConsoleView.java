package oefeningLes;

public class DobbelsteenConsoleView 
{
	
	private DobbelsteenModel dobbelsteen;
	
	public DobbelsteenConsoleView(DobbelsteenModel dobbelsteen)
	{
		this.dobbelsteen = dobbelsteen;
	}
	
	public void refresh()
	{
		System.out.print( "[" );
		System.out.print( dobbelsteen.getWaarde() );
		System.out.print( " ]" );
	}
}
