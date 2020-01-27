/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q1
 * Author:   pengzijun
 * Date:     2020/1/19 10:10 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015campus;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/19
 * @since 1.0.0
 */
public class Q1 {
    public static int f(String x, String y)
    {
        if(x.length()==0) {
            return 0;
        }
        if(y.length()==0) {
            return 0;
        }



        String x1 = x.substring(1);
        String y1 = y.substring(1);

        if(x.charAt(0)==y.charAt(0)) {
            return f(x1,y1)+1;
        }

        return Math.max(f(x,y1),f(x1,y)) ;
    }

    public static void main(String[] args)
    {
        System.out.println(f("ac","abcd"));
        //2
        System.out.println(f("acebbcde1133","xya33bc11de"));
        //5
    }
}