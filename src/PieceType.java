enum PieceType{
	PAWN("p"),
	ROOK("r"),
	QUEEN("q"),
	BISHOP("b"),
	KNIGHT("n"),
	KING("k");

	private String label;

	PieceType(String label){
		this.label = label;
	}

	public static PieceType formLabel (String label){
		for (PieceType piece : PieceType.values()) {
			if (piece.label.equalsIgnoreCase(label)){
				return piece;
			}
		}
		throw new IllegalArgumentException("Not label found it");
	}

	@Override
	public String toString() {
		return this.label;
	}
}
