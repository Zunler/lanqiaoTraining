/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q6
 * Author:   pengzijun
 * Date:     2020/2/14 7:35 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2019;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/14
 * @since 1.0.0
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }
        //最大权值和
        BigInteger max = new BigInteger("0");
        //当前权值和
        BigInteger cur = new BigInteger("0");
        //深度
        int depth= 1;
        int index = 0;
        for (int i = 1; i <= n; i++) {
            cur = cur.add(new BigInteger(String.valueOf(nums[i - 1])));
            if (i == Math.pow(2, depth) - 1) {
                //当前节点为本层最后一个
                if (cur.compareTo(max) == 1) {
                    //当前层权值和大于最大值
                    max = cur;
                    index = depth;

                }
                //当前层权值归零，计算下层
                cur = new BigInteger("0");
                //层数加一
                depth++;

            }


        }
        System.out.println(index);


    }
}