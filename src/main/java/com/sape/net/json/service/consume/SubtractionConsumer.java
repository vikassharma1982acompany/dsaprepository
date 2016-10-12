package com.sape.net.json.service.consume;

import com.sape.net.json.service.ISubtraction;
import com.sape.net.json.service.SubtractionImplService;

public class SubtractionConsumer {

	public static void main(String[] args) {
		SubtractionImplService service = new SubtractionImplService();
		ISubtraction operation = service.getSubtractionImplPort();
		System.out.println(operation.subtract(7, 5));

	}

}
