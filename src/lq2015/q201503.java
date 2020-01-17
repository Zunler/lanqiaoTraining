/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201503
 * Author:   pengzijun
 * Date:     2020/1/16 11:13 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/16
 * @since 1.0.0
 */
public class q201503 {

    static int[] nums = new int[9];
    static boolean[] vis = new boolean[9];
    static int count = 0;
    static ArrayList<Integer> out = new ArrayList<Integer>();

    public static void dfs(int flag) {
        if (flag == 9) {
            int[] res = new int[3];
            for (int i = 0; i < 3; i++) {
                res[i] = 100 * nums[i * 3] + 10 * nums[i * 3 + 1] + nums[i * 3 + 2];

            }
            int sum = 0;


            if (res[1] == 2 * res[0] && res[2] == 3 * res[0]) {
                out.add(res[0]);
            }
            count++;
            return;
        }
        for (int i = 0; i < 9; i++) {

            if (vis[i] == false) {
                nums[flag] = i + 1;
                vis[i] = true;
                dfs(flag + 1);
                vis[i] = false;
            }
        }


    }

    public static void main(String[] args) {

        dfs(0);
        Collections.sort(out);
        for (int num:
             out) {
            System.out.print(num+" ");
        }
    }
}