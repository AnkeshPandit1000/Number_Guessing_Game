package com.company;
import java.util.*;
class Game{
    int num;
    int a;
    int UserScore=0;
    public void setNum(int n){
        num=n;
    }
    public void Generate(){
        Random random=new Random();
        a=random.nextInt(100);
    }
    public void isCorrect(){
        if(a==num){
            System.out.println("Correct....");
            UserScore++;
        }
        else if(a<num){
            System.out.println("Entered Number is Greater");
        }
        else{
            System.out.println("Entered Number is Lesser");
        }
        System.out.println("The input:"+ num + "  and The Computer is:"+ a);
        System.out.println("Your Score is: "+ UserScore);
        System.out.println(".................................................................................................................................");
    }
}
public class GuesstheNumber {
    public static void main(String args[]){
        Game obj=new Game();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rounds: ");
        int a=sc.nextInt();
        System.out.println(".........................................LET's PLAY.................................................");
        for(int i=0;i<a;i++){
            System.out.println(".................................Enter a Number between 1-100.....................................");
            int b=sc.nextInt();
            obj.setNum(b);
            obj.Generate();
            obj.isCorrect();
            System.out.println();
        }

    }
}
