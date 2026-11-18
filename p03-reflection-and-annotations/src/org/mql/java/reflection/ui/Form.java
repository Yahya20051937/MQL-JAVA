package org.mql.java.reflection.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Form extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private JPanel container;
	private int labelWidth;
	
	public Form() {
		this(150);
	}
	
	public Form(int labelWidth) {
		this.labelWidth = labelWidth;
		setLayout(new FlowLayout(FlowLayout.LEFT));
		container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		add(container);
	}
	
	public void addField(String label, int size) {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel l1 = new JLabel(label + " : ");
		l1.setPreferredSize(new Dimension(labelWidth, l1.getPreferredSize().height));
		JTextField t1 = new JTextField(size);
		p.add(l1);
		p.add(t1);
		container.add(p);
	}
}
