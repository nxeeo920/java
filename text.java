import java.util.Scanner;

public class shuzu3 {
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
        String result = "";
        for (int i = xishus.length - 1; i >= 0; i--) {
            if (xishus[i] != 0) {
                if (!result.isEmpty()) {
                    if (xishus[i] >= 0) {
                        result = result + "+";
                    }
                }
                if (i == 1) {
                    if (xishus[i] == 1) {
                        result = result + "x";
                    } else {
                        result = result + xishus[i] + "x";
                    }
                } else if (i == 0) {
                    result = result + xishus[i];
                } else {
                    result = result + xishus[i] + "x" + i;
                }
            }
        }
        System.out.println(result);
        if(result.isEmpty()){
            System.out.print(0);
        }
    }
}
