package confuse;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JTextArea;
import javax.swing.JTextField;

class Confuse implements ActionListener{
	JFrame f;
	JTextField t,fi;
	JTextArea k = new JTextArea();
	JTextArea ta = new JTextArea();
	JButton refresh,show;
	String sb,fina; 
	
	public Confuse()throws Exception {
		
		f = new JFrame();
		
		String d = "1. PLEASE CHOOSE A NUMBER NOT ALPHABATES.\n2. THEN SUM THE DIGIT OF THE NUMBER.\n3. THE SUBSTRACT THE SUM FROM YOUR ORIGINAL NUMBER.\n4. THEN CHECK THE ALPHABATES OF YOUR RESULT NUMBER.\n5. THEN CLICK ON SHOW BUTTON.\n6. THEN GET SURPRISE.";
		k.setText(d);
		k.setBounds(20, 20, 743, 170);
		k.setBackground(Color.WHITE);
		k.setForeground(Color.BLACK);
		k.setFont(new Font(d, Font.BOLD, 20));
		k.setEditable(false);
		f.add(k);
					
		refresh = new JButton();
		refresh.setBounds(40, 70, 100, 30);
		refresh.setText("REFRESH");
		refresh.setFocusable(false);
		refresh.addActionListener(this);
		refresh.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		show = new JButton();
		show.setText("SHOW");
		show.setCursor(new Cursor(Cursor.HAND_CURSOR));
		show.addActionListener(this);
		show.setFocusable(false);
		show.setBounds(40, 110, 100, 30);
		
		ta.setBounds(770, 20, 180, 170);
		ta.setBackground(Color.PINK);
		ta.setForeground(Color.WHITE);
		ta.setFont(new Font(d, Font.BOLD, 20));
		ta.setEditable(false);
		ta.add(refresh);
		ta.add(show);
		f.add(ta);
		runa();
		f.setLayout(null);
		f.setSize(1000, 1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.black);
		f.setTitle("MADE BY ASMIN");
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==show){
			getsource(ta);
		}else if(e.getSource()==refresh) {
			
			try {
				runa();
				fi.setVisible(false);
			} catch (Exception e1) {
			}
		}
	}
	public void getsource(JTextArea ta) {
		this.ta=ta;
		fi = new JTextField();
		fi.setBounds(40,10,100,40);
		fi.setText("    "+sb);
		fi.setBackground(Color.RED);
		fi.setForeground(Color.BLACK);
		fi.setFont(new Font("System", Font.BOLD, 20));
		ta.add(fi);
	}
	public void runa() {
		
		int b = 20;
		int c = 200;
		for(int i=1;i<=100;i++){
	        Random r = new Random();
	        	
	        t=new JTextField();
	        if(i%10==0) {
	        	c+=50;
	        	b=20;
	        }
			t.setBounds(b, c, 80, 35);
			b+=95;
			
			String ch="abcdefghijklmnopqrstuvwxyz";
			String p = "";
			fina = p;
			int len=4;
			
			char[] charr = new char[len];
			
			for(int j=0;j<len;j++) {
				charr[j] = ch.charAt(r.nextInt(ch.length()));
			}
			for(int k=0;k<len;k++) {
				p+=charr[k];
			}
			
			if(i==9){
				sb = p;   
			}
			if(i%9==0) {
				p=sb;
			}
			String s = String.valueOf(i+":   "+p);
			t.setText(s);
			t.setFont(new Font(s, Font.BOLD, 13));
			t.setBackground(Color.WHITE);
			t.setForeground(Color.BLUE);
			t.setEditable(false);
			f.add(t);
	}
}
	}
public class Confuse_Program {
	public static void main(String[] args) {
		try {
			new Confuse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
