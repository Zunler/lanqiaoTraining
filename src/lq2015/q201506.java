/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201506
 * Author:   pengzijun
 * Date:     2020/1/17 11:10 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/17
 * @since 1.0.0
 */

public class q201506 {
    static int[] num = new int[50];
    static int[] oper = new int[50];
    static int count = 0;

    public static boolean check() {
        int sum = 0;
        for (int i = 1; i < 50; i++) {


        }
        for (int i = 1; i < 50; i++) {
            System.out.print(oper[i]);
        }
        System.out.println();
        System.out.println(sum);
        if (sum != 2015) {
            return false;
        } else {
            return true;
        }


    }

    public static void dfs(int flag) {
        if (flag == 49 || count == 2) {
//            if (check()) {
//                System.out.println(oper[0]);
//                return;
//            }
            int sum = 0;
            int[] op=new int[2];
            int index=0;
            for (int i = 1; i < 50; i++) {
                if (oper[i] == 1) {
                    op[index] = i;
                    index++;
                }
            }
            sum+=op[0]*(op[0]+1)+op[1]*(op[1]+1);
            for (int i = 1; i <50 ; i++) {
                if(i!=op[0]&&i!=op[1]&&i!=op[0]+1&&i!=op[1]+1){
                    sum+=i;
                }

            }
            //System.out.println(sum);
            if (sum == 2015) {
                System.out.println(op[0]);
            }
            return;
        }

        for (int i = 1; i < 50; i++) {
            if (oper[i] == 0 && oper[i - 1] != 1) {
                oper[i] = 1;
                count++;
                dfs(i + 1);
                count--;
                oper[i] = 0;
            }

        }

    }

    public static void main(String[] args) {
        dfs(1);
    }
}