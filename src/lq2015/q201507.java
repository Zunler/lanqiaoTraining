/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201507
 * Author:   pengzijun
 * Date:     2020/1/17 6:35 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/17
 * @since 1.0.0
 */
public class q201507 {
    //    static int[] pos = new int[52];
//    static int[] res = new int[14];
//    static boolean[] vis = new boolean[52];
//
//    static int count = 0;
//
//    public static void dfs(int cur) {
//        if (cur == 14) {
////            for (int i = 1; i <14 ; i++) {
////                System.out.print(res[i]+" ");
////
////            }
////            System.out.println();
//            count++;
//            return;
//        }
//        for (int i = 0; i < 13; i++) {
//            if (!vis[i]) {
//                vis[i] = true;
//                res[cur] = i;
//                if (res[cur] > res[cur - 1]) {
//                    dfs(cur + 1);
//                }
//
//                res[cur] = 0;
//                vis[i] = false;
//            }
//
//        }
//
//    }
    static int[] pos = new int[13];
    static int[] remain = new int[13];
    static int cnt = 0;

    static void dfs(int cur) {
        if (cur == 13) {
            cnt++;
            return;
        }
        for (int i = 0; i < 13; i++) {
            if (remain[i] > -4) {
                remain[i]--;
                pos[cur] = i;
                if (cur != 0) {
                    if (pos[cur] >= pos[cur - 1]) {
                        dfs(cur + 1);
                    }
                } else {
                    dfs(cur + 1);
                }

                remain[i]++;
                pos[cur]--;
            }

        }
    }

    static int sum = 0;
    static int ans = 0;

    public static void cal(int cur) {
        if(cur==13){
            if(sum==13){
                ans++;
                return;

            }
        }

        else{
            for (int i = 0; i <5 ; i++) {
                sum+=i;
                cal(cur+1);
                sum-=i;

            }
        }
    }

    public static void main(String[] args) {
        cal(0);
        System.out.println(ans);
    }
}