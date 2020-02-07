/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q6
 * Author:   pengzijun
 * Date:     2020/2/3 10:15 上午
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
 * @create 2020/2/3
 * @since 1.0.0
 */
public class Q6 {

        static int f(String s1, String s2)
        {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            int[][] a = new int[c1.length+1][c2.length+1];

            int max = 0;
            for(int i=1; i<a.length; i++){
                for(int j=1; j<a[i].length; j++){
                    if(c1[i-1]==c2[j-1]) {
                        a[i][j] =a[i-1][j-1]+1 ;
                        //填空
                        if(a[i][j] > max) {
                            max = a[i][j];
                        }
                    }
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int n = f("abcdkkk", "baabcdadabc");
            System.out.println(n);
        }
}