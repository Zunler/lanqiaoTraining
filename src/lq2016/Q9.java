/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q9
 * Author:   pengzijun
 * Date:     2020/1/30 4:18 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2016;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/30
 * @since 1.0.0
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] nums = new int[num+1];
        int ans = 0;
        for (int i = 1; i < num+1; i++) {
            nums[i] = s.nextInt();

        }
        for (int i = 1; i < num+1; i++) {
            if(nums[i]!=i){
                nums[nums[i]]=nums[i];
                nums[i]=i;
                ans++;
            }

        }
        System.out.println(ans);
    }
}