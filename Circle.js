// area of circle and parameter using function in oops
import java.util.Scanner;
class Circle{
float r;

void acceptData(){

Scanner sk=new Scanner(System.in);
System.out.println("Enter Radius : ");
r=sk.nextfloat();

 
}

void showData(){
System.out.println("Area:"+Math.P|*Math.pow(r,2));
} 
void getCircle(){
System.out.println("Circumference :"+2*Math.P|*r);
}


public static void main(String args[]){
 
Circle r=new Circle();
r.acceptData();
r.showData();
r.getArea();
r.getCircle();

}
}