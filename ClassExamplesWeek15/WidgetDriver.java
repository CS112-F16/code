
public class WidgetDriver {

	public static void main(String[] args) {
		WidgetList list = new WidgetList();
		list.addWidget(new Widget("A", 3));
		list.addWidget(new Widget("C", 4));
		list.addWidget(new Widget("B", 1));
		list.addWidget(new Widget("Z", 9));
		
		list.displayByName();
		System.out.println("--------");
		list.displayByValue();
	}

}
