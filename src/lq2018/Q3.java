/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q3
 * Author:   pengzijun
 * Date:     2020/2/9 4:42 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2018;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/9
 * @since 1.0.0
 */
public class Q3 {
    public static void main(String[] args) throws FileNotFoundException {

        PrintStream ps=new PrintStream(new FileOutputStream("work.txt"));
        System.setOut(ps);  //文件输出
        BigInteger shi=new BigInteger("2");
        BigInteger xu=new BigInteger("3");
        for (int i = 0; i < 123456; i++) {
            BigInteger shi_t=shi.multiply(new BigInteger("2")).subtract(xu.multiply(new BigInteger("3")));
           BigInteger  xu_t=shi.multiply(new BigInteger("3")).add(xu.multiply(new BigInteger("2")));
           shi=shi_t;
          xu= xu_t;

        }
        if(xu.compareTo(new BigInteger("0"))==1){
            System.out.println(shi+"+"+xu+"i");
        }
        else{
            System.out.println(shi+"-"+xu.abs()+"i");
        }
    }
}

//        BigInteger a=new BigInteger("2");
//        BigInteger b=new BigInteger("3");
//        for(int i=0;i<123456;i++){
//            BigInteger shi=a.multiply(new BigInteger("2")).subtract(b.multiply(new BigInteger("3")));
//            BigInteger xu=a.multiply(new BigInteger("3")).add(b.multiply(new BigInteger("2")));
//            a=shi;
//            b=xu;
//        }
//        //
//
//
//
//
//    }
