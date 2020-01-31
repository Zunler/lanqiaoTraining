/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q10
 * Author:   pengzijun
 * Date:     2020/1/30 9:18 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2016;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/1/30
 * @since 1.0.0
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q10{

    public static int n;
    public static int[] flag,res;
    public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public static int cnt(int l,int r){
        int sum = 0;
        for(int i=l;i<r;i++){
            if(flag[i]==1) sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            n = in.nextInt();
            flag = new int[n+10];
            res = new int[n+10];
            Arrays.fill(flag, 0);
            map.clear();
            int t,last=-1;
            for(int i=0;i<n;i++){
                //nums[i] = in.nextInt();
                t = in.nextInt();
                if(!map.containsKey(t)){
                    res[i] = -t;
                    map.put(t, i);
                    flag[i] = 1;
                }
                else{
                    last = map.get(t);
                    res[i] = cnt(last+1, i);
                    flag[last] = 0;
                    //map.remove(t);
                    map.put(t, i);
                    flag[i] = 1;
                }
            }
            for(int i=0;i<n;i++) System.out.print(res[i]+" ");
        }
    }

}
