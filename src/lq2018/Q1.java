/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q
 * Author:   pengzijun
 * Date:     2020/2/9 4:12 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2018;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/9
 * @since 1.0.0
 */
public class Q1 {
static int GCD(int x,int y){
    if(y==0){
        return x;
    }
    return GCD(y,x%y);
}
    public static void main(String[] args) {

        int bot=1;
        int top=1;
        for (int i = 1; i <20 ; i++) {
            top=2*top+1;
            bot=bot*2;
        }
        System.out.println(top+" "+bot);

        int gcd=top>bot?GCD(top,bot):GCD(bot,top);//没有if
        System.out.println(gcd);
        System.out.println(top/gcd+"/"+bot/gcd);

    }
}