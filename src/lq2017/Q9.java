/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q9
 * Author:   pengzijun
 * Date:     2020/2/7 10:38 上午
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
 * @create 2020/2/7
 * @since 1.0.0
 */
public class Q9 {
    public static boolean judge(int len) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (heights[i] / len) * (weights[i] / len);

        }
        if (sum < k) {
            //len过大
            return false;
        }
//len过小
        return true;
    }

    static int n, k;
    static int[] heights;
    static int[] weights;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();//巧克力块数
        k = s.nextInt();//小朋友数
        heights = new int[n];
        weights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = s.nextInt();
            weights[i] = s.nextInt();
        }
        int low = 1;
        int hight = 100000;
        int mid = 0;

        while (low <= hight) {
            mid = (low + hight) / 2;
            if (judge(mid)) {
                //mid过小
                low = mid + 1;
            } else {
                //mid过大
                hight = mid - 1;
            }
        }

        low++;
        //递减搜索，即为最大
        while (low != 0) {
            low--;
            if (judge(low)) {
                break;
            }
        }
        System.out.println(low);


    }

}