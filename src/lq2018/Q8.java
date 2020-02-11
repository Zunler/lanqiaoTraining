/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q8
 * Author:   pengzijun
 * Date:     2020/2/9 9:33 下午
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
public class Q8 {
    static char[][] matrix;
    static boolean[][] vis;
    static int[] ans = new int[10000];
    //地图边长
    static int N;


    public static void dfs(int x, int y, int num) {
        if(x<0||x>=N||y<0||y>=N){
            return;
        }
        if (matrix[x][y] == '.') {
            return;
        }
        if (vis[x][y]) {
            return;
        }
        if (matrix[x + 1][y] != '.' && matrix[x - 1][y] != '.' && matrix[x][y + 1] != '.' && matrix[x][y - 1] != '.') {
            ans[num]++;
        }
        //设置为已经访问
        vis[x][y] = true;
        //四个方向搜索
        dfs(x + 1, y, num);
        dfs(x - 1, y, num);
        dfs(x, y + 1, num);
        dfs(x, y - 1, num);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        matrix = new char[N][N];
        vis = new boolean[N][N];
        //读取空格
        s.nextLine();
        //地图储存
        for (int i = 0; i < N; i++) {
            String line = s.nextLine();
            matrix[i] = line.toCharArray();
        }
        //岛屿数
        int num = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == '#' && !vis[i][j]) {
                    dfs(i, j, num);
                    num++;

                }

            }

        }
        int res=0;
        for (int i = 0; i <num ; i++) {
            if(ans[i]==0){
                res++;
            }

        }
        System.out.println(res);
    }
}