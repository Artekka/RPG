import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Test {
	/*
	BasePlayer[] items2 = {new Mage("Natsu Dragneel","Wand"), new Tank("Big BOY","Big ass Shield")};
	String[] names = new String[2];;
	names = names.getNames(items2); //should be filled with just the names from BasePlayer
	String[] items = {"Mage","Swordsman","Marksman","Tank"};

	JComboBox c = new JComboBox(names);
	JButton b = new JButton("Pick your hero!");
	JLabel quote = new JLabel("-----");
	
	*/
	
	//BasePlayer[] items = {new Mage("Natsu Dragneel","wand"), new Tank("BigBoy","Big ass Shield")};
	//String[] names = getNames(items);
	
	//JComboBox c = new JComboBox(items);
	//JComboBox c = new JComboBox(names); //has just the names; uses the getNames method
	
	//String[] items = {"Mage","Swordsman","Marksman","Tank"}; //for our drop down list!
	//String[] names = new String[items.length];;
	
	BasePlayer[] items = {new Mage("Natsu Dragneel","Wand"), new Tank("Big Boy","Big ass Shield")};
	String[] names = getNames(items);
	
	JComboBox c0 = new JComboBox(items);
	JComboBox c = new JComboBox(names);
	
	JButton b = new JButton("Pick your hero!");
	JLabel info = new JLabel("No Info");
	
	
	
	
	/*
	 * This method moves the names from our BasePlayer[] names to an array just for the names!
	 */
	public static String[] getNames(BasePlayer[] s){
		String[] names = new String [s.length];
		for (int i = 0; i<s.length; i ++){
			names[i] = s[i].getName();
		}
		return names;
	}

	public Test(){
		frame();
	}

	public void frame(){
		
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		//p.add(c);
		p.add(c0);
		p.add(b);
		p.add(info);
		
		f.add(p);
		
		b.addActionListener(new ActionListener() //What happens when you click on button!
		{
			public void actionPerformed(ActionEvent e)
			{
				//String s = c0.getSelectedItem().toString();
				info.setText(c0.getSelectedItem().toString());
				
			      // String s = items[c.getSelectedIndex()].toString();
			     //String s = c.getSelectedItem().toString(); //Names in our drop down list
				//String n = c2.getSelectedItem().toString();
			   //info.setText(s); // Stats in our drop down list
			}
		});
		
	}
	
	public static void main(String[] args){
		new Test();
	}

}
