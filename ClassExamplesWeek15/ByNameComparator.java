import java.util.Comparator;

public class ByNameComparator implements Comparator<Widget> {

	@Override
	public int compare(Widget o1, Widget o2) {
		return o1.getName().compareTo(o2.getName());
	}

	
}
