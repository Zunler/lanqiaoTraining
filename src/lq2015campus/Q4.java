/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q4
 * Author:   pengzijun
 * Date:     2020/1/25 8:02 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015campus;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/25
 * @since 1.0.0
 */
public class Q4 {
//    public static void main(String[] args) {
//        int[] nums = {7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0};
//
//        int[] num = {1, 2, 3, 5, 6};
//        boolean[] vis=new boolean[5];
//        for (int i = 2; i <14/ 2; i++) {
//            for (int j = 0; j <5 ; j++) {
//                if(!vis[j]&&nums[i]==0&&nums[i+num[j]+1]==0){
//                    nums[i]=num[j];
//                    nums[i+num[j]+1]=num[j];
//                    vis[j]=true;
//                }
//
//            }
//        }
//        for (int i = 0; i <14 ; i++) {
//            System.out.print(nums[i]+" ");
//        }


    static int[] a = new int[]{0, 7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0};

    public static  void dfs(int index){
        //跳过第四位
        if(index==4) {
            index++;
        }
        if(index==7){
            //当搜索到7时将结果打印
            for (int i = 1; i <15 ; i++) {
                System.out.print(a[i]+" ");

            }
        }
        for (int i = 3; i <15 ; i++) {
            if(i+index+1<=14&&a[i]==0&&a[i+index+1]==0){
                a[i]=index;
                a[i+index+1]=index;
                dfs(index+1);
                a[i]=0;
                a[i+index+1]=0;
                //回溯
            }

        }
    }
    public static void main(String[] args) {
       // getResult(1);//从数字1开始
        dfs(1);
    }

    /**
     * @param index 数1-7
     */
    public static void getResult(int index) {
        if (index == 4) {
            //跳过数字4
            index++;
        }
        if (index >= 7) {
            //此时说明1-7数字都被取完,输出答案即可
            for (int i = 1; i < a.length; i++) {
                System.out.print(a[i]);
            }
        }
        //i--->位数
        for (int i = 3; i < 14; i++) {
            if ((i + index + 1) <= 14 && a[i] == 0 && a[i + index + 1] == 0) {
                a[i] = a[i + index + 1] = index;
                getResult(index + 1);
                //------------------------------
                //执行到这一步说明此时的数字index不适合于位置i,撤回赋值
                a[i] = a[i + index + 1] = 0;
                //确实是dfs，怎么就写不出来呢？
            }
        }
    }

}
