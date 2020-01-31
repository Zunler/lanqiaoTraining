/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q2
 * Author:   pengzijun
 * Date:     2020/1/29 8:53 下午
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
public class Q2 {

    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            for (int j = 50; j >=0 ; j--) {
                if((i+j)*(j-i+1)/2==236){
                    System.out.println(i+","+j);
                }

            }

        }
    }
}