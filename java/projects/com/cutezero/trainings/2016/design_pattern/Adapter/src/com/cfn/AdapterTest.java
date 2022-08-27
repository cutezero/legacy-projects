package com.cfn;

public class AdapterTest {

	public static void main(String[] args) {
		MediaPlayer mp=new AudioPlayer();
		mp.playFIle("Chennai Express", "mp3");
		mp.playFIle("Bailando", "mp4");
		mp.playFIle("Let me love you", "vob");
		
	}

}
