/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201509
 * Author:   pengzijun
 * Date:     2020/1/17 10:37 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/17
 * @since 1.0.0
 */
public class q201509 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] A = new int[6][6];
        //初始化矩阵
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = 1;
            }
        }
        int a, b;
        for (int i = 0; i < m; i++) {
            a = input.nextInt();
            b = input.nextInt();
            A[a - 1][b - 1] = 0;
            A[b - 1][a - 1] = 0;
        }
        int[] original = new int[6];
        Arrays.fill(original, 1);//直接填充

        int[][] temp = quickMatrix(A, n - 1);
        int[] res = matrix(temp, original);
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += res[i];
        }
        double t = Math.pow(4, n) * sum % 1000000007;
        System.out.println((int) t);
    }

    public static int[][] quickMatrix(int[][] A, int n) {
        if (n == 1) {
            return A;
        }
        if (n % 2 == 1) {
            return matrix(quickMatrix(A, n - 1), A);
        } else {
            int[][] temp = quickMatrix(A, n / 2);
            return matrix(temp, temp);
        }
    }

    public static int[][] matrix(int[][] A, int[][] B) {
        //dp
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    res[i][j] = res[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }

    public static int[] matrix(int[][] A, int[] B) {
        int[] res = new int[B.length];
        for (int i = 0; i < A.length; i++) {
            for (int k = 0; k < B.length; k++) {
                res[i] = res[i] + A[i][k] * B[k];
            }
        }
        return res;
    }

}