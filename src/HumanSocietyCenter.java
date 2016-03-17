import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.print.PrinterException;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;



public class HumanSocietyCenter {
	
	
		public static void main(String[] args) {
		ArrayList<Animal> animal = new ArrayList<Animal>();
		Dog dog;
		Cat cat;
		Chicken chicken;
		Sparrow sparrow;
		int selection,i=1;
		int poodles=0;
		int dalmatian=0;
		int american = 0;
		int persian = 0;
		int rosecomb = 0;
		int foxsparrow = 0;
		////////////////////////////////////////DATA START////////////////////////////////////////////////////////////
		
		//Scanner sc = new Scanner(System.in);

		
		
		
		///////////////////////////////////////////DATA END/////////////////////////////////////////////////////

	
		JFrame frame = new JFrame();
		JLabel welcome = new JLabel("Welcome to Human Society Center", SwingConstants.CENTER);
		welcome.setFont(welcome.getFont ().deriveFont (34.0f));


		
		
		

	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel jPanel = new JPanel(new GridLayout(4,4,0, 10));
	    jPanel.add(welcome);
	    jPanel.setOpaque(true);
	    //jPanel.add(L);    
	    //jPanel.add(new JScrollPane(table));
	    //jPanel.add(L1);
	    //jPanel.add(new JScrollPane(table2));
	    
	    //JPanel container = new JPanel();
	  		//container.setLayout(new GridLayout(1, 7, 0, 10));
	    jPanel.add((Component) AnimalFactory.getAnimal("Poodle"));
	    jPanel.add((Component) AnimalFactory.getAnimal("American"));
	  		//jPanel.add(container);	
	  	//frame.getContentPane().add(container); 
	  	
	    frame.add(jPanel);
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setVisible(true);
		}
		
		
	}

