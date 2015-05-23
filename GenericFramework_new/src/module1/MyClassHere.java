package module1;

/*	
 * Created by: 	Jonathan Young
 * Date: 		May 14, 2015
 */

public class MyClassHere {
	private int Power;
	private int Time;
	
	
	MyClassHere(int someParameter){
		this.setPower(Power);
		this.setTime(Time);
	}

	
	
	public int getPower() {
		return Power;
	}



	public void setPower(int power) {
		System.out.println("*************SETTING POWER****************");
		this.Power = power;
		System.out.println(">>>>>>>>>"+this.Power);
	}



	public int getTime() {
		return Time;
	}



	public void setTime(int time) {
		this.Time = time;
	}



	public void printObject() {
		System.out.println("===========================================");
		System.out.println("power = "  +this.Power);
		System.out.println("time = " +this.Time);
		
		System.out.println("===========================================");
	}


}