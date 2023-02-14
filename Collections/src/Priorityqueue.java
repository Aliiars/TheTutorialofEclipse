import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		
		q.add(10);
		q.add(22);
		q.add(84);
		q.add(55);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		
		

	}

}
