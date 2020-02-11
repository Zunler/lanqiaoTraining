/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q4
 * Author:   pengzijun
 * Date:     2020/2/9 7:43 下午
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
public class Q4 {
    public static void main(String[] args) {
        int ans=0;
        int r=50000;
        for (int i = 1; i <r ; i++) {
            for (int j = 1; j <r; j++) {
                if((i*i+j*j)<=r*r){
                    ans++;
                }
            }
        }
        System.out.println(ans*4);

    }
}