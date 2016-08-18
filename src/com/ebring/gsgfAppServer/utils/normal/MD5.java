package com.ebring.gsgfAppServer.utils.normal;
import java.io.UnsupportedEncodingException;

import org.springframework.util.DigestUtils;
public class MD5 {
	 /**
     * MD5加密
     * @return String
     */
    public static String MD5OfLength36(String message) {
    	String md5;
		try {
			byte[] byte_arrary = message.getBytes("utf-8");
			md5 = DigestUtils.md5DigestAsHex(byte_arrary);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
		return md5;
    }
    
}
