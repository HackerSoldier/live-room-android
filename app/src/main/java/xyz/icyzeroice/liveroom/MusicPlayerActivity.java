package xyz.icyzeroice.liveroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * MusicPlayerActivity:
 *   <GestureDetector> -- Left Scroll --> .CharRoomActivity
 */
public class MusicPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
    }
}
