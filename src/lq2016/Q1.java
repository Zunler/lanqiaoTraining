/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q
 * Author:   pengzijun
 * Date:     2020/1/29 8:44 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2016;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/29
 * @since 1.0.0
 */
public class Q1 {
    public static void main(String[] args) {
        int sum=0;
        int gap=1;
        int num=0;
        for (int i = 0; i < 100; i++) {
            sum+=num+gap;
            num+=gap;
            gap++;

        }
        System.out.println(sum);
    }
}