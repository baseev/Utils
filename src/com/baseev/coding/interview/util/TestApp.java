package com.baseev.coding.interview.util;
/**
 * Copyright (C) 2009-2010 LeadFormix, Inc. All Rights Reserved.
 * LeadFormix PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @link http://www.leadformix.com
 *
 * For further information, contact:
 * mailto:support@leadformix.com or mailto:cs@leadformix.com
 */


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestApp
{
    public static void main(String args[])
    {
        Calendar c = new GregorianCalendar();
        c.setTime(new Date());
        Date yourDate =  c.getTime();
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(yourDate);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("dayOfWeek : "+Calendar.SATURDAY);
    }
}
