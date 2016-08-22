package Adapter;

/**
 * Description: VlcPlayer
 * Author: silence
 * Update: silence(2016-07-29 22:44)
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
