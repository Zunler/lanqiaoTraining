/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q9
 * Author:   pengzijun
 * Date:     2020/2/15 11:11 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/15
 * @since 1.0.0
 */
public class Q9 {
    static Scanner sc = new Scanner(System.in);
    static int[][] a = new int[105][25];
    static int[] sta = new int[105];
    static int[] dp = new int[(1<<20)+5];

    public static void main(String[] args) {

        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        Arrays.fill(dp, -1);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                a[i][j]=sc.nextInt();
                sta[i]|=1<<(a[i][j]-1);
            }
            dp[sta[i]]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<(1<<m);j++){
                if(dp[j]==-1) continue;
                if(dp[j|sta[i]]==-1||dp[j]+1<dp[j|sta[i]]){
                    dp[j|sta[i]]=dp[j]+1;
                }
            }
        }
        System.out.println(dp[(1<<m)-1]);
    }

}