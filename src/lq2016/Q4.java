/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q4
 * Author:   pengzijun
 * Date:     2020/1/29 9:43 下午
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
public class Q4 {
    public static String remain(int[] a) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                s += (char) (i + 'A');
            }
        }
        return s;
    }

    public static void f(String s, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                continue;
            }
            a[i] = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == 1) {
                    continue;
                }
                a[j] = 1;
                for (int k = j + 1; k < a.length; k++) {
                    if (a[k] == 1) {
                        continue;
                    }
                    a[k] = 1;
                    System.out.println(s + " " + (char)('A'+i)+(char)('A'+j) +(char)('A'+k)  + " " + remain(a));
                    //填空位置
                    a[k] = 0;
                }
                a[j] = 0;
            }
            a[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] = 1;

        for (int b = 1; b < a.length; b++) {
            a[b] = 1;
            for (int c = b + 1; c < a.length; c++) {
                a[c] = 1;
                String s = "A" + (char) (b + 'A') + (char) (c + 'A');
                f(s, a);
                a[c] = 0;
            }
            a[b] = 0;
        }
    }
}