package com.be.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {
   public static Date format(String dd){
	 try {
		return  new SimpleDateFormat("yyyy-MM-dd").parse(dd);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	 return null;
   }
   public static String format(Date dd) {
		return new SimpleDateFormat("yyyy-MM-dd").format(dd);
	}
}
