/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q5
 * Author:   pengzijun
 * Date:     2020/2/3 10:01 上午
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
public class Q5 {
    // a个A，b个B，c个C 字母，能组成多少个不同的长度为n的串。
    static int f(int a, int b, int c, int n)
    {
        if(a<0 || b<0 || c<0) {
            return 0;
        }
        if(n==0) {
            return 1;
        }
        return f(a-1,b,c,n-1)+f(a,b-1,c,n-1)+f(a,b,c-1,n-1);  //填空
    }

    public static void main(String[] args)
    {
        System.out.println(f(1,1,1,2));
        System.out.println(f(1,2,3,3));
    }
}