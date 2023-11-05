package pack;

public class class1 {

	public static void main(String[] args) {
		class1 kite	 = new class1();
		kite.mind();
		kite.body();
		kite.tom();
		kite.jerry();
		kite.together();
	}
public void mind() {
int a = 1000;
int b = 2000;
int c = a+b;
System.out.println(c);
		
}
public void body() {
int a = 50;
int b = 60;
int c = 70;
int d = 90;
int e = a*b+c-d;	
System.out.println(e);	
	
}
public void tom() {
	int a = 5;
	int b = 6;
	System.out.println(a+b);

}
public void jerry() {
int a = 800;
int b = 10;
System.out.println(a/b);
	
}
public void together() {
int a = 500;
double b = 10.50;
String c = "My value is ";
char n = 'm';
System.out.println(c+(a+b)+n);
	
	
}	
}
