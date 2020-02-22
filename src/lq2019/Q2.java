/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q2
 * Author:   pengzijun
 * Date:     2020/2/14 4:02 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2019;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/14
 * @since 1.0.0
 */
public class Q2 {
    public static  int fib(int flag,int one, int two ,int three){
        if(flag==1){
            return one;
        }
        else if(flag==2){
            return two;
        }
        else if( flag==3){
            return three;
        }
        else {
            return fib(flag-1,two%10000,three%10000,(one+two+three)%10000);
        }

    }

    public static void main(String[] args) {
       // System.out.println(fib(201903,1,1,1));
        int one=1;
        int two=1;
        int three=1;
        int res=0;

        for (int i = 3; i <20190324 ; i++) {
            res=(one+two+three)%10000;
            one=two%10000;
            two=three%10000;
            three=res;


        }
        System.out.println(res);
    }

}