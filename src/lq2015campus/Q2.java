/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q2
 * Author:   pengzijun
 * Date:     2020/1/19 10:30 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015campus;

import java.text.DecimalFormat;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/19
 * @since 1.0.0
 */
public class Q2 {
    public static void main(String[] args) {
        double pi = 0.0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                pi += (4.0) / (2 * i + 1);
            } else {
                pi -= (4.0) / (2 * i + 1);
            }

        }
        String format = new DecimalFormat("#.00").format(pi);
        System.out.println(format);

    }
}
