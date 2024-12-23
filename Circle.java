// area of circle and parameter using function in oops
import java.util.Scanner;
class Circle{
float r;

void acceptData(){

Scanner sk=new Scanner(System.in);
System.out.println("Enter Radius : ");
r=sk.nextFloat();

 
}
void showData(){
System.out.println("Radius is :"+r);
}

void getArea(){
System.out.println("Area:"+Math.PI*Math.pow(r,2));
} 
void getCircle(){
System.out.println("Circumference :"+2*Math.PI*r);
}


public static void main(String args[]){
 
Circle r1=new Circle();
r1.acceptData();
r1.showData();
r1.getArea();
r1.getCircle();

}
}