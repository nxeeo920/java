import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] xishus = new int[101];
        // 第一个多项式
        for (; ; ) {
            int mi = sc.nextInt();
            int xishu = sc.nextInt();
            xishus[mi] = xishu;
            if (mi == 0) {
                break;
            }
        }
        //第二个多项式
        for (; ; ) {
            int mi = sc.nextInt();
            int xishu = sc.nextInt();
            xishus[mi] = xishus[mi] + xishu;
            if (mi == 0) {
                break;
            }
        }
        //输出
        for (int i = xishus.length - 1; i >= 0; i--) {
            if (xishus[i] != 0) {
                if (i == 1) {
                    System.out.print(xishus[i] + "x" + "+");
                } else if (i == 0) {
                    System.out.print(xishus[i]);
                } else {
                    System.out.print(xishus[i] + "x" + i + "+");
                }
            }
        }
    }
}