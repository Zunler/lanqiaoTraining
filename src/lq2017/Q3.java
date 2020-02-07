/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q3
 * Author:   pengzijun
 * Date:     2020/2/2 7:40 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2017;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/2
 * @since 1.0.0
 */
public class Q3 {
    static  int[][] mat=new int[6][6];
    static int ans=0;
    static boolean[][] vis=new boolean[6][6];
    static  public boolean check(int[][]  m){
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <6 ; j++) {
                if(m[i][j]==m[5-i][5-j]){
                    return false;
                }

            }

        }
        return true;
    }
    public static  void dfs(int cur){
        if(cur==18){

            if(check(mat)){
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        System.out.print(mat[i][j] + " ");

                    }
                    System.out.println();

                }
                System.out.println();
                ans++;
                return;
            }

            return;
        }
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <6 ; j++) {
                if(!vis[i][j]){
                    vis[i][j]=true;
                    mat[i][j]=1;
                    dfs(cur+1);
                    vis[i][j]=false;
                    mat[i][j]=0;

                }

            }

        }
    }

    public static void main(String[] args) {
        dfs(0);
        System.out.println(ans);

    }

}