package com.cfn;

public class AudioPlayer implements MediaPlayer {

	@Override
	public void playFIle(String filename, String type) {
		if (type.equals("mp3"))
			System.out.println("Audio Player is now palying "+filename);
		else if (type.equals("mp4"))
		{
			MediaAdapter ma= new MediaAdapter();
			ma.playFIle(filename, type);
		}
		else
			System.out.println("Sorry the file is not supported");
	}

}
