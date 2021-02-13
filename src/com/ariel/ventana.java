package com.ariel;


import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ventana extends JFrame{
	JButton btn1,btn2,btn3,btn4,btn5;
    JLabel jlx,jly,jlz,fn;
    JTextField ibx,iby,ibz;
    String nx,ny,nz;
    Font f= new Font("Minecraft",0,24);
    int x,y,z;
    	float s,b;
    	panel py= new panel("/Imagen/fondo.jpg");
    public ventana(){
    	setVisible(true);
    	setFont(f);
    	getContentPane().add(py);
    	setLocationRelativeTo(null);
        setSize(1280,1024);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarcomponentes();
    }
    private void boton1(){
        btn1= new JButton();
        py.add(btn1);
        btn1.setFont(f);
        btn1.setBounds(250,120,700,100);
    }
    private void boton2(){
        btn2= new JButton();
       py.add(btn2);
       btn2.setFont(f);
        btn2.setBounds(250,320,700,100);
    }
    private void boton3(){
        btn3= new JButton("Calcular");
        btn3.setFont(f);
        py.add(btn3);
        btn3.setBounds(568,240,300,100);
    }
    public void regresar(){
        btn4= new JButton("Regresar");
        py.add(btn4);
        btn4.setFont(f);
        btn4.setBounds(700,650,500,100);
    }//boton 4

    public void regresar2(){
        btn5= new JButton("Regresar al menu");
        py.add(btn5);
        btn5.setFont(f);
        btn5.setBounds(50,650,500,100);     
    }//boton 5
    
    private void iniciarcomponentes() {
    	setTitle("Minecraft blocks calculator");
        boton_1();
        boton_2();
    }

     private void boton_1(){
        boton1();
        btn1.setText("Paredes");
         paredes();
    }

    private void boton_2(){
        boton2();
        btn2.setText("Pisos");
        pisos();
    }
  
    private void paredes() {
        ActionListener pa= e->{
         btn1.setVisible(false);
         btn2.setVisible(false);
         btn1.removeNotify();
         btn2.removeNotify();
            iniciarcomponentes2();
        };
        btn1.addActionListener(pa);
    }

    private void iniciarcomponentes2() {
        colocarboton3();
        colocarboton4();
         regresar2_0();
    }
    public void regresar2_0() {
    	regresar2();  
    	ActionListener d= e->{
    		 btn1.setVisible(false);
             btn2.setVisible(false);
             btn1.removeNotify();
             btn2.removeNotify();
             btn5.setVisible(false);
             btn5.removeNotify();
              iniciarcomponentes();
          };
          btn5.addActionListener(d);
    }
   
    private void colocarboton3(){
     boton1();
     btn1.setText("Paredes (para una casa)");
        pa_pa_un_ca();
    }
    private void colocarboton4(){
       boton2();
       btn2.setText("Muros");
        pa_in();

    }

    private void pa_pa_un_ca() {
        ActionListener ca= e->{
        	 btn1.setVisible(false);
             btn2.setVisible(false);
             btn5.setVisible(false);
             btn1.removeNotify();
             btn2.removeNotify();
             btn5.removeNotify();
            iniciarcomponentes3();
        };
        btn1.addActionListener(ca);
    }

    private void iniciarcomponentes3(){
        setTitle("Si no entendes esto, has de cuenta que es un cuadrado, y para lo ultimo se refiere a su altura");
        colocarblocx();
        colocarblocy();
        colocarblocz();
        insertarblocx();
        insertarblocy();
        insertarblocz();
        calcular();
        regresar2_1();
        re2_1();
    }
    private void regresar2_1() {
	regresar2();
	ActionListener re=e->{
		jlx.setVisible(false);
		jlx.removeNotify();
		jly.setVisible(false);
		jly.removeNotify();
		jlz.setVisible(false);
		jlz.removeNotify();
		ibx.setVisible(false);
		ibx.removeNotify();
		iby.setVisible(false);
		iby.removeNotify();
		ibz.setVisible(false);
		ibz.removeNotify();
		btn3.setVisible(false);
		btn3.removeNotify();
		btn4.setVisible(false);
		btn4.removeNotify();
		btn5.setVisible(false);
		btn5.removeNotify();
		iniciarcomponentes();
	};
	 btn5.addActionListener(re);	
	}
	private void re2_1(){
        regresar();
        ActionListener re= e->{
        	jlx.setVisible(false);
    		jlx.removeNotify();
    		jly.setVisible(false);
    		jly.removeNotify();
    		jlz.setVisible(false);
    		jlz.removeNotify();
    		ibx.setVisible(false);
    		ibx.removeNotify();
    		iby.setVisible(false);
    		iby.removeNotify();
    		ibz.setVisible(false);
    		ibz.removeNotify();
    		btn3.setVisible(false);
    		btn3.removeNotify();
    		btn4.setVisible(false);
    		btn4.removeNotify();
    		btn5.setVisible(false);
    		btn5.removeNotify();
          iniciarcomponentes2();
        };
        btn4.addActionListener(re);
    }
    
    private void colocarblocx(){
        jlx= new JLabel("Ingrese el tamanio de largo de los bloques que tiene de x:");
        py.add(jlx);
        jlx.setFont(f);
        jlx.setBounds(50,100,900,30);
    }
private void colocarblocy(){
        jly= new JLabel("Ingrese el tamanio de ancho de los bloques que tiene de y:");
        py.add(jly);
        jly.setFont(f);
        jly.setBounds(50,140,900,30);
}
private void colocarblocz(){
        jlz=new JLabel("Ingrese los niveles de alto que quiere tener en su casa:");
        py.add(jlz);
        jlz.setFont(f);
        jlz.setBounds(50,180,900,30);
    }
private void insertarblocx(){
        ibx= new JTextField();
        py.add(ibx);
        ibx.setBounds(900,100,200,30);

}
private void insertarblocy(){
        iby= new JTextField();
        py.add(iby);
        iby.setBounds(900,140,200,30);

}
private void insertarblocz(){
        ibz= new JTextField();
        py.add(ibz);
        ibz.setBounds(900,180,200,30);

}
private void calcular(){
        boton3();
        cxyz();
    }
    private void cal(){
        nx=ibx.getText();
        x=Integer.parseInt(nx);
        ny=iby.getText();
        y=Integer.parseInt(ny);
        y-=2;
        x-=2;
        s=x*y;
        JOptionPane.showMessageDialog(null,"Los bloques que va a necesitar son:"+s);
       if(s>=64) {
    	   b= s/64;
    	   JOptionPane.showMessageDialog(null,"Los stacks que va a necesitar son:"+b);
       }
       else {
    	   
       }
       }
private  void cxyz(){
    ActionListener c= e->{

    nx=ibx.getText();
    x=Integer.parseInt(nx);
    ny=iby.getText();
    y=Integer.parseInt(ny);
    nz=ibz.getText();
    z=Integer.parseInt(nz);
   x-=1;
    y-=1;
    s=(x*2+y*2)*z;
    JOptionPane.showMessageDialog(null,"Los bloques que va a necesitar son:"+s);
    if(s>=64) {
    	 b= s/64;
    	JOptionPane.showMessageDialog(null,"Los stacks que va a necesitar son:"+b);
    }
    
        };
        
    btn3.addActionListener(c);
}
    private void pa_in() {
        ActionListener ca=e->{
            btn1.setVisible(false);
            btn2.setVisible(false);
            btn5.setVisible(false);
            btn1.removeNotify();
            btn2.removeNotify();
            btn5.removeNotify();
            iniciarcomponentes4();
        };
        btn2.addActionListener(ca);
    }

    private void iniciarcomponentes4() {
        setTitle("Si no entendes esto, has de cuenta que es un cuadrado");
        colocarblocx();
        colocarblocy();
        insertarblocx();
        insertarblocy();
        calcular2();
        regresar2_2();
        re2_2();
    }

    private void re2_2() {
	regresar();
	ActionListener re2= e->{
		jlx.setVisible(false);
		jlx.removeNotify();
		jly.setVisible(false);
		jly.removeNotify();
		ibx.setVisible(false);
		ibx.removeNotify();
		iby.setVisible(false);
		iby.removeNotify();
		btn3.setVisible(false);
		btn3.removeNotify();
		btn4.setVisible(false);
		btn4.removeNotify();
		btn5.setVisible(false);
		btn5.removeNotify();
		iniciarcomponentes2();
	};
    	btn4.addActionListener(re2);
	}
	private void regresar2_2() {
	regresar2();
	ActionListener re2=e->{
		jlx.setVisible(false);
		jlx.removeNotify();
		jly.setVisible(false);
		jly.removeNotify();
		ibx.setVisible(false);
		ibx.removeNotify();
		iby.setVisible(false);
		iby.removeNotify();
		btn3.setVisible(false);
		btn3.removeNotify();
		btn4.setVisible(false);
		btn4.removeNotify();
		btn5.setVisible(false);
		btn5.removeNotify();
		iniciarcomponentes();
	};
		btn5.addActionListener(re2);
	}
	private void calcular2(){
        boton3();
        cxy();
    }
    private void  cxy(){
        ActionListener ca= e->cal();
        btn3.addActionListener(ca);
    }
    private void pisos(){
        ActionListener pi= e->{
        btn1.setVisible(false);
        btn1.removeNotify();
        btn2.setVisible(false);
        btn2.removeNotify();
        iniciarcomponentes5();
        };
        btn2.addActionListener(pi);
    }

    private void iniciarcomponentes5() {
        setTitle("Si no entendes esto, has de cuenta que es un cuadrado");
        colocarblocx();
        colocarblocy();
        insertarblocx();
        insertarblocy();
        regresar2_3();
        calcular3();
    }
public void regresar2_3() {
	regresar2();
	ActionListener m= e->{
		jlx.setVisible(false);
		jlx.removeNotify();
		jly.setVisible(false);
		jly.removeNotify();
		ibx.setVisible(false);
		ibx.removeNotify();
		iby.setVisible(false);
		iby.removeNotify();
		btn3.setVisible(false);
		btn3.removeNotify();
		btn5.setVisible(false);
		btn5.removeNotify();
		iniciarcomponentes();
	};
	btn5.addActionListener(m);
}
    private void calcular3() {
       boton3();
       cxy2();
    }

    private void cxy2() {
        ActionListener ca= e->cal();
        btn3.addActionListener(ca);
    }

}
