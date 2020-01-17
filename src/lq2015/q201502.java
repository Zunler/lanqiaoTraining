/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: q201502
 * Author:   pengzijun
 * Date:     2020/1/16 11:03 上午
 * Description: \
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package lq2015;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈\〉
 *
 * @author pengzijun
 * @create 2020/1/16
 * @since 1.0.0
 */
public class q201502 {
    public static void main(String[] args) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        String curDatetime = "2014-11-09";

        Date date = formatter.parse(curDatetime);

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        calendar.add(Calendar.DATE,1000);

        String datetime = formatter.format(calendar.getTime());
        System.out.println(datetime);
    }
}