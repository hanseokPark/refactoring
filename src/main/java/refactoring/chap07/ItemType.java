package refactoring.chap07;

public class ItemType {
	public static final ItemType BOOK = new ItemType(0);
	public static final ItemType DVD = new ItemType(1);
	public static final ItemType SOFTWARE = new ItemType(2);
	
	private int _typecode;

	private ItemType(int typecode) {
		this._typecode = typecode;
	}

	public int get_typecode() {
		return _typecode;
	}

	public void set_typecode(int _typecode) {
		this._typecode = _typecode;
	}
}