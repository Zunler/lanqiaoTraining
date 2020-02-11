/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q10
 * Author:   pengzijun
 * Date:     2020/2/10 10:40 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/10
 * @since 1.0.0
 */
public class Q10<payment> {

    public static void StandardDeviation(double[] pay) {
        double sum = 0;
        double avg = 0;
        double n = pay.length;
        for (int i = 0; i < n; i++) {
            sum += pay[i];
        }
        avg = sum / n;
        double t = 0;
        for (int i = 0; i < n; i++) {
            double p = (pay[i] - avg) * (pay[i] - avg);
            t += p;
        }
        System.out.printf("%.4f", Math.sqrt(t / n));

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n;
        double S;
        n = in.nextInt();
        //当前需要缴纳的总费用
        S = in.nextDouble();
        int a[] = new int[n];
        double avg = (double) S / n;
        double original_avg = avg;
        //存(bi-avg)*(bi-avg)
        double tmp = 0;
        //当前还剩多少人未付钱
        int left_person = n;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        //先对每个人带的钱从小到大排序

        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        //贪心算法，如果当前这个人付不起avg,他的钱全部交出去，更新avg
        for (int i = 0; i < n; i++) {//付不起,则将自己的a[i]全部上交
            if (a[i] < avg) {
                tmp += (a[i] - original_avg) * (a[i] - original_avg);
                S -= a[i];
                left_person--;
                avg = (double) S / left_person;
            } else {
                //剩下的人都能交得起
                tmp += (n - i) * (avg - original_avg) * (avg - original_avg);
                break;
            }
        }
        System.out.printf("%.4f", Math.sqrt(tmp / n));
    }


//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        //人数
//        int n = s.nextInt();
//        //总金额
//        int S = s.nextInt();
//        int[] money = new int[n];
//
//        double avg = 0;
//        double sum = 0;
//        //每人付的款
//        double[] payment = new double[n];
//        //已付款
//        double pay = 0;
//        for (int i = 0; i < n; i++) {
//            money[i] = s.nextInt();
//            sum += money[i];
//
//        }
//        avg = sum / n;
//        double sum_t = sum;
//        double diff = 10e-9;
//        Arrays.sort(money);
//        for (int m :
//                money) {
//            System.out.println(m);
//        }
//        for (int index = 0; index < n; index++) {
//
//            if (money[index] > avg) {
//                pay += avg;
//                payment[index] = avg;
//                sum -= avg;
//            } else {
//                pay += money[index];
//                payment[index] = money[index];
//                sum -= money[index];
//                avg = (sum_t - pay) / (n - 1 - index);
//            }
//        }
//
//
//        StandardDeviation(payment);
//        for (double m :
//                payment) {
//            System.out.println(m);
//        }
//
//    }
}
