package com.atuldwivedi.dp.behavioural.strategy.comprassion;

public class Client {
	public static void main(String[] args) {
		CompressionContext compressionContext = new CompressionContext(new ZipCompressionStrategy());
		compressionContext.compressFile("Myfile.txt");
	}
}
