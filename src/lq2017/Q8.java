/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q8
 * Author:   pengzijun
 * Date:     2020/2/6 10:18 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2017;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/6
 * @since 1.0.0
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//蒸笼数
        int a[] = new int[101];//每种蒸笼的容量

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        int gcd = a[1];
        //保证所有数互质
        for (int i = 2; i <= n; i++) {
            gcd = GCD(gcd, a[i]);
        }
        if (gcd != 1) {

            System.out.println("INF");
        } else {
            //所有数互质
            boolean dp[] = new boolean[10000];
            //为什么开到10000就够了
            dp[0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j + a[i] <= 10000; j++) {
                    if (dp[j]) {
                        dp[j + a[i]] = true;
                    }
                }
            }
            int sum = 0;
            for (int i = 0; i <= 10000; i++) {
                if (dp[i] == false) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }

    private static int GCD(int x, int y) {
        //递归求解最大公约数，辗转相除法
        if (y == 0) {
            return x;
        } else {
            return GCD(y, x % y);
        }
    }


}