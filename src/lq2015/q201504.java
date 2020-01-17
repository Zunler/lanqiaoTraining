/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201504
 * Author:   pengzijun
 * Date:     2020/1/16 6:10 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

import java.util.Vector;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/16
 * @since 1.0.0
 */
public class q201504 {
    public static int f(int n, int m) {
        n = n % m;
        Vector v = new Vector();

        for (; ; ) {
            v.add(n);
            n *= 10;
            n = n % m;
            if (n == 0) {
                return 0;
            }
            if (v.indexOf(n) >= 0) {
                return v.size();
            }
        }
    }

    public static void main(String[] args) {

        System.out.println(f(11, 13));
    }
}