/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q7
 * Author:   pengzijun
 * Date:     2020/2/3 7:36 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2017;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/3
 * @since 1.0.0
 */
public class Q7 {

    static int pos = 0;//当前的位置
    static int len;//字符串长度
    static char[] chars;//字符数组

    static int dfs() {
        int max = 0;
        int cur = 0;
        while (pos < len) {
            if (chars[pos] == '(') {
                //进入下一层搜索
                pos++;
                cur += dfs();
            } else if (chars[pos] == '|') {
                pos++;
                //选出较大的一部分
                if (cur > max) {
                    max = cur;
                }
                cur = 0;//cur归零

            } else if (chars[pos] == ')') {
                //一组匹配结束，退出遍历
                pos++;
                break;
            } else {
                //x 直接加一
                pos++;
                cur++;

            }
        }
        if (cur > max) {
            max = cur;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        chars = s.next().toCharArray();
        len = chars.length;
        System.out.println(dfs());
    }
}