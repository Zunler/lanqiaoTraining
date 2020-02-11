/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q5
 * Author:   pengzijun
 * Date:     2020/2/9 7:59 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2018;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/9
 * @since 1.0.0
 */
public class Q5 {

    static void show(byte[][] buf){
        for(int i=0; i<buf.length; i++){
            for(int j=0; j<buf[i].length; j++){
                System.out.print(buf[i][j]==0? ' ' : 'o');
            }
            System.out.println();
        }
    }

    static void draw(byte[][] buf, int x, int y, int size){
        if(size==1){
            buf[y][x] = 1;
            return;
        }

        int n = size/3;
        draw(buf, x, y, n);
        draw(buf, x-n, y ,n);
        draw(buf, x+n, y ,n);
        draw(buf, x, y-n ,n);
        draw(buf, x, y+n ,n);
    }

    public static void main(String[] args){
        final int N = 3;
        int t = 1;
        for(int i=0; i<N; i++) {
            t *= 3;
        }

        byte[][] buf = new byte[t][t];
        draw(buf, t/2, t/2, t);
        show(buf);
    }
}