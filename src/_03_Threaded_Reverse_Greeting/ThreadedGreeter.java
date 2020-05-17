package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable{

	
	//2. Give the ThreadedGreeter class a  member variable of the integer type and a constructor
	//   to initialize the member variable to a custom value.
		private int num;
		public ThreadedGreeter(int n) {
			num=n;
		}
	//3. In the run method of the ThreadedGreeter class, print the message using the member variable as the thread number.
	//   If the member integer is less than or equal to 50, create a new thread. 
	//   Pass in a new object of the ThreadedGreeter class with the value of the member variable plus one.
	
	//4. Start the thread and join it with the calling thread.
		@Override
		public void run() {
			System.out.println("Thread number "+num);
			if(num<=50) {
				Thread t = new Thread(new ThreadedGreeter(num+1));
				t.start();
				try {
					t.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
