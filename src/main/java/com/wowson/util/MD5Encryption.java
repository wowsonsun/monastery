package com.wowson.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * 利用java 自带Md5 加密
 * @author wowson
 *
 */
public class MD5Encryption {
	public static String setEncryption(String encryption){
		String resultEncryption ="";
		if(StrUtil.isEmpty(encryption)){
			try {
				//  指定加密的方式为MD5
				MessageDigest md = MessageDigest.getInstance("MD5");
				 // 进行加密运算
				byte tempByte[] = md.digest(encryption.getBytes());
				for (int i=0;i<tempByte.length; i++){
					// 将整数转换成十六进制形式的字符串 这里与0xff进行与运算的原因是保证转换结果为32位
					String str = Integer.toHexString(tempByte[i] & 0xFF);
					if(str.length()==1){
						str += "F";
					}
					resultEncryption +=str;
				}
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultEncryption;
	}
	public static void main(String[] args) {
		String str="202020";
		String str1="dfsdlkf谁都没法过了考试的";
		System.out.println(str+"  MD5加密摘要："+setEncryption(str));
		System.out.println(str1+"  MD5加密摘要："+setEncryption(str1));
	}
}
