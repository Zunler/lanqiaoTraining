/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q7
 * Author:   pengzijun
 * Date:     2020/2/9 9:10 下午
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
 * @create 2020/2/9
 * @since 1.0.0
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        int m = s.nextInt();
        int[][][] cube = new int[A][B][C];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                for (int k = 0; k< C; k++) {
                    cube[i][j][k] = s.nextInt();
                }

            }

        }
        for (int i = 0; i < m; i++) {
            int lat=s.nextInt();
            int rat=s.nextInt();
            int lbt=s.nextInt();
            int rbt=s.nextInt();
            int lct=s.nextInt();
            int rct=s.nextInt();
            int ht=s.nextInt();
            for (int j = lat-1; j <=rat-1 ; j++) {
                for (int k = lbt-1; k <=rbt-1; k++) {
                    for (int l = lct-1; l <= rct-1; l++) {
                        cube[j][k][l]-=ht;
                        if(cube[j][k][l]<0){
                            System.out.println(i+1);
                            return;
                        }

                    }

                }

            }


        }
    }
}