package com.cfn;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void play(String filename) {
		System.out.println("MP4 Player is now playing "+filename);
	}

}
