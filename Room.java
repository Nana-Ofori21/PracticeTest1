public class implements Comparable <Room>{
	private double width;
	private double length;
	private int floor;
	
	public Room(double newLength , double newWidth ,int newFloor){
		length = 12.5;
		width = 10;
		floor = 1;
		
	} 	
	public double getLength(){
		return length;
	}
	
	public void setLength(double newLength){  // Hold a larger value
		if(newLength <= 0){
			
		}
		else{
			this.length = newLength;
		}
	}
	
	public double getWidth(){    //This is supposed to hold a smaller value  
		return width;
	}
	
	public void setWidth(double newWidth){	
		if(newWidth <= 0){
			
			}
		else {
			this.width= newWidth;
			}
	}
	public int getFloor(){
		return floor;
	}
	public void setFloor(int newFloor){
		this.floor = newFloor;
	}
	@Override                //FInd out??
	public String toString(){
		return String.format("12.5 * 10 , Floor 1");	
	}
}