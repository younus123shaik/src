package Day12;



 class maink extends Thread {
	public void run() {
		System.out.println("This is internally called by start run()");
	}
	
}
 public class thred{
	 public static void main(String[] args) {
		
			for (int i = 0; i < 5; i++) {
				System.out.println("Am main thead.");
			}
			maink m= new maink();
			m.run();
		}
	 }
