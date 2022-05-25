import java.util.Scanner;
public class wml25{
    static Scanner sc=new Scanner(System.in);
    //任意产生一个运算符的方法
    private static String getRandom(int k) {
        String str="";
        switch(k) {
            case 1:str = "+";
                break;
            case 2:str = "-";
                break;
            case 3:str = "*";
                break;
            case 4:str = "/";
                break;
        }
        return str;
    }
    //计算正确答案
    private static int calculate(int a, int b, int k){
        int sum=0;
        switch(k) {
            case 1:sum=a+b;
                break;
            case 2:sum=a-b;
                break;
            case 3:sum=a*b;
                break;
            case 4:sum=a/b;
                break;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入操作数的范围：");
        int y=sc.nextInt();
        System.out.println("请输入题目个数：");
        int x=sc.nextInt();
        for(int i=0;i<x;i++) {
            int a=(int)(Math.random()*y);
            int b=(int)(Math.random()*y);
            int k=(int)(Math.random()*4+1);
            int answer=calculate(a,b,k);

            //System.out.println("求出的正确答案是"+);
            //四则运算符由自定义方法getRandom获取
            System.out.print(a+getRandom(k)+b+"="+answer);

            if(answer>=0) {
                System.out.println("......求出的正确答案是" + answer);
                System.out.println("");
            }
            else {
                System.out.println("此结果小于零" + answer);
                System.out.println("");
            }
        }
    }
}