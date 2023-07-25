import java.util.Scanner;

class Exam{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter three numbers");
        a =sc.nextInt();
        b =sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is the greatest number.");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greatest number.");
        }
        else{
            System.out.println(c+" is the greatest number.");
        }
        int sum=a+b+c;
        System.out.println("sum = "+sum);
        int avg=sum/3;
        System.out.println("Average = "+avg);
    }
}