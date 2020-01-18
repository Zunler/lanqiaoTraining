/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q2
 * Author:   pengzijun
 * Date:     2020/1/18 10:49 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lqfinal2015;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/18
 * @since 1.0.0
 */
public class Q2 {
    static boolean vis[] = new boolean[16];
    static int pos[] = new int[16];
    static int ans = 0;

    public static boolean check(int[] nums) {
        boolean col = true;
        boolean row = true;
        boolean dig = nums[0] + nums[5] + nums[10] + nums[15] == nums[3] + nums[9] + nums[6] + nums[12];
        int[] colRes = new int[4];
        int[] rowRes = new int[4];
        int[] digRes = new int[4];
        for (int i = 0; i < 4; i++) {
            rowRes[i] = nums[i * 4] + nums[i * 4 + 1] + nums[i * 4 + 2] + nums[i * 4 + 3];
            colRes[i] = nums[i] + nums[i + 4] + nums[i + 8] + nums[i + 12];

        }
        for (int i = 1; i < 4; i++) {
            if (colRes[i] != colRes[0]) {
                col = false;
                break;
            }

        }
        for (int i = 1; i < 4; i++) {
            if (rowRes[i] != rowRes[0]) {
                row = false;
                break;
            }

        }
        if (col && row && dig) {
            if ((colRes[0] == rowRes[0]) && (colRes[0] == (nums[0] + nums[5] + nums[10] + nums[15]))) {
                return true;
            } else {
                return false;
            }
        }
        {
            return false;
        }

    }

    public static void dfs(int cur) {
        if (cur == 16) {
            if (check(pos)) {
                ans++;
                System.out.println(ans);
                return;
            }


        }
        for (int i = 1; i < 16; i++) {
            if (!vis[i]) {
                vis[i] = true;
                pos[cur] = i + 1;
                dfs(cur + 1);
                pos[cur] = 0;
                vis[i] = false;
            }

        }
    }

    public static void main(String[] args) {
        pos[0] = 1;
        dfs(1);
        int[] nums = {1, 12, 13, 8, 2, 14, 7, 11, 15, 3, 10, 6, 16, 5, 4, 9};
        System.out.println(check(nums));
        System.out.println(ans);
    }
}