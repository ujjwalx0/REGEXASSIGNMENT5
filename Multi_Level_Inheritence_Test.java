

/*Assignment 2: On Multi-level Inheritance:
Implement the Multi-level Inheritance using the following objects.
TV
1. sound()
2. picture()
ThreeDTV
1. threeD()
2. dolbyAudio()
SmartTV
1. internet()
2. fullHD()
*/
package Assignments_Regex;
class Tv{
	
	void sound() {System.out.println("Sound is Audible...");}
		
	
	void picture () {System.out.println("Picture is Visible..");}
	
}	
	class ThreeDtv extends Tv{
		void threeD() { System.out.println("3D audio is audible..");}
		void dolbyAudio() { System.out.println("Dolby Audio is Audible..");}
 }	
	class SmartTV extends ThreeDtv{
		
		
		void internet() { System.out.println("Connected to Internet..");}
		
		void FullHD() { System.out.println("Full HD video is Visible..");}
	}	
		

public class Multi_Level_Inheritence_Test {

	public static void main(String[] args) {
		SmartTV st= new  SmartTV();
		st.sound();
		st.picture();
		st.threeD();
		st.dolbyAudio();
		st.internet();
		st.FullHD();	
	
		



		
		

	}

}
