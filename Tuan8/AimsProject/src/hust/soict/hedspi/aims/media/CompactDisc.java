package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Track;
public class CompactDisc extends Disc implements Playable {
private String artist;
private int length;
private ArrayList<Track> tracks = new ArrayList<Track>();
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public CompactDisc(String id, String title, String category, String artist, float cost) {
	super(id, title, cost);
	this.artist = artist;
	this.category = category;
}

public void addTrack(Track track) {
	if(tracks.contains(track)) {
		System.err.println("Track has been existed");
	}else {
		tracks.add(track);
	}
}

public void removeTrack(Track track) {
	if(tracks.contains(track)) {
		tracks.remove(track);
	}else {
		System.err.println("Track don't existeds");
	}
}
public int getLength() {
	int lengths = 0 ;
	for(int i = 0; i< tracks.size(); i++) {
		lengths += tracks.get(i).getLength();
	}
	super.length = lengths;
	return lengths;
}
@Override
public void play() {
	// TODO Auto-generated method stub
	System.out.println("Playing CD: " + this.getTitle());
	System.out.println("CD length: " + this.getLength());
	for(Track track: tracks) {
		track.play();
	}
}
public int compareTo(Media media) {
	if(media instanceof CompactDisc) {
		CompactDisc cd = (CompactDisc)media;
		if(tracks.size() == cd.tracks.size()) {
			if(this.length < cd.getLength())
				return -1;
			else if(this.length == cd.getLength())
				return 0;
			else return 1;
		}
		else if(tracks.size() < cd.tracks.size())
			return -1;
		else return 1;
	}else {
		return super.compareTo(media);
	}
}
}
