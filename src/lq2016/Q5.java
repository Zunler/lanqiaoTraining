/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q5
 * Author:   pengzijun
 * Date:     2020/1/29 9:56 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2016;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/29
 * @since 1.0.0
 */
public class Q5 {
    public static void f(int[] a, int k, int n, String s) {
        if (k == a.length) {
            if (n == 0) {
                System.out.println(s);
            }
            return;
        }

        String s2 = s;
        for (int i = 0; i <= a[k]; i++) {
              f(a,k+1,n-i,s2);
              //填空位置
            s2 += (char) (k + 'A');
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 2, 2, 1, 1, 3};

        f(a, 0, 5, "");
    }
}