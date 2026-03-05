import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
class uc1 {
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
            System.out.println("It is a Palindrome " +name);
        }
        else{
            System.out.println("Not a Palindrome " +name);
        }
        return palin;
    }
}

class Uc3{
    String beforerev;
    String afterrev="";
    public void reverse(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a palindrome string to reverse it and verify: ");
        beforerev=input.nextLine();
        for(int i=beforerev.length()-1;i>=0;i--){
            afterrev=afterrev+beforerev.charAt(i);
        }
        if(afterrev.equals(beforerev)){
            System.out.println("Palindrome verified");
            System.out.println("Before: " +beforerev);
            System.out.println("After reverse: "+afterrev);
        }
        else{
            System.out.println("Palindrome not verified, before cannot be equal to after");
        }
    }
}
class Uc4{
    String name2;
    public void arraycheck(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the string you want to check with array: ");
        name2=input.nextLine();
        char[] arr=name2.toCharArray();
        boolean palin=true;
        int start=0;
        int end=arr.length-1;
        while(start<end){
            if(arr[start]!=arr[end]){
                palin=false;
                break;
            }
            start++;
            end--;
        }
        if(palin){
            System.out.println("Palindrome verified: " +name2);
        }
        else{
            System.out.println("Not a Palindrome: " +name2);
        }
    }
}
class Uc5{
    String name;
    public void stack() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string to check using Stack: ");
        name = input.nextLine();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<name.length();i++){
            stk.push(name.charAt(i)); //pushes madam from 0 to 4 into stack
        }
        boolean palin=true;
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=stk.pop()){ //0th index 'm' is compared with stack pops last index(4th) 'm'
                palin=false;
                break;
            }
        }
        if(palin){
            System.out.println("Palindrome verified: " +name);
        }
        else{
            System.out.println("Not a Palindrome: " +name);
        }
    }
}
class Uc6 {
    public void comp() {
        String input = "civic";
        Queue<Character> q = new LinkedList();
        Stack<Character> s = new Stack();
        for (int i = 0; i < input.length(); i++) {
            q.add(input.charAt(i));
            s.push(input.charAt(i));
        }

        boolean palin = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (q.remove() != s.pop()) { //0th index 'm' is compared with stack pops last index(4th) 'm'
                palin = false;
                break;
            }
        }
        if (palin) {
            System.out.println("Palindrome verified: " + input);
        } else {
            System.out.println("Not a Palindrome: " + input);
        }
    }
}

public class PalindromeCheckerApp2{
    public static void main(String[] args){
      uc1 ob1=new uc1();
      Uc2 ob2=new Uc2();
      Uc3 ob3=new Uc3();
      Uc4 ob4=new Uc4();
      Uc5 ob5=new Uc5();
      Uc6 ob6=new Uc6();
      ob1.show();
      System.out.println("Status: " +ob2.find());
      ob3.reverse();
      ob4.arraycheck();
      ob5.stack();
      ob6.comp();
    }
}

