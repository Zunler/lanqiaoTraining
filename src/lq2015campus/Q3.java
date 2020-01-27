/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q3
 * Author:   pengzijun
 * Date:     2020/1/19 10:44 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015campus;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/19
 * @since 1.0.0
 */
public class Q3 {
    public static void main(String[] args) {
        for (double x = 2.0; x < 3.0; x += 0.00000001) {
            if (Math.abs(Math.pow(x, x) - 10) < 0.000001) {
                System.out.println(String.format("%.6f", x));
                break;
            }
        }
    }

}
