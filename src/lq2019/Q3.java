/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q3
 * Author:   pengzijun
 * Date:     2020/2/15 4:24 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/15
 * @since 1.0.0
 */

    /**
     * 1.编程https://www.cnblogs.com/woxiaosade/p/10592061.html
     * 2.观察https://www.cnblogs.com/yzm10/p/10595165.html
     *
     * @description TODO
     * @author frontier
     * @time 2019年4月9日 上午11:19:05
     *
     */
    class Node {
        int step;
        String path;
        int x, y;

        public Node(int step, String path, int x, int y) {
            super();
            //步数
            this.step = step;
            //路径
            this.path = path;
            this.x = x;
            this.y = y;
        }
    }

    public class Q3 {
        static Scanner in = new Scanner(System.in);
        static int n, m;
        static char[][] maze = new char[60][60];
        static boolean[][] vis = new boolean[60][60];
        //增量数组，方向向量，直接按字典序排列
        static int[] X = { 1, 0, 0, -1 };
        static int[] Y = { 0, -1, 1, 0 };
        static String[] d = { "D", "L", "R", "U" };

        public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner(new File("/Users/pengzijun/Desktop/lanqiaoTraining/src/lq2019/maze.txt"));
            n = 30;
            m =50;
            //存入矩阵
            for (int i = 1; i <= n; ++i) {
                String temp = in.next();
                for (int j = 1; j <= m; ++j) {
                    maze[i][j] = temp.charAt(j - 1);
                }
            }
            bfs();
        }

        static boolean check(int x, int y) {
            if (x < 1 || x > n || y < 1 || y > m)
                //不在范围内
                return false;
            if (vis[x][y] || maze[x][y] == '1')
                //已经访问过或者是墙
                return false;
            return true;
        }

        static void bfs() {
            Queue<Node> q = new LinkedList<Node>();
            //offer 与add在有限制的队列添加元素不抛出异常，而是返回false
            q.offer(new Node(0, "", 1, 1));
            while (!q.isEmpty()) {
                //头节点
                Node top = q.poll();
                //设置为已经访问
                vis[top.x][top.y] = true;
                if (top.x == n && top.y == m) {
                    //走到边界节点
                    System.out.println(top.step + " " + top.path);
                    return;
                }
                for (int i = 0; i < 4; ++i) {
                    int newX = top.x + X[i];
                    int newY = top.y + Y[i];
                    if (check(newX, newY)) {
                        //把可以走的邻近节点都加进去
                        Node temp = new Node(top.step + 1, top.path + d[i], newX, newY);
                        q.offer(temp);
                    }
                }
            }
        }

}