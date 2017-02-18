package swhw;
import java.util.Observable;

public class model extends Observable{
	float Res;
	
	model(){
		
	}
	public void add(float num1,float num2){
		
		Res=num1+num2;
		
		
	}
	
public void div(float num1,float num2){
		
		Res=num1/num2;
		
	}

public void mul(float num1,float num2){
	
	Res=num1*num2;
	
}

public void mod(float num1,float num2){
	
	Res=num1%num2;
	
}

public void sub(float num1,float num2){
	
	Res=num1-num2;
	
}
 public float getR()
 {
	 return Res;
 }


}
