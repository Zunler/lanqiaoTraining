/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201508
 * Author:   pengzijun
 * Date:     2020/1/17 9:34 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/17
 * @since 1.0.0
 */
public class q201508 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int w=s.nextInt();
        int m=s.nextInt();
        int n=s.nextInt();
        int x_m;
        int x_n;
        int y_n=n%w==0?n/w-1:n/w;
        int y_m=m%w==0?m/w-1:m/w;
        if((y_m)%2==0){
            //偶数行
            x_m=m%w-1;
        }
        else{
            x_m=w-m%w;
        }
        if((y_n)%2==0){
            //偶数行
            x_n=n%w-1;
        }
        else{
            x_n=w-n%w;
        }
        System.out.println(Math.abs(x_m-x_n)+Math.abs(y_m-y_n));

    }
}
