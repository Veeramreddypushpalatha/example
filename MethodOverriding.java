public class MethodOverriding {
public static void main(String[] args) {
basic obj=new basic();
obj.num();
obj.num(a: 5);
obj.num(a: 5, b: 2);
}
}
class basic{ 2 usages
public void num(){ 1 usage
System.out.println("This is a method");
}
public void num(int a) { 1 usage
System.out.println("the value of a is: "+a);
}
public void num(int a, int b) { 1 usage
System.out.println(a + "and" +b);
}
