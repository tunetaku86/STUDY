package la.java;

public class Book2 {
	private String title;
	private String author;
	private int price;


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Book2(String title, String author, int price) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void showBook2() {
		System.out.println("タイトル:" + title + "著者:" + author + "価格:" + price + "円");
	}

}
