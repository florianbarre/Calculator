package fr.imie.Calculator.Launcher;
import java.lang.Math;

public class Scientifique {
	if(src==bPuiss){
		aux = Double.parseDouble(txt.getText());
		Puiss=true;
	}
	else if(src==bpuis10){
		double  x=Double.parseDouble(txt.getText());
		double  res=Math.pow(10,x);
		txt.setText(""+res);
	}
	else if(src==bSin){
		if(!shift){
			double  x=Math.toRadians(Double.parseDouble(txt.getText()));
			double res=Math.sin(x);
			txt.setText(""+res);
		}
	}
	else if(src==bLog) {
		double aux = Double.parseDouble(txt.getText());
		double log = Math.log(var);
		text.setText(""+log);
		
	}
}