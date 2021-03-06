
public class Data {
	class Node{
		Node next; 
		int data; 
	}
	Node first; 
	Node last; 
	int nElems;
	

	public void Data(){
		first = null; 
		nElems = 0; 
	}
	
	public void add(int a){
		Node node = new Node(); 
		Node current = first;
		node.data = a; 
		if(first == null){
			first = node; 
		}
		else{ 
			while(current.next!= null){
				current = current.next; 
			}
			current.next = node;
		}
		 
		nElems++; 
		
	}
	
	public int remove(){
		int data = first.data; 
		first = first.next; 
		nElems--; 
		return data; 
	}
	public int getValue(int i){
		Node current = first; 
		if (i >= nElems){
			return -1;
		}
		else{
			while(i > 0){
				current = current.next; 
				i--; 
			}
		}
		return current.data;
	}
	
	public void printQueue(){
		Node current = first; 
		while(current!= null){
			System.out.print(current.data + " ");
			current = current.next; 
		}
	}
}
