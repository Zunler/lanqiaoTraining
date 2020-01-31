/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q8
 * Author:   pengzijun
 * Date:     2020/1/30 8:31 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2016;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/30
 * @since 1.0.0
 */
public class Q8 {
    static int[] arr;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        arr=new int[3];
        for(int i=0;i<3;i++) {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<5;i++) {
            int num=in.nextInt();
            //输入一个球处理一次
            char res=f(num,0,0);
            System.out.print(res+" ");
        }
        System.out.println();
    }
    /**
     *
     * @param num       球的总数
     * @param my		我获得球的总数
     * @param you		对手获得球的总数
     */
    public static char f(int num,int my,int you) {
        boolean flag=false;
        if(num<arr[0]) {
            //球的总数小于最小的可取球数，停止取球
            if(my%2==1&&you%2==0) {
                //win
                return '+';
            } else if(my%2==0&&you%2==1) {
                //lose
                return '-';
            } else {
                //draw
                return '0';
            }
        }
        for(int i=0;i<3;i++) {
            if(num>=arr[i]) {
                //这个解法没有涉及最聪明的解法，但是答案好想还是对的
                //只是对手取球，对手取从0开始，其实就是交换位置，不断交换，不断取
                char res=f(num-arr[i],you,my+arr[i]);//对手的情况
                //如果对手输了，说明我赢了
                if(res=='-') {
                    return '+';
                }
                //对手不赢有两种情况，平局，或者输
                if(res=='0') {
                    flag=true;
                }
            }
        }
        //能走到这一步，说明对手不输，只剩下两种情况，分别return即可
        if(flag) {
            return '0';
        }
        return '-';
    }
}