/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: Q1
 * Author:   pengzijun
 * Date:     2020/2/14 3:44 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2019;

import java.math.BigInteger;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author pengzijun
 * @create 2020/2/14
 * @since 1.0.0
 */
public class Q1 {
    public  static  boolean hasChar(String s){
        char[] chars=s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]=='2'||chars[i]=='0'||chars[i]=='1'||chars[i]=='9'){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        BigInteger res=new BigInteger("0");
        for (int i = 1; i <= 2019; i++) {
            String s=String.valueOf(i);
            if(hasChar(s)){
                BigInteger temp=new BigInteger(s);
                res=res.add(temp.multiply(temp));


            }

        }
        System.out.println(res);
    }
}