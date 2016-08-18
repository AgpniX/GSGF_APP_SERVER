package com.ebring.gsgfAppServer.utils.normal;

import java.util.Random;
import java.util.UUID;

public class GenerateID {
  public static String  getId(int length){
	  String id = UUID.randomUUID().toString();
		String[] ids = id.split("-");
		String result = "";
		for (String s:ids) {
          result+=s;
		}
		char[] c = new char[length];
		Random ran = new Random();
		int i;
		for (int j = 0; j < length; j++) {
			i = ran.nextInt(result.length());
			c[j] = result.charAt(i);
		}
		return new String(c);
	}
  }
