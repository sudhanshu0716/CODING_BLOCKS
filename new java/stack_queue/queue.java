package stack_queue;

public class queue {
    private int front;
    private int size;
    private int []arr;
    public queue(){
        arr=new int [5];
    }
    public queue(int n){
        arr=new int [n];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public int size(){
        return size;
    }
    public void EnQueue(int item) throws Exception {
		if (isfull() == true) {
			throw new Exception("Boka Queue full ");
		}
		int idx = (front + size) % arr.length;
		arr[idx] = item;

		size++;

	}

	public int DeQueue() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Boka Queue khaali ");
		}
		int val = arr[front];
		front = (front + 1) % arr.length;

		size--;
		return val;

	}

	public int GetFront() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("Boka Queue khaali ");
		}
		int val = arr[front];

		return val;

	}

	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}


    
}
