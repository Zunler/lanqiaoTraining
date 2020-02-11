/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q6
 * Author:   pengzijun
 * Date:     2020/2/10 10:16 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2018;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/10
 * @since 1.0.0
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        sum = in.nextInt();
        int[] time = new int[2 * sum];
        for (int i = 0; i <= 2 * sum; i++) {
            if (i == 0) {
                String a = in.nextLine();
            } else {
                String first = in.nextLine();

                String[] one = first.split("\\s\\(\\+|:|\\)| ");
                time[i - 1] = ((Integer.valueOf(one[3]) * 3600
                        + Integer.valueOf(one[4]) * 60 + Integer
                        .valueOf(one[5])) - (Integer.valueOf(one[0]) * 3600
                        + Integer.valueOf(one[1]) * 60 + Integer
                        .valueOf(one[2])));
                if (one.length > 6) {
                    time[i - 1] += Integer.valueOf(one[6]) * 24 * 3600;
                }

            }
        }
        int[] res = new int[sum];
        for (int i = 0; i < res.length; i++) {
            int aa[] = new int[3];
            res[i] = (time[2 * i + 1] + time[2 * i]) / 2;
            aa[0] = res[i] / 3600;
            aa[1] = (res[i] - aa[0] * 3600) / 60;
            aa[2] = res[i] - aa[0] * 3600 - aa[1] * 60;
            String str1 = String.format("%02d", aa[0]);
            String str2 = String.format("%02d", aa[1]);
            String str3 = String.format("%02d", aa[2]);
            System.out.printf("%2s:%2s:%2s\n", str1, str2, str3);
        }
    }


}