package com.ariel;
import javax.swing.*;
import java.awt.*;
public class panel extends JPanel {
String nombre;
ImageIcon imagen;
Font f= new Font("Minecraft",0,24);
public panel(String nombre) {
	JLabel rt= new JLabel("Hecho por Ariel Santangelo"); 
    add(rt);
    rt.setBounds(600,30,400,30);
    rt.setFont(f);
	setLayout(null);
	setSize(1280,1024);
	this.nombre=nombre;
}

public void paint(Graphics g) {
	
	Dimension tamanio=getSize();
	imagen= new ImageIcon(getClass().getResource(nombre));
	g.drawImage(imagen.getImage(),0,0,tamanio.width,tamanio.height,null);
	setOpaque(false);
	super.paint(g);
}
}
