package com.example.coreJava;

import java.net.InetAddress;

public class GetIPAddress {

	public static void main(String[] args) throws Exception {
		InetAddress myIP = InetAddress.getLocalHost();
		System.out.println("my IP address :");
		System.out.println(myIP.getHostAddress());

	}

}
