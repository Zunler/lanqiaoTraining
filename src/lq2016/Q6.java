/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q6
 * Author:   pengzijun
 * Date:     2020/1/30 10:29 上午
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
 * @create 2020/1/30
 * @since 1.0.0
 */
public class Q6 {
    static int[] nums = new int[12];
    static boolean[] vis = new boolean[13];
    static int ans = 0;

    public static void dfs(int cur) {
        //之前的版本是所有搜索完之后，写一个check函数进行判断，先逐步剪枝，减少复杂度，一下子就计算出来了

        if (cur == 3) {
            //加
            if (nums[0] + nums[1] != nums[2]) {
                return;
            }
        }
        if (cur == 6) {
            //减
            if (nums[3] - nums[4] != nums[5]) {
                return;
            }
        }
        if (cur == 9) {
            //乘
            if (nums[6] * nums[7] != nums[8]) {
                return;
            }
        }
        if (cur == 12) {
            //除
            if (nums[9]%nums[10]==0&&nums[9]/nums[10] ==nums[11]) {
                //之前直接复制过来写成nums[9]*nums[10]==nums[11],也竟然误打误撞对了
                //没有nums[9]%nums[10]==0的约束，nums[9]/nums[10] ==nums[11]结果会取整，导致有1236种结果
                for (int i = 0; i < 12; i++) {
                    System.out.print(nums[i] + " ");
                }
                System.out.println();
                ans++;
                return;
            }
            return;
        }
        for (int i = 0; i < 13; i++) {
            if (nums[cur] == 0 && !vis[i]) {
                nums[cur] = i + 1;
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