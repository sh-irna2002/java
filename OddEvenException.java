import java.util.Scanner;
class OddException extends Exception {
OddException(String s) {
        super(s);
    }
}
class EvenException extends Exception {
EvenException(String s) {
        super(s);
    }
}
class Oddeven{
    void Oddevenx(int x)throws OddException, EvenException{
        if(x % 2 == 0){
            throw new EvenException("number is even");
            }
            else
            {
                throw new OddException("number is odd");
                
            }
        }
    }
public class OddEvenException
{
public static void main(String args[])
{
Oddeven o = new Oddeven();
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n = sc.nextInt();
try {
o.Oddevenx(n);
}
catch(EvenException e){
System.out.println(e);
}
catch(OddException e){
System.out.println(e);
}
}
}
