/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q8
 * Author:   pengzijun
 * Date:     2020/2/14 9:02 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2019;

import java.util.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/14
 * @since 1.0.0
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int T = s.nextInt();
        Map<Integer, Integer> data = new TreeMap<Integer, Integer>();
        //res[i][j] 表示i时刻 j店铺的优先值
        int[][] res = new int[T + 1][N + 1];
        int[] ids = new int[M];
        int[] ts = new int[M];
        for (int i = 0; i < M; i++) {
            int key = s.nextInt();
            int value = s.nextInt();
            res[key][value] += 2;

        }
        int count = 0;
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 1; i < T + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                if (res[i][j] == 0) {
                    //当前时刻没有订单，优先值-1，最少为0
                    res[i][j] = (res[i - 1][j] - 1) > 0 ? (res[i - 1][j] - 1) : 0;
                    if (res[i][j] <= 3) {
                        //踢出队列
                        if(arrayList.contains(j)){
                            arrayList.remove((Object)j);
                        }
                    }

                }
                else {
                    //当前时刻有订单，累加
                    res[i][j] += res[i - 1][j];
                    if (res[i][j] > 5) {
                        //加入队列
                        if(!arrayList.contains(j)){
                            arrayList.add(j);
                        }

                    }
                }

            }

        }
        System.out.println(arrayList.size());


    }
}