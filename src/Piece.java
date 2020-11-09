import java.util.ArrayList;
import java.util.List;

abstract class Piece {
	
	private Color color;
	private PieceType type;

	public abstract List<Move> moves();

	public Piece(Color color, PieceType type){
		this.color = color;
		this.type = type;
	}

	public Color getColor(){
		return this.color;
		
	}
	public PieceType getType(){
		return this.type;
	}

}
