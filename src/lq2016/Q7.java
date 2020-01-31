/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q7
 * Author:   pengzijun
 * Date:     2020/1/30 12:05 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2016;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/30
 * @since 1.0.0
 */
public class Q7 {
    static int[] nums = new int[6];
    static boolean[] vis = new boolean[12];
    static int ans = 0;
    public static  boolean check(boolean[] v){
        for (int i = 1; i <6 ; i++) {
            if(nums[i]>=1&&nums[i]<=4){
                // //第一层
                if(nums[i]%4==0){
                    //右
                    if(!v[nums[i]-2]&&!v[nums[i]+3]){
                        return  false;
                    }
                }
                else if(nums[i]%4==1){
                    //左
                    if(!v[nums[i]]&&!v[nums[i]+3]){
                        return  false;
                    }
                }
                else{
                    //中
                    if(!v[nums[i]-2]&&!v[nums[i]+3]&&!v[nums[i]]){
                        return  false;
                    }
                }
            }
            else if(nums[i]>=5&&nums[i]<=8){
                //第二层
                if(nums[i]%4==0){
                    //右
                    if(!v[nums[i]-2]&&!v[nums[i]+3]&&!v[nums[i]-5]){
                        return  false;
                    }
                }
                else if(nums[i]%4==1){
                    //左
                    if(!v[nums[i]]&&!v[nums[i]+3]&&!v[nums[i]-5]){
                        return  false;
                    }
                }
                else{
                    //中
                    if(!v[nums[i]-2]&&!v[nums[i]+3]&&!v[nums[i]]&&!v[nums[i]-5]){
                        return  false;
                    }
                }
            }

            else{
                if(nums[i]%4==0){
                    //右
                    if(!v[nums[i]-2]&&!v[nums[i]-5]){
                        return  false;
                    }
                }
                else if(nums[i]%4==1){
                    //左
                    if(!v[nums[i]]&&!v[nums[i]-5]){
                        return  false;
                    }
                }
                else{
                    //中
                    if(!v[nums[i]-2]&&!v[nums[i]-5]&&!v[nums[i]]){
                        return  false;
                    }
                }
            }
        }

    return true;

    }

    public static void dfs(int cur) {

        if (cur ==6 ) {
            if(check(vis)){
                ans++;
                for (int i =1; i < 6; i++) {
                    System.out.print(nums[i]+" ");

                }
                System.out.println();
                return;
            }

           return;
        }
        for (int i = 0; i < 12; i++) {
            if (nums[cur] == 0 && !vis[i]) {
                nums[cur] = i + 1;
                vis[i] = true;
                if(nums[cur]>nums[cur-1]){
                    dfs(cur + 1);
                }

                nums[cur] = 0;
                vis[i] = false;
            }

        }

    }


    public static void main(String[] args) {
        dfs(1);
        System.out.println(ans);
    }
}