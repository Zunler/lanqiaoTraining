/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201505
 * Author:   pengzijun
 * Date:     2020/1/16 6:18 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/16
 * @since 1.0.0
 */
public class q201505 {

    public static void f(int n) {
        String s = "*";
        for (int i = 0; i < 2 * n - 3; i++) {
            s += ".";
        }
        s += "*";

        String s1 = s + "\n";
        String s2 = "";

        for (int i = 0; i < n - 1; i++) {
            s = "." + s.substring(0, 2 * n - 4 - i) + "*";
            //填空
            s1 = s + "\n" + s1;
            s2 += s + "\n";
        }
        System.out.println(s1 + s2);//上下两部分
    }

    public static void main(String[] args) {
        f(8);
    }
}

