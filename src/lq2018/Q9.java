/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q9
 * Author:   pengzijun
 * Date:     2020/2/9 9:45 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/9
 * @since 1.0.0
 */
public class Q9 {
    static ArrayList<Integer> nums = new ArrayList<Integer>();
    static boolean[] vis;
    static int[] res = new int[3];
    static int n;
    static int k;
    static int flag=0;

    public static void dfs(int cur) {
        if (cur == 3) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += res[i];
            }
            if (sum % k == 0) {
                System.out.println(sum);
                flag=1;
                return;
            }
            return;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (res[cur] == Integer.MAX_VALUE && !vis[i]&&flag==0) {
                res[cur] = nums.get(i);
                vis[i] = true;

                dfs(cur + 1);
                res[cur] = Integer.MAX_VALUE;
                vis[i] = false;

            }

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();
        k = s.nextInt();

        vis = new boolean[n];
        for (int i = 0; i < 3; i++) {
            res[i] = Integer.MAX_VALUE;

        }
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            nums.add(num);

        }
        Collections.sort(nums);

        dfs(0);

    }

}