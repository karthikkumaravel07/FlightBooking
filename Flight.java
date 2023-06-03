package FLBook;

public class Flight {
	private int FlightNo;
	private boolean ac;
	private int capacity;
	
	Flight(int no,boolean ac,int cap){
		this.FlightNo = no;
		this.ac = ac;
		this.capacity = cap;
	}
	
	public int getFlightNo(){
		return FlightNo;  
	}
	
	public boolean isAc(){
		return ac;
	}
	public int getCapacity(){ 
		return capacity;
	}
	
	public void setAc(boolean val) {  
		ac = val;
	}
	
	public void setCapacity(int cap) { 
		capacity = cap;
	}

}
