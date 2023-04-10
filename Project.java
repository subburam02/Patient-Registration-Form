import java.awt.event.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.*;
class Project 
{JFrame f1,f2;
	Project(String title)
	{
		f1=new JFrame(title);
	    f2=new JFrame();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField tf1,tf2,tf3,tf4;
		JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
		JRadioButton r1,r2,r3,r4;
		JComboBox cb1,cb2,cb3,cb4,cb5,cb6;
		JTextArea a1,a2,a3;
		JCheckBox c1,c2,c3;
		JButton bts,bts1;
		DefaultListModel<String> DL1;
		String Bloodgroup[]={"A+","O+","B+","AB+","A-","O-","B-","AB-"};
		String Date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
		"19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String Months[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY",
		"AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
	    String Year[]={"1980","1981","1982","1983","1984","1985","1986","1987","1988",
		"1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
		"2000","2001","2002","2003"};
       JLabel label =new JLabel(new ImageIcon("logo.jpg"));
	   label.setBounds(360,100,125,300);
	   f1.add(label);
	   label.setLayout(new FlowLayout());
   
       l11 =new JLabel(new ImageIcon("hospital.jpeg"));
	   f1.add(l11);
	   l11.setLayout(new FlowLayout());
	   l11.setBounds(450,300,500,500);
	   
        l=new JLabel(" PATIENT REGISTRATION FORM");
		l.setFont(new Font("Times New Roman",Font.BOLD,18));
		l.setBounds(250,10,300,40);
		l.setOpaque(true);//must be on to let change background color 
		l.setForeground(Color.blue);
			  
		l1=new JLabel("PATIENT NAME");
		l1.setFont(new Font("Times New Roman",Font.BOLD,16));
		l1.setBounds(10,55,130,30);
		l1.setOpaque(true);
		l1.setBackground(Color.yellow); 
		tf1=new JTextField();
		tf1.setBounds(160,55,150,30);
		
	
		l2=new JLabel("MOBILE NUMBER");
		l2.setFont(new Font("Times New Roman",Font.BOLD,16));
		l2.setBounds(10,110,147,30);
		l2.setOpaque(true);
		l2.setBackground(Color.yellow); 
		tf2=new JTextField();
		tf2.setBounds(160,110,150,30);
	
		tf2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) 
		{
		String s1=tf2.getText();
		{
		boolean isNumeric=true;
		boolean b=true;
        for(int i=0;i<s1.length();i++) 
		{
            if(!Character.isDigit(s1.charAt(i))) //check whether s1 specified character is digit/not
			{
                isNumeric = false;
            }
			if((i<9)||(i>9))
			{
			 b=false;	
			}
			if(i==9)
			{
			 b=true;	
			}
		}
		try
		{
		if(isNumeric==false)
		{		
		//JOptionPane.showMessageDialog(f1,"Enter valid number","Alert",JOptionPane.WARNING_MESSAGE);
		throw new NumberFormatException ("NE");
		}
		}
		catch(NumberFormatException  ne)
		{
		JOptionPane.showMessageDialog(f1,"Enter valid number","Alert",JOptionPane.WARNING_MESSAGE);	
		}
		if(b==false)
		{
		 JOptionPane.showMessageDialog(f1,"Enter 10 digit number","Alert",JOptionPane.WARNING_MESSAGE);
		}
		}
		}
        });	
	    
		l3=new JLabel("GENDER");
		l3.setFont(new Font("Times New Roman",Font.BOLD,16));	
		l3.setBounds(10,165,100,30);
		l3.setOpaque(true);
		l3.setBackground(Color.yellow); 
		r1=new JRadioButton("MALE");    
        r1.setBounds(160,165,80,30);    
		r2=new JRadioButton("FEMALE");    
        r2.setBounds(240,165,80,30);    
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);bg.add(r2);  
 
      	l4=new JLabel("BLOOD GROUP");
		l4.setFont(new Font("Times New Roman",Font.BOLD,16));	
		l4.setBounds(10,220,125,30);
		l4.setOpaque(true);
		l4.setBackground(Color.yellow); 
		cb1=new JComboBox(Bloodgroup);
		cb1.setBounds(160,220,75,30);
		
		l5=new JLabel("DATE OF BIRTH");
		l5.setFont(new Font("Times New Roman",Font.BOLD,16));
		l5.setBounds(10,330,125,30);
		l5.setOpaque(true);
		l5.setBackground(Color.yellow); 
		cb4=new JComboBox(Date);
		cb4.setBounds(160,330,75,30);
		cb5=new JComboBox(Months);
		cb5.setBounds(240,330,90,30);
		cb6=new JComboBox(Year);
		cb6.setBounds(335,330,75,30);
		
		l6=new JLabel("ADDRESS");
		l6.setFont(new Font("Times New Roman",Font.BOLD,16));	
		l6.setBounds(10,440,100,30);
		l6.setOpaque(true);
		l6.setBackground(Color.yellow); 	
		a1=new JTextArea();
        JScrollPane sp1=new JScrollPane(a1);
		sp1.setBounds(160,440,200,100);
		
		l7=new JLabel("E-MAIL");
		l7.setFont(new Font("Times New Roman",Font.BOLD,16));
		l7.setBounds(10,600,75,30);
		l7.setOpaque(true);
		l7.setBackground(Color.yellow); 
		tf3=new JTextField();
		tf3.setBounds(160,600,150,30);
		
		l8=new JLabel("PREFERRED DOCTOR");
		l8.setFont(new Font("Times New Roman",Font.BOLD,16));
		l8.setBounds(500,55,175,30);
		l8.setOpaque(true);
		l8.setBackground(Color.yellow); 
		tf4=new JTextField();
		tf4.setBounds(700,55,150,30);
		
		l11=new JLabel("MARITAL STATUS");
		l11.setFont(new Font("Times New Roman",Font.BOLD,16));	
		l11.setBounds(500,110,150,30);
		l11.setOpaque(true);
		l11.setBackground(Color.yellow); 
		r3=new JRadioButton("MARRIED");    
        r3.setBounds(700,110,80,30);    
		r4=new JRadioButton("UNMARRIED");    
        r4.setBounds(800,110,100,30);    
        ButtonGroup bg1=new ButtonGroup();    
        bg1.add(r3);bg1.add(r4);  

		l9=new JLabel("REGISTRATION SOURCE");
		l9.setFont(new Font("Times New Roman",Font.BOLD,16));
		l9.setBounds(500,165,197,30);
		l9.setOpaque(true);
		l9.setBackground(Color.yellow); 
		c1=new JCheckBox("WALK-IN",true);
		c1.setBounds(700,165,100,30);
		c2=new JCheckBox("REFERRED");
		c2.setBounds(800,165,125,30);
		
		l10=new JLabel("REMARKS");
		l10.setFont(new Font("Times New Roman",Font.BOLD,16));
		l10.setBounds(500,250,100,30);
		l10.setOpaque(true);
		l10.setBackground(Color.yellow); 
		a3=new JTextArea();
        a3.setBounds(700,250,200,100);
		
		bts=new JButton("SUBMIT");
		bts.setFont(new Font("Times New Roman",Font.BOLD,18));
		bts.setBounds(500,400,150,30);
		bts1=new JButton("SHOW All Entries");
		bts1.setFont(new Font("Times New Roman",Font.BOLD,18));
		bts1.setBounds(700,400,200,30);
		DefaultTableModel tableModel = new DefaultTableModel();
       JTable table = new JTable(tableModel);
	   tableModel.addColumn("Patient Name");
	   tableModel.addColumn("Mobile Number");
	   tableModel.addColumn("Blood Group");
	   tableModel.addColumn("DOB");
	   tableModel.addColumn("Preferred Doctor");
	   Color col0 = new Color(255,102,102);		
	   table.setBackground(col0);
	 
		bts.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) 
		{
		    JOptionPane.showMessageDialog(f1,"SUBMITTED SUCCESSFULLY");
			tableModel.addRow(new Object[] { tf1.getText(),tf2.getText(),cb1.getItemAt(cb1.getSelectedIndex()), 
			cb4.getItemAt(cb4.getSelectedIndex())+"-"+cb5.getItemAt(cb5.getSelectedIndex())+"-"+cb6.getItemAt(cb6.getSelectedIndex()),tf4.getText()
			});
		    }
		});    
		bts1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) 
		{
		f2.setSize(750,750);
		f2.setLayout(null);
		f2.setVisible(true);
	    }
		});    
		JScrollPane sp2=new JScrollPane(table);
		sp2.setBounds(0,0,750,750);           
    
		f1.add(l);
		f1.add(tf1);
		f1.add(l1);
		f1.add(tf2);
		f1.add(l2);
		f1.add(l3);
		f1.add(r1);
	    f1.add(r2);
		f1.add(l4);
		f1.add(cb1);
		f1.add(l5);
		f1.add(cb4);
		f1.add(cb5);
		f1.add(cb6);
		f1.add(l6);
		f1.add(l7);
		f1.add(tf3);
		f1.add(sp1);
		f1.add(l8);
		f1.add(l9);
		f1.add(tf4);
		f1.add(c1);
		f1.add(c2);
		f1.add(bts);
		f1.add(bts1);
		f2.add(sp2);
		f1.add(l10);
		f1.add(a3);
		f1.add(l11);
		f1.add(r3);
		f1.add(r4);
		f1.setSize(1000,750);
		f1.setLayout(null);
		f1.setVisible(true);	
		
		Color col1 = new Color(255,102,102);		 
		f1.getContentPane().setBackground(col1);
		
	}
	public static void main(String args[])
	{
	new Project("Registration Form");
	}
	
}
