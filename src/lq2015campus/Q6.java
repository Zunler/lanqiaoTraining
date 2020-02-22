/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q6
 * Author:   pengzijun
 * Date:     2020/2/11 11:37 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015campus;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/11
 * @since 1.0.0
 */
public class Q6 {


    static String[][] a = new String[9][9];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //存储
        for (int i = 0; i < 9; i++) {
            String[] str = new String[9];
            str[i] = input.nextLine();
            a[i] = str[i].split("");
        }
        backtrace(0, 0);

    }

    private static void backtrace(int x, int y) {
        if (x == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        } else {
            if (a[x][y].equals("0")) {
                //空
                for (int i = 1; i <= 9; i++) {
                    a[x][y] = i + "";
                    if (check(x, y)) {
                        if (y + 1 < 9) {
                            //不在边界上，向右
                            backtrace(x, y + 1);
                        } else {
                            //在边界上， 向下
                            backtrace(x + 1, 0);
                        }
                    }
                    //回溯
                    a[x][y] = "0";
                }
            } else {
                //不为空 ，继续走
                if (y + 1 < 9) {
                    backtrace(x, y + 1);
                } else {
                    backtrace(x + 1, 0);
                }
            }
        }
    }

    private static boolean check(int x, int y) {
        for (int i = 0; i < 9; i++) {
            if (a[x][i].equals(a[x][y]) && i != y) {
                //当前行有重复的
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            //当前列又重复的
            if (a[i][y].equals(a[x][y]) && i != x) {
                return false;
            }
        }
        int row = (x / 3) * 3;
        int col = (y / 3) * 3;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                //对角线又重复的

                if (a[i][j].equals(a[x][y]) && (i != x || j != y)) {
                    return false;
                }
            }
        }
        return true;
    }
}
