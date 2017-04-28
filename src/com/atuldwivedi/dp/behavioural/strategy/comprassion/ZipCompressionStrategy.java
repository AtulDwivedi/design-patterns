package com.atuldwivedi.dp.behavioural.strategy.comprassion;

import java.io.File;

public class ZipCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFile(String file) {
		System.out.println("Compressing "+file+" as ZIP.");
	}
}
