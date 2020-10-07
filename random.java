package aaa;

public class random {

    public static void main(String[] args) {
        //我想得到n到m的随机数，包括n和m,n<=m
        int n=4,m=10;
        for (int i=0;i<40;i++){
            //注意括号，转型，以及m-n+1这一表达式
            //Java中Math类的random()方法可以生成[0,1)之间的随机浮点数
            int output = (int) (Math.random()*(m-n+1))+n;
            System.out.print(output+" ");
        }
    }

}
