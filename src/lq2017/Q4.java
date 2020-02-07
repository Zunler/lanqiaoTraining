/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q4
 * Author:   pengzijun
 * Date:     2020/2/3 10:01 上午
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
 * @create 2020/2/3
 * @since 1.0.0
 */
public class Q4 {
   static int[][]   dir ={ {0,1} ,{0,-1},{-1,0},{1,0}};//方向 下，上，左，右
   static  boolean[][]   vis=new boolean[7][7];//把方格看成带点 即7x7
   static int   sum ;
   static void  dfs( int x ,int y ){

        if( x == 0 || x == 6 || y==0 || y ==6 ){
            //在边界
            sum++;
            return ;
        }

        for( int i=0;i<=3;i++   ){
            //依次遍历下一个方向
            int xx = x+dir[i][0];
            int yy = y+dir[i][1];
            if( xx >=0 && x<=6 && yy>=0 && yy <=6 && !vis[xx][yy]){
                //在范围内,且未访问过
                    vis[xx][yy] =true;
                    vis[6-xx][6-yy] =true;//对称点
                    dfs(xx,yy);
                    vis[xx][yy] =false;
                    vis[6-xx][6-yy] =false;

            }
        }

    }

    public static void main(String[] args) {
        vis[3][3] =true;
        dfs(3,3);//从中心对称点，像四周搜索
        int ans = sum/4;
        System.out.println(ans);
    }


    }
