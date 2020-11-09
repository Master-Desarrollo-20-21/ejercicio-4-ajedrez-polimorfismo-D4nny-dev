enum Color {
	BLACK("B"),
	WHITE("W");

	private String value;

	Color (String value){
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}

}
