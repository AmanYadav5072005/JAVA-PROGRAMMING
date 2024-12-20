//Recursion

class A33{
int fact(int n){
if(n==1){
return 1;

}
else{
return n*fact(n-1);

}

}

public static void main(String args[]{
A33 x=new A33();
System.out.println(x.fact(5));

}

}