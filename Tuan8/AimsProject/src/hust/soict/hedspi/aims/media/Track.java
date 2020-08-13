package hust.soict.hedspi.aims.media;

public class Track implements Playable{
private String title;
private int length;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public Track(String title, int length) {
	this.title = title;
	this.length = length;
}
@Override
public void play() {
	// TODO Auto-generated method stub
	System.out.println("Playing Track: " + this.getTitle());
	System.out.println("Track length: " + this.getLength());
}
public boolean equals(Object object) {
	Track track = (Track) object;
	if(title.equalsIgnoreCase(track.title) && length == track.length)
		return true;
	return false;
}

public int compareTo(Track track) {
	if(this.title.compareToIgnoreCase(track.title) < 0)
		return -1;
	else if(this.title.compareToIgnoreCase(track.title) == 0)
		return 0;
	else return 1;
}
}
