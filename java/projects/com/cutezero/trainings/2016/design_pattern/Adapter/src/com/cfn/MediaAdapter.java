package com.cfn;

public class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer amp;
	@Override
	public void playFIle(String filename, String type) {
		amp=new MP4Player();
		amp.play(filename);
	}

}
