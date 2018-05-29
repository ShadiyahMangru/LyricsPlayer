/* CreatePlayListGUI class creates UI where user selects playlist length and 
chooses specific songs to include, and their order, in a custom playlist*/
//TO DO:
//1.) enable vertical scrolling

package LyricsPlayer;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreatePlayListGUI extends JFrame implements ActionListener, ItemListener{
	private JFrame createCustomList;
	private JPanel createPanel;
	private JPanel scrollChoices;
	private JPanel radGrid;
	private JLabel space;
	private JButton createBtn;
	private JButton resetBtn;
	private int minSongs;
	private int maxSongs;
	private Font customFontTitle = new Font("Oslo", Font.BOLD, 36);
	private Font customFontHeader = new Font("Oslo", Font.BOLD, 29);
	private SongLib getYourLibrary;
	
	//initialize empty ArrayLists
	private static ArrayList<JComboBox<String>> PlayListLength = new ArrayList<JComboBox<String>>();
	private ArrayList<JRadioButton> radArray = new ArrayList<JRadioButton>();
	private ArrayList<JLabel> labelArray = new ArrayList<JLabel>();
	private static ArrayList<JLabel> spaceArray = new ArrayList<JLabel>();
	private static ArrayList<String> sel = new ArrayList<String>();
		
	//no-arg non-default constructor
	public CreatePlayListGUI(){
		minSongs = 3;
		maxSongs = 8;
		createCustomList = new JFrame("Lyrics Player by Shadiyah Mangru");
		createPanel = new JPanel();
		radGrid = new JPanel(new GridLayout(1, 6));
		space = new JLabel("                                                                                                     ");
		createBtn = new JButton("CREATE CUSTOM PLAYLIST");
		resetBtn = new JButton("RESET");
		getYourLibrary = new SongLib();
		
		Color libCountColor = new Color(237, 237, 142);
		Color panelBkgrnd = new Color(49, 142, 18);
		
		createCustomList.setSize(700,790);
		createCustomList.setDefaultCloseOperation(EXIT_ON_CLOSE);
		createCustomList.setMaximizedBounds(new Rectangle(0,0 , 700, 1200)); 
		createCustomList.add(createPanel);
		
		JLabel title = new JLabel("                                        Create A Playlist                                        ");
		JLabel radLabel = new JLabel("Select Playlist Length");
		JLabel libLabel = new JLabel("          " + Integer.toString(getYourLibrary.getSongLib().size()) + " Songs Currently in Library          ");
		radLabel.setFont(customFontHeader);
		radLabel.setForeground(Color.white);
		libLabel.setFont(customFontHeader);
		libLabel.setForeground(libCountColor);
		
		setRadArray(minSongs, maxSongs);
		setRadArrayVals(minSongs);
		
		createPanel.add(title);
		createPanel.add(radLabel);
		createPanel.add(radGrid);
		createPanel.add(libLabel);
		createPanel.setBackground(panelBkgrnd);
		title.setForeground(Color.white);
		title.setFont(customFontTitle);
		space.setFont(customFontTitle);
		createCustomList.setVisible(true);
	}
	
	public JLabel getSpace(){
		return space;	
	}
	
	public ArrayList<String> getSel(){
		return sel;	
	}
	
	public void setPlayListLength(int listLength){
	try{
		for(int i=0; i<listLength;i++){
			PlayListLength.add(new DropDownMenu(getYourLibrary.getSongsMenu()).getGUIMenu());
		}
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	}
	
	public ArrayList<JComboBox<String>> getPlayListLength(){
		return PlayListLength;	
	}
	
	void setMenuLabelSpaceVals(){
	try{
		Font customFontMenu = new Font("Sans Serif", Font.BOLD, 21);
		Font customFontSpace = new Font("Sans Serif", Font.BOLD, 10);
		for(int i = 0; i<PlayListLength.size();i++){
			PlayListLength.get(i).setFont(customFontMenu);
			PlayListLength.get(i).addActionListener(this);
			
			labelArray.add(new JLabel());
			labelArray.get(i).setText("Choose Song " + (i+1));
			labelArray.get(i).setForeground(Color.white);
			labelArray.get(i).setFont(customFontMenu);
			
			spaceArray.add(new JLabel());	
			spaceArray.get(i).setText("                                                                                                                                                                               ");
			spaceArray.get(i).setFont(customFontSpace);
			
			createPanel.add(labelArray.get(i));
			createPanel.add(PlayListLength.get(i));
			createPanel.add(spaceArray.get(i));
		}
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	}
	
	public ArrayList<JLabel> getSpaceArray(){
		return spaceArray;	
	}
	
	void setRadArray(int minVal, int maxVal){
	try{
		for(int i = minVal; i <= maxVal; i++){
			radArray.add(new JRadioButton());
		}
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	}
	
	void setRadArrayVals(int minVal){
	try{
		ButtonGroup songsInList = new ButtonGroup();
		for(int i = 0; i< radArray.size(); i++){
			radArray.get(i).setText(	Integer.toString(minVal+i));
			songsInList.add(radArray.get(i));
			radGrid.add(radArray.get(i));
			radArray.get(i).setFont(customFontHeader);
			radArray.get(i).addItemListener(this);
		}
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	}
	
	public void GUIsetPlayList(int userChoice){
	try{
		setPlayListLength(userChoice);
		setMenuLabelSpaceVals();
		createPanel.add(space);
		createPanel.add(resetBtn);
		createPanel.add(createBtn);
		Font customFontButton = new Font("Sans Serif", Font.BOLD, 32);
		resetBtn.setFont(customFontButton);
		resetBtn.addActionListener(this);
		createBtn.setFont(customFontButton);
		createBtn.addActionListener(this);
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
	}
	
	private int ctr=0;
	public void actionPerformed(ActionEvent event){
	try{
		if(ctr==0){
			//initialize default playlist values to first drop-down menu option
			for(JComboBox<String> numberSongs : PlayListLength){ 
				sel.add(getYourLibrary.getSongsMenu(0));	
			}	
			ctr++;
		}
		//replace defaults each time user makes a menu selection
		for(int i=0; i<PlayListLength.size();i++){
			if(event.getSource()==PlayListLength.get(i)){
        			sel.set(i, (String)PlayListLength.get(i).getSelectedItem());		
        		}
        	}
        	//display playlist to user as a new GUI window w/user's custom playlist
		if (event.getSource() == createBtn){		
			createCustomList.dispose();		 //close playlist creation/selection window
			DisplayPlayListGUI yourList = new DisplayPlayListGUI(); //new window opens
        	}
        	else if(event.getSource()==resetBtn){
        		createCustomList.dispose();
        		CreatePlayListGUI resetThis = new CreatePlayListGUI();
        		PlayListLength.clear();
        	}
       }
       catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
    	}
    	
     
        //user selects playlist length
       public void itemStateChanged(ItemEvent eventRad){
       try{
        	for(int i = 0; i<radArray.size();i++){
        		if(eventRad.getItemSelectable()==radArray.get(i)){
        			GUIsetPlayList(i+minSongs); 
        		}
        	}
	}
	catch(Exception e){
		System.out.println("oh noz, there is an Exception: " + e);	
	}
       }
}