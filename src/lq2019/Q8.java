/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q10
 * Author:   pengzijun
 * Date:     2020/2/15 11:02 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2019;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/15
 * @since 1.0.0
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int[] nums=new int[n+1];
        for (int i = 0; i <n ; i++) {
            int temp=s.nextInt();
            while(nums[temp]!=0){
                temp++;
            }
            nums[temp]++;
            System.out.print(temp+" ");


        }

    }
}