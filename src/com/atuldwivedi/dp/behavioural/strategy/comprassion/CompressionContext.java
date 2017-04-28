package com.atuldwivedi.dp.behavioural.strategy.comprassion;

public class CompressionContext {
	
	CompressionStrategy compressionStrategy;
	
	public CompressionContext(CompressionStrategy compressionStrategy){
		this.compressionStrategy = compressionStrategy;
	}
	
	public void compressFile(String file){
		compressionStrategy.compressFile(file);
	}
}
