/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q1
 * Author:   pengzijun
 * Date:     2020/1/31 10:28 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2017;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/31
 * @since 1.0.0
 */
public class Q1 {
    static int ans = 0;

    public static void dfs(int x, int y, int step, char[][] m) {
        if (x == 10 || y == 10 || x == -1 || y == -1) {
            ans++;
            return;
        }
        if (step > 100) {//在10x10 的地图内走了大于100步则认为是困住了
            return;
        }
        switch (m[x][y]) {
            case 'U':
                dfs(x - 1, y, step + 1, m);
                break;
            case 'D':
                dfs(x + 1, y, step + 1, m);
                break;
            case 'L':
                dfs(x, y - 1, step + 1, m);
                break;
            case 'R':
                dfs(x, y + 1, step + 1, m);
                break;

        }

    }

    public static void main(String[] args) {
        String s = "UDDLUULRUL\n" +
                "UURLLLRRRU\n" +
                "RRUURLDLRD\n" +
                "RUDDDDUUUU\n" +
                "URUDLLRRUU\n" +
                "DURLRLDLRL\n" +
                "ULLURLLRDU\n" +
                "RDLULLRDDD\n" +
                "UUDDUDUDLL\n" +
                "ULRDLUURRR";
        String[] lines = s.split("\n");
        char[][] matrix = new char[10][10];
        int n = 0;
        //储存到矩阵
        for (String line :
                lines) {
            char[] chars = line.toCharArray();
            for (int i = 0; i < 10; i++) {
                matrix[n][i] = chars[i];
            }
            n++;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                dfs(i, j, 0, matrix);

            }

        }
        System.out.println(ans);
    }

}