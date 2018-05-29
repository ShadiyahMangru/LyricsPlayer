package LyricsPlayer;
import javax.swing.*;

public class DropDownMenu extends JFrame{
	private JComboBox<String> menu;
	private String[] options;
	
	public DropDownMenu(String[] ListValues){
		options = ListValues;
		setListValues(options);		
	}
	
	public void setListValues(String[] choices){
		options = choices;
		menu = new JComboBox<String>(options);		
	}
	
	public String[] getListValues(){
		return options;		
	}
	
	public JComboBox<String> getGUIMenu(){
		return menu;		
	}
}