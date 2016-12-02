import java.util.ArrayList;
import java.util.Collections;

public class WidgetList {

	private ArrayList<Widget> list;
	
	public WidgetList() {
		this.list = new ArrayList<Widget>();
	}
	
	public void addWidget(Widget w) {
		this.list.add(w);
	}
	
	public void displayByName() {
		//sort by name
		Collections.sort(list, new ByNameComparator());
		
		for(Widget w: list) {
			System.out.println(w);
		}
	}
	
	public void displayByValue() {
		//sort by vale
		Collections.sort(list, new ByValueComparator());
		
		for(Widget w: list) {
			System.out.println(w);
		}

	}

}
