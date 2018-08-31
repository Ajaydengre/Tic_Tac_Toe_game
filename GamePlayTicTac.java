package tictactoe;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

import java.awt.Font;



import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlayTicTac extends JPanel implements MouseListener,
		ActionListener {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int scoreone=1,scorecross=1;
	public boolean play;
	public boolean turnplayer0=true;
	public boolean oval;
	public boolean turnplayerx=false;
	public int x=0;
	public int y=0;
	public int i=0;
	public int flag=1;
	public int bug = 0;
	public boolean gameplay=false;
    char[] ch = new char[9];
	
	private Timer timer;
	private int delay = 2;
	
	
	public GamePlayTicTac(){
		setFocusable(true);
		requestFocus();
		
		this.addMouseListener(this);
		
		for (this.i = 0; this.i < 9; this.i += 1)
	        this.ch[this.i] = 'B';
		
		
		
		timer = new Timer(delay,this);
		timer.start();
	}
	
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0, 0, 400, 400);
		
		
		
		g.setColor(Color.white);
		g.fillRect(125,50,5,275);
		
		g.setColor(Color.white);
		g.fillRect(250,50,5,275);
		
		g.setColor(Color.white);
		g.fillRect(25,125,325,5);
		
		g.setColor(Color.white);
		g.fillRect(25,225,325,5);
		
		g.setColor(Color.white);
		g.setFont(new Font("Comic Sans Ms",Font.ITALIC,20));
		g.drawString("PlayerX :"+(scorecross-1), 20, 20);
		
		g.setColor(Color.white);
		g.setFont(new Font("Comic Sans Ms",Font.ITALIC,20));
		g.drawString("Player0 :"+(scoreone-1), 250, 20);
		
		g.dispose();
		
		
		
	}
	
	
	
	public void xwin(){
		Graphics g3=this.getGraphics();
		if(bug==2){
			g3.setColor(Color.yellow);
			g3.setFont(new Font("Comic Sans Ms",Font.ITALIC,50));
			g3.drawString("PlayerX won :"+scorecross, 20, 150);
			
			g3.setColor(Color.yellow);
			g3.setFont(new Font("Comic Sans Ms",Font.ITALIC,20));
			g3.drawString("Click! To play Again", 20, 200);
		}
		if(bug==1){
			g3.setColor(Color.red);
			g3.setFont(new Font("Comic Sans Ms",Font.ITALIC,50));
			g3.drawString("Player0 won :"+scoreone, 20, 150);
			
			g3.setColor(Color.yellow);
			g3.setFont(new Font("Comic Sans Ms",Font.ITALIC,20));
			g3.drawString("Click! To play Again", 20, 200);
		}
		
		if(bug==3){
			g3.setColor(Color.red);
			g3.setFont(new Font("Comic Sans Ms",Font.ITALIC,50));
			g3.drawString("DRAW", 100, 150);
			
			g3.setColor(Color.yellow);
			g3.setFont(new Font("Comic Sans Ms",Font.ITALIC,20));
			g3.drawString("Click! To play Again", 20, 200);
		}
		g3.dispose();
		
	}
	
	public void drawCircle(int x,int y){
		Graphics g2=this.getGraphics();
		
		g2.setColor(Color.blue);
		g2.drawOval(x,y, 50, 50);
		
		g2.dispose();
	}
	public void drawCross(int x,int y){
		Graphics g2=this.getGraphics();
		
		g2.setColor(Color.blue);
		g2.setFont(new Font("serif",Font.BOLD,50));
		g2.drawString("X",x,y);
		
		g2.dispose();
	}
	
	public void actionPerformed(ActionEvent e) {

		 }
	public void mouseDoubleClicked(MouseEvent e){
		
	}

	public void mouseClicked(MouseEvent e) {
		
		
		if(gameplay){
			bug=0;
			
			for(i=0;i<9;i++){
				ch[i]='B';
			}
			
			repaint();
			flag=1;
		     
		     gameplay=false;
		     
		     timer = new Timer(delay,this);
				timer.start();
		}
		if(!gameplay){
			if(e.getClickCount()==2&&!e.isConsumed()){
		
		if(flag==1){
			
			if(e.getX()>25&&e.getX()<125){
				
				
				if(e.getY()>25&&e.getY()<125)
				{
					if(ch[0]=='B'){
					this.ch[0]='R';
					drawCircle(40,50);
					this.flag-=1;
					}
					
				}
				if(e.getY()>125&&e.getY()<225)
				{
					if(ch[1]=='B'){
					this.ch[1]='R';
					drawCircle(40,150);
					this.flag-=1;
					}
					
				}
				if(e.getY()>225&&e.getY()<325)
				{
					if(ch[2]=='B'){
					this.ch[2]='R';
					drawCircle(40,250);
					this.flag-=1;}
					
				}
				
			}
			if(e.getX()>125&&e.getX()<250){
				
				
				if(e.getY()>25&&e.getY()<125)
				{
					if(ch[3]=='B'){
					this.ch[3]='R';
					
					drawCircle(160,50);
					this.flag-=1;}
				}
				if(e.getY()>125&&e.getY()<225)
				{
					if(ch[4]=='B'){
					this.ch[4]='R';
					drawCircle(160,150);
					this.flag-=1;}
				}
				if(e.getY()>225&&e.getY()<300)
				{
					if(ch[5]=='B'){
					this.ch[5]='R';
					drawCircle(160,250);
					this.flag-=1;}
				}
				
			}
			if(e.getX()>250&&e.getX()<375){
				
				
				if(e.getY()>25&&e.getY()<125)
				{
					if(ch[6]=='B'){
					this.ch[6]='R';
					drawCircle(270,50);
					this.flag-=1;}
					
				}
				if(e.getY()>125&&e.getY()<225)
				{
					if(ch[7]=='B'){
					this.ch[7]='R';
					drawCircle(270,150);
					this.flag-=1;}
					
				}
				if(e.getY()>225&&e.getY()<300)
				{
					if(ch[8]=='B'){
					this.ch[8]='R';
					drawCircle(270,250);
					this.flag-=1;}
				}
				
			}

             
			
		}
		if(flag==0){
			if(e.getX()>25&&e.getX()<125){
				
				
				if(e.getY()>25&&e.getY()<125)
				{if(ch[0]=='B'){
					this.ch[0]='P';
					drawCross(40,100);
					this.flag=1;
				}
				}
				if(e.getY()>125&&e.getY()<225)
				{if(ch[1]=='B'){
					this.ch[1]='P';
					drawCross(40,200);
					this.flag=1;
				}
				}
				if(e.getY()>225&&e.getY()<300)
				{if(ch[2]=='B'){
					this.ch[2]='P';
					drawCross(40,300);
					this.flag=1;
				}}
				
			}
			if(e.getX()>125&&e.getX()<250){
				
				
				if(e.getY()>25&&e.getY()<125)
				{if(ch[3]=='B'){
					this.ch[3]='P';
					drawCross(160,100);
					this.flag=1;
				}
				}
				if(e.getY()>125&&e.getY()<225)
				{if(ch[4]=='B'){
					this.ch[4]='P';
					drawCross(160,200);
					this.flag=1;}
				}
				if(e.getY()>225&&e.getY()<300)
				{if(ch[5]=='B'){
					this.ch[5]='P';
					drawCross(160,300);
					this.flag=1;}
				}
				
			}
			if(e.getX()>250&&e.getX()<375){
				
				
				if(e.getY()>25&&e.getY()<125)
				{
					if(ch[6]=='B'){
					this.ch[6]='P';
					drawCross(270,100);
					this.flag=1;}
					
				}
				if(e.getY()>125&&e.getY()<225)
				{
					if(ch[7]=='B'){
					this.ch[7]='P';
					drawCross(270,200);
					this.flag=1;
					}
				}
				if(e.getY()>225&&e.getY()<300)
				{
					if(ch[8]=='B'){
					this.ch[8]='P';
					drawCross(270,300);
					this.flag=1;
					}
				}
				
			}

			
			
		}
		
		for(i=0;i<3;i++){
			if(i!='B'){
			if((ch[i]=='P') && (ch[i]==ch[i+3])&&(ch[i]==ch[i+6])){
				gameplay=true;
				
				bug=2;
				xwin();
				scorecross=scorecross+1;
			}
			if((ch[i]=='R') && (ch[i]==ch[i+3])&&(ch[i]==ch[i+6])){
				gameplay=true;
				bug=1;
				
				xwin();
				scoreone=scoreone+1;
			}
			}
			
			
		}
		
		for(i=0;i<7;i++){
			if(ch[i]!='B'){
			if((ch[i]=='P') && (ch[i]==ch[i+1])&&(ch[i]==ch[i+2])){
				gameplay=true;
				
				bug=2;
				xwin();
				scorecross=scorecross+1;
			}
			if((ch[i]=='R') && (ch[i]==ch[i+1])&&(ch[i]==ch[i+2])){
				gameplay=true;
				bug=1;
				
				xwin();
				scoreone=scoreone+1;
			}
			i+=2;
			}
			else{
				i+=2;
			}
			
			
		}
		
		if(ch[4]!='B'){
			if((ch[4]==ch[0])&&(ch[4]==ch[8])||(ch[4]==ch[2])&&(ch[4]==ch[6])){
				if(ch[4]=='P'){
					gameplay=true;
					
					bug=2;
					xwin();
					scorecross=scorecross+1;		
				}
				else{
					gameplay=true;
					bug=1;
					
					xwin();
					scoreone=scoreone+1;
				}
			}
			
		}

		for (i = 0;(i < 9)&&(ch[i] != 'B');i += 1)
		        {
		            if (i == 8)
		            {
		            	if(bug==0){
		            	gameplay=true;
		                
		                bug = 3;
		                xwin();
		            	}
		            }
		        }
		
		}
			
		}

	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
