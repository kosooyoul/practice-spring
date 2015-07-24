package kr.jungle.web.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {

	public static final String md5(String value) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			
		}
		
        md5.update(value.getBytes());
        byte[] md5Bytes = md5.digest();
 
        StringBuffer hexString = new StringBuffer();
    	for(int i = 0; i < md5Bytes.length; i++) {
    		String hex=Integer.toHexString(0xff & md5Bytes[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
    	
    	return hexString.toString();
	}
}
