import java.util.HashMap;
import java.util.Map;

class Square extends Coordinate {
	
	public static final String ranks = "abcdefgh";
	public static final String files = "12345678";

	private Map<Coordinate,Piece> board = new HashMap<Coordinate,Piece>();
	
	public Square(String name){
		super();
		this.setX(ranks.indexOf(Character.toString(name.charAt(0))));
		this.setY(Integer.parseInt(name.substring(1,2)));
	}


	public Piece getPieceFrom(Square square){
		return this.board.get(square);
	}

	public String getNotation(){
		return ""+ranks.charAt(this.getY()) + files.charAt(this.getX());
	}

	public boolean validNotation(String name){
		if (name.length() != 2) {
			return false;
		}else if(this.contains(name.charAt(0)) && this.contains(name.charAt(1))){
			return true;
		}
		return false;
	}
	
	private boolean contains(char c){
		String str = Character.toString(c);
		if(ranks.contains(str) || files.contains(str)){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "(" + Integer.toString(getX()) + "," + Integer.toString(getY()) + ")";
	}

	public void setPiece(Piece piece, String notation){
		if(validNotation(notation)){
			this.set(piece);	
		}
	} 	

	private void set(Piece piece){
		this.board.put(this, piece);
	}
	
	public static void main(String[] args) {
		
		MakerPiece fpiece = new MakerPiece();
		Piece pawn  = fpiece.create("p", Color.BLACK);
		
		Square a1 = new Square("a1");
		a1.set(pawn);

		System.out.println(a1.getPieceFrom(a1));
	}
}
