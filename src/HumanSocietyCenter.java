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

		JFrame frame = new JFrame();
		JLabel welcome = new JLabel("Welcome to Human Society Center", SwingConstants.CENTER);
		welcome.setFont(welcome.getFont ().deriveFont (34.0f));
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel jPanel = new JPanel(new GridLayout(4,4,0, 10));
	    jPanel.add(welcome);
	    jPanel.setOpaque(true);
	    jPanel.add((Component) drawAnimal(AnimalFactory.getAnimal("Poodle")));
	    jPanel.add((Component) drawAnimal(AnimalFactory.getAnimal("American")));
	    jPanel.add((Component) drawAnimal(new AnimalWithName(new Dalmatian("Tommy"))));
	    frame.add(jPanel);
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setVisible(true);
		
		}
		
	

		public static Animal drawAnimal(Animal animal) {
			animal.draw();
			return animal;
	}
}

