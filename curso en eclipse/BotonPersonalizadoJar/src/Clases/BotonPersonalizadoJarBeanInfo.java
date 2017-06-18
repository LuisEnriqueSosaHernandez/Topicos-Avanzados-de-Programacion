package Clases;

import java.awt.Image;
import java.beans.SimpleBeanInfo;

public class BotonPersonalizadoJarBeanInfo extends SimpleBeanInfo{
Image icono16C;
Image icono32C;
Image icono16B;
Image icono32B;
public BotonPersonalizadoJarBeanInfo(){
	icono16C=loadImage("/Imagenes/Lesh");
	icono32C=loadImage("/Imagenes/lesh2");
	icono16B=loadImage("/Imagenes/lesh4");
	icono32B=loadImage("/Imagenes/lesh3");
}
public Image getIcon(int i){
	switch(i){
	case 1:
		return icono16C;
	case 2:
		return icono32C;
	case 3:
		return icono16B;
	case 4:
		return icono32B;
	}
	return null;
}
}
