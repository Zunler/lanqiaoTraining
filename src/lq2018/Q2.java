/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q2
 * Author:   pengzijun
 * Date:     2020/2/9 4:30 下午
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
public class Q2 {
    public static void main(String[] args){
        int day_sum=0;
        for (int i = 1901; i <=2000 ; i++) {
            if((i%400==0)||(i%4==0&&i%100!=0)){
                //leapYear
                day_sum+=366;
            }
            else{
                day_sum+=365;
            }

        }
        System.out.println(day_sum/7);
    }

}