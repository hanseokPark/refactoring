package refactoring.chap07;

public class Item {	
	private ItemType ItemType;
	private final String _title;
	private final int _price;
	
	public Item(ItemType _itypecode, String _title, int _price) {
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
