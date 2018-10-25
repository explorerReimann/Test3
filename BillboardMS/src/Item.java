
public class Item {
	private int num;
	private String song;
	private String singer;
	private int year;
	
	public Item(int num, String song, String singer, int year) {
		super();
		this.num = num;
		this.song = song;
		this.singer = singer;
		this.year = year;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
