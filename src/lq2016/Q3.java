/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q3
 * Author:   pengzijun
 * Date:     2020/1/29 8:59 下午
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
public class Q3 {
    static int[] nums = new int[10];
    static boolean[] vis = new boolean[10];
    static int ans = 0;

    public static boolean check(int[] a) {
        int[] num = {0, 1, 3};
        int[] size = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < size[i]; j++) {
                if (a[num[i] + j] > a[num[i] + j+size[i]] || a[num[i] + j] > a[num[i] +j+ size[i] + 1]) {
                    return false;
                }

            }

        }


        return true;
    }

    public static void dfs(int cur) {
        if (cur == 10) {
            if (check(nums)) {
                for (int i = 0; i <10 ; i++) {
                    System.out.print(nums[i]+" ");
                }
                System.out.println();
                ans++;
                return;
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (nums[cur] == 0 && !vis[i]) {
                nums[cur] = i;
                vis[i] = true;
                dfs(cur + 1);
                nums[cur] = 0;
                vis[i] = false;
            }

        }

    }


    public static void main(String[] args) {
        dfs(0);
        System.out.println(ans);
    }

}