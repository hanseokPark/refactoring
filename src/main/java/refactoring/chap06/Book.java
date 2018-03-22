package refactoring.chap06;

public class Book {
	private String _title;
	private String _isbn;
	private String _price;
	private Author Author ;

	public Book(String _title, String _isbn, String _price, String _authorName, String _authorMail) {
		this._title = _title;
		this._isbn = _isbn;
		this._price = _price;
		this.Author = new Author(_authorName,_authorMail);
	}

	public String get_title() {
		return _title;
	}

	public void set_title(String _title) {
		this._title = _title;
	}

	public String get_isbn() {
		return _isbn;
	}

	public void set_isbn(String _isbn) {
		this._isbn = _isbn;
	}

	public String get_price() {
		return _price;
	}

	public void set_price(String _price) {
		this._price = _price;
	}

	public String get_authorName() {
		return Author.getName();
	}

	public void set_authorName(String _authorName) {
		this.Author.setName(_authorName);
	}

	public String get_authorMail() {
		return Author.getMail();
	}

	public void set_authorMail(String _authorMail) {
		this.Author.setMail(_authorMail);
	}
	
	public String toXml() {
		String author = tag("author", tag("name", Author.getName()) + tag("mail", Author.getMail()));
		String book = tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
		return book;
	}

	private String tag(String element, String content) {
		/*return "<" + element + ">" + content + "</" + element + ">";*/
		return String.format("<%1$s>%2$s</%1$s>%n", element, content);
	}
	
}
