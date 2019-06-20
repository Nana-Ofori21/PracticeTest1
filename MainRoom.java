class MainRoom{
	public static void main(String[] args){
		
		Room myRoom = new Room(-11,-22,1);
		//myRoom.setWidth(23);
		//myRoom.setLength(12);
		//myRoom.setFloor(7);
		System.out.println(myRoom.getWidth());
		System.out.println(myRoom.getLength());
		System.out.println(myRoom.getFloor());
		System.out.println(myRoom.toString());
		
	}
}
