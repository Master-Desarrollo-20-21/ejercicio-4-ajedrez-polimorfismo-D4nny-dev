import java.util.ArrayList;
import java.util.List;

class Pawn extends Piece {

	private boolean firstMove;
	Coordinate origin;

	public Pawn(Color color){
		super(color,PieceType.PAWN);
		this.firstMove = true;
	}

	@Override
	public List<Move> moves() {
		List<Move> legalmoves = new ArrayList<>();
		if(firstMove){}
		return legalmoves;
	}

	@Override
	public String toString() {
		return PieceType.PAWN.toString() + this.getColor();
	}
}
