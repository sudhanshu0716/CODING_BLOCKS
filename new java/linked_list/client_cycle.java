package linked_list;

public class client_cycle {
    public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		cycle_in_list ll = new cycle_in_list();
		ll.AddLast(1);
		ll.AddLast(2);
		ll.AddLast(3);
		ll.AddLast(4);
		ll.AddLast(5);
		ll.AddLast(6);
		ll.AddLast(7);
		ll.AddLast(8);
		ll.CreateCyle();
		//ll.CycleRemoval1();
		// ll.floyedCycleRemoval();
		// ll.Display();

	}
}
