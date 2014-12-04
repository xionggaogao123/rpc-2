package org.skyim.snrpc.util;
/**
 * @author skyim E-mail:wxh64788665@gmail.com
 * @version 创建时间：2014年12月4日 上午11:47:25
 * 类说明
 */
public class Sequence {

	private final static Object locker = new Object();
	private static int sequence = 1000;
	
	public static int next() {
		// TODO Auto-generated method stub
		synchronized (locker) {
			sequence++;
			if(sequence < 0){
				sequence = 1;
			}
			return sequence;
		}
	}

}
