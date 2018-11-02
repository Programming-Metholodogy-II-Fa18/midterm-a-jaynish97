
public class main_data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data(); 
		data.add(1); 
		data.add(9); 
		data.add(4); 
		data.add(5); 
		data.add(10); 
		data.add(0);
		System.out.print("Get Value[0]: " + data.getValue(0) + "\n");
		System.out.print("Get Value[3]: " + data.getValue(3) + "\n");
		data.printQueue();
	}

}
