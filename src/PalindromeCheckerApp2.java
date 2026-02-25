import java.util.Scanner;
class Uc1 {
    public void show() {
        System.out.println("Welcome to palindrome checker app");
        System.out.println("Version 1.0");
        System.out.println("System initialized successfully");
    }
}
class Uc2{
    String name;
    public boolean find(){
        boolean palin=true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the palindrome you want to check: ");
        name=input.nextLine();
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-i-1)) {
                palin=false;
                break;
            }
        }
        if(palin){
            System.out.println("It is a Palindrome? " +name);
        }
        else{
            System.out.println("Not a Palindrome " +name);
        }
        return palin;
    }
}
public class PalindromeCheckerApp2{
    public static void main(String[] args){
      Uc1 ob1=new Uc1();
      Uc2 ob2=new Uc2();
      ob1.show();
      System.out.println("Status: " +ob2.find());
    }
}

