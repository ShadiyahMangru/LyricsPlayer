/*DisplayPlayListGUI class displays the user's custom playlist 
and allows 'sliding' through each song's lyrics*/
//TO DO:
//1.) enable vertical scrolling

package LyricsPlayer;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayPlayListGUI extends JFrame{
	private JPanel displayPanel;
	private ArrayList<JLabel> selArray;
	private ArrayList<JTextArea> lyricsArray;
	private ArrayList<JScrollPane> scrollArray;
	
	private SongLib newInstSL;
	private CreatePlayListGUI newInstCPLG;
	
	//no-arg non-default constructor
	public DisplayPlayListGUI(){
		newInstSL = new SongLib();
		newInstCPLG = new CreatePlayListGUI();
		displayPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		selArray = new ArrayList<JLabel>();
		lyricsArray = new ArrayList<JTextArea>();
		scrollArray = new ArrayList<JScrollPane>();
		GUIdisplayCustomList();	
	}
	
      	public JFrame GUIdisplayCustomList(){
      JFrame displayCustomList = new JFrame("Lyrics Player by Shadiyah Mangru");
      	try{
      		Color displayBkgrnd = new Color(23, 167, 196);
      		Font customFontTitle = new Font("Oslo", Font.BOLD, 36);
      		JLabel displayTitle = new JLabel("Your Custom Playlist: ");
      		
		displayCustomList.setSize(700,890);   
		displayCustomList.add(displayPanel);
		displayCustomList.setVisible(true);		//open new window with user's custom playlist
		displayCustomList.setDefaultCloseOperation(EXIT_ON_CLOSE);
		displayCustomList.setMaximizedBounds(new Rectangle(0,0 , 750, 1200)); 
		
		displayPanel.add(displayTitle);
		displayPanel.setBackground(displayBkgrnd);
		displayTitle.setFont(customFontTitle);
		displayTitle.setForeground(Color.orange);
		newInstCPLG.getSpace().setFont(customFontTitle);
		setSelectionArray(newInstCPLG.getSel());
		setSelectionLabelVals();
		getLyricsToDisplay();
		setDisplayPanel();	
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	return displayCustomList;
      }
      
      void getLyricsToDisplay(){
      try{ 
      	  	int [] songIndex = new int[newInstCPLG.getSel().size()];
      	  	String [] lyricsSel = new String[newInstCPLG.getSel().size()];
      	 	for(int k = 0; k < newInstCPLG.getSel().size(); k++){
      	 		String getMatch = newInstCPLG.getSel().get(k);
      	 		for(int i = 0; i < newInstSL.getSongCount(); i++){
      	 			if(getMatch.equals(newInstSL.getUnsortedFormatSongLib().get(i))){
      	 				songIndex[k] = i;
      	 			}
      	 		}
      	  	}
      	  	for(int h = 0; h < newInstCPLG.getSel().size() ; h++){
      	  		lyricsSel[h] = newInstSL.getSongLib().get(songIndex[h]).getLyrics();
      	  	}
      	  	for(int i=0; i<newInstCPLG.getPlayListLength().size();i++){
			lyricsArray.get(i).setText(lyricsSel[i]);		
		}
      	}
      	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
      }
      
	void setSelectionArray(ArrayList<String> yourSels){
	try{
		for( String selection : yourSels){ 
		selArray.add(new JLabel());	
		lyricsArray.add(new JTextArea(1, 25));
		}
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	}
	
	void setSelectionLabelVals(){
	try{
		for(int i=0; i<newInstCPLG.getPlayListLength().size();i++){
			selArray.get(i).setText("Song " + (i+1) + ":     " + newInstCPLG.getSel().get(i));		
		}
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	}	
	
	void setDisplayPanel(){	//adds user's song selection to playlist display window
	try{
		Font customFontSongs = new Font("Oslo", Font.BOLD, 26);
		Font customFontLyrics = new Font("Verdana", Font.BOLD, 24);
		for(int i=0; i<newInstCPLG.getPlayListLength().size();i++){
			selArray.get(i).setFont(customFontSongs);
			selArray.get(i).setForeground(Color.white);
			scrollArray.add(new JScrollPane(lyricsArray.get(i), ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED));
			lyricsArray.get(i).setFont(customFontLyrics);
			lyricsArray.get(i).setForeground(Color.blue);
			displayPanel.add(selArray.get(i));
			displayPanel.add(scrollArray.get(i));
			displayPanel.add(newInstCPLG.getSpaceArray().get(i));		
		}
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	}
	
}