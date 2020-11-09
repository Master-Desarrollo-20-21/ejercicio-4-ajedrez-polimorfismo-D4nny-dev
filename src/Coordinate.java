class Coordinate {

	private int x; 
	private int y;
	
	public Coordinate(){};

	public Coordinate(Coordinate coordinate){
		this.x = coordinate.getX();
		this.y = coordinate.getY();
	}
	public Coordinate (int x , int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return this.x;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getY(){
		return this.y;
	}
}

