package Calc1;
import java.util.Scanner;
class Operation{
	private float num1,num2,result;
	public void setData(float n1, float n2) {
		num1=n1;num2=n2;
	}
	public void showResult() {
		System.out.println("Result is :"+result);
	}
	public final void sum() {
		result=num1+num2;
	}
	public final void sub() {
		result=num1-num2;
	}
	public final void mult() {
		result=num1*num2;
	}
	public final int div() {
		result=num1/num2;
		int rm=(int)num1%(int)num2;
		return rm;
		}
}
public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Options are:\n1.+\n2. -\n3. *\n4. /\nEnter Your choice: ");
		short o=sc.nextShort();if (o>0 & o<5) { System.out.println("Enter Numbers");
		float a=sc.nextFloat(); float b=sc.nextFloat();Operation o1=new Operation();
		o1.setData(a,b);
		switch(o) {
		case 1:o1.sum();o1.showResult();break;
		case 2:o1.sub();o1.showResult();break;
		case 3:o1.mult();o1.showResult();break; 
		case 4:int rm=o1.div();o1.showResult(); System.out.println("remainder: "+rm); break;
		default:System.out.println("Invalid Arguments");
		}}else System.out.println("Invalid Option !");  
		 sc.close();
	}

}
