/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201501
 * Author:   pengzijun
 * Date:     2020/1/16 10:53 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

/**
 * 〈一句话功能简述〉<br> 
 * 小熊吃桃
 *
 * @author pengzijun
 * @create 2020/1/16
 * @since 1.0.0
 */
public class q201501 {
    public static void main(String[] args) {
        int num=1543;
        int count=0;
        while(num!=1){
            if(num%2==0){
                num=num/2;
            }
            else{
                num--;
                num=num/2;
                count++;
            }
        }
        System.out.println(count+1);
    }
}