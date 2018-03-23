package refactoring.chap07_enum;

public class Item1 {	
	private ItemType1 ItemType;
	private final String _title;
	private final int _price;
	
	public Item1(ItemType1 _itypecode, String _title, int _price) {
		this.ItemType = _itypecode;
		this._title = _title;
		this._price = _price;
	}
	public int get_typecode() {
		return ItemType.get_typecode();
	}
	public String get_title() {
		return _title;
	}
	public int get_price() {
		return _price;
	}
	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", ItemType.get_typecode(), _title, _price);
	}
	
	
}
