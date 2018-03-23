package refactoring.chap07_enum;

public enum ItemType1 {
	BOOK(0), DVD(1), SOFTWARE(2);
	
	private int _typecode;

	private ItemType1(int typecode) {
		this._typecode = typecode;
	}

	public int get_typecode() {
		return _typecode;
	}
}