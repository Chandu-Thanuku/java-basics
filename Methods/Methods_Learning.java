 import java.util.Scanner;
class methods {
    public static void main(String args[]){
        double a=1;
        double b=9.234;
        add(a,b);
        int num=2;
        mutliplication(num);
        Scanner input=new Scanner(System.in);
        input.close();
    }
    static void add(double a,double b){
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("enter ");
        x=input.nextInt();
        System.out.println(a+b);

    }
    static void mutliplication(int num){
        for(int i=1;i<=10;i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }

    }
}
