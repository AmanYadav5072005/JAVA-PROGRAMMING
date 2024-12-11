import java.util.Scanner;
class To Upper{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter Any String :");

String s=scan.nextline();
String r=s.toUpperCase();
System.out.println("Result: "+r);

String x=r.toLowerCase();
System.out.println("Result: "+x);
}

}