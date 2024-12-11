import java.util.Scanner;
class A22{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.println("Enter Any String :");
String s=scan.nextline();
String s1="";
for(int x:s.toCharArray()){
        if(x>='a' &&x<='z')
        x=x-32;
        s1=s1+(char)x;
        }
        else if (x>='A'&& x='z'