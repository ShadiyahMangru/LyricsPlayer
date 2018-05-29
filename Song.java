/*Song class provides a template for each song object.*/

package LyricsPlayer;
import java.time.*;
public class Song{
	String Title ="";
	String Artist ="";
	String Lyrics = "";
	LocalTime SongLength;

	public Song(String title, String artist, int hr, int min, int sec){
		setTitle(title);
		setArtist(artist);
		setLength(hr, min, sec);	
	}
	
	public Song(String title, String artist, int hr, int min, int sec, String lyrics){
		setTitle(title);
		setArtist(artist);
		setLength(hr, min, sec);	
		setLyrics(lyrics);
	}
	
	private void setTitle(String Title){
		this.Title = Title;	
	}
		
	private void setArtist(String Artist){
		this.Artist = Artist;	
	}
		
	private void setLength(int hours, int minutes, int seconds){
		SongLength = LocalTime.of(hours, minutes, seconds);	
	}
	
	void setLyrics(String Lyrics){
		this.Lyrics = Lyrics;	
	}
		
	public String getTitle(){
		return Title;	
	}
		
	public String getArtist(){
		return Artist;	
	}
	
	public LocalTime getLength(){
		return SongLength;	
	}
		
	public String getLyrics(){
		return Lyrics;		
	}
		
	public String formatInfo(){
		return getArtist()+ " / '" + getTitle() + "' / (" + getLength() + ")";	
	}
}