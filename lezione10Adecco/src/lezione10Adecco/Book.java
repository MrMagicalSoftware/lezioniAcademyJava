package lezione10Adecco;

public class Book {

	private String titolo , autore;
	private int numeroPagine;
	
	
	public Book() {
		setAutore("author");
		setTitolo("title");
		setNumeroPagine(100);
	}
	
	public Book(String titolo , String autore , int numeroPagine) {
		setTitolo(titolo);
		setAutore(autore);
		setNumeroPagine(numeroPagine);
	}
	
	public Book(int numeroPagine) {
		setNumeroPagine(numeroPagine);
		setAutore("AUTHOR ");
		setTitolo("TITLE BOOK");
	}
	
	
	
	
	public String getTitolo() {
		return titolo;
	}
	
	public String getAutore() {
		return autore;
	}
	
	public int getNumeroPagine() {
		return numeroPagine;
	}
	
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	
	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine > 0 ? numeroPagine : - numeroPagine;
	}
	

	// metodo toString
	
	public String toString() {
		return "titolo " + this.titolo + "autore " + this.autore + " numero " + this.numeroPagine;
				
	}
	
	
	
	
	
	
	
	
}
