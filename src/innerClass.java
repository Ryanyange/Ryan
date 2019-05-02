/*


*/

class Some{

	static int player = 3;

	class Other{
		void play(){
			System.out.println("Hello World...");
		}
	}
	
	private class Other2{
		void play2(){
			System.out.println("Hello Play2....");
			
		}	
	}
	
	static class Other3{
			void printPlayer(){
				System.out.println(player);
				sound();
			}
		
	}
		
	void play3(){
		Other2 e = new Other2();
		e.play2();
	}
	
	static void sound(){
		System.out.println("Open the radio....");
	}
		
}

public class innerClass{

	public static void main(String[] args){
		
		Some a = new Some();
		Some.Other b = a.new Other();
		
		b.play();
		
		Some c = new Some();
		//Some.Other2 d = c.new Other2();
		c.play3();
		
		Some.Other3 f = new Some.Other3();
		f.printPlayer();
	}

}