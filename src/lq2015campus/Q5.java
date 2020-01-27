/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q5
 * Author:   pengzijun
 * Date:     2020/1/19 5:07 下午
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
 * @create 2020/1/19
 * @since 1.0.0
 */
public class Q5 {
    public static void main(String[] args) {
        int count = 0;
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
//        for (int i = 0; i <a; i++) {
//            for (int j = 1; j <i ; j++) {
//                if(i*i+j*j==a*a){
//                    System.out.println(i+" "+j);
//                    count++;
//                }
//
//            }
//
//        }
//        System.out.println(count);
        for (int i = 1; i <a ; i++) {
            int j= (int) Math.sqrt(a*a-i*i);
            if(j*j==a*a-i*i){
                count++;
            }
        }
        System.out.println(count/2);

    }
}