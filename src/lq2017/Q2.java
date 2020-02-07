/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q2
 * Author:   pengzijun
 * Date:     2020/1/31 11:34 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2017;

import java.util.HashSet;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/31
 * @since 1.0.0
 */
public class Q2 {
    static boolean[] vis = new boolean[10];
    static int[] factor = new int[10];
    static int ans = 0;

    public static boolean judge(int result) {
        Set<Character> set = new HashSet<Character>();
        char[] nums = String.valueOf(result).toCharArray();
        if(nums.length!=9){
            return false;
        }
        for (char num :
                nums) {
            if(num=='0'){
                return false;
            }
            if (set.contains(num)) {
                return false;
            } else {
                set.add(num);
            }

        }

        return true;
    }

    public static void dfs(int cur) {
        if (cur == 1 && factor[0] == 0) {
            return;

        }
        if (cur == 10) {
            if (factor[9] == 0) {
                return;
            }

            int a;
            int b;
            int c;

            String s_a = "";
            int index = 0;
            for (int i = 0; i < 10; i++) {
                if (factor[i] == 0) {
                    index = i;
                    break;
                }
                s_a += String.valueOf(factor[i]);

            }
            a = Integer.parseInt(s_a);

            String s_b = "";
            for (int i = index + 1; i < 10; i++) {
                s_b += String.valueOf(factor[i]);

            }
            b = Integer.parseInt(s_b);
            int result = a * b;
            if (judge(result)) {

                ans++;
                System.out.println(ans);
                System.out.println(a + " " + b + " " + result);
                return;
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!vis[i] && factor[cur] == -1) {
                vis[i] = true;
                factor[cur] = i;
                dfs(cur + 1);
                vis[i] = false;
                factor[cur] = -1;

            }

        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            factor[i] = -1;

        }
        dfs(0);
        System.out.println(ans / 2);
    }
}