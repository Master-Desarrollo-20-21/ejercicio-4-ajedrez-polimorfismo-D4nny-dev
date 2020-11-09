class MakerPiece{

	public Piece create(String label, Color color){
		if(PieceType.formLabel(label) == PieceType.PAWN){
			return new Pawn(color);
		}
		return null;
	}
}
