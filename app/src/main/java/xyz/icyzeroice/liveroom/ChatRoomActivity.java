package xyz.icyzeroice.liveroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * ChatRoomActivity:
 *   <Toolbar>
 *   <RecyclerView>
 *   InputMessage<EditText>
 *   SubmitButton<Button>
 *   Toolbox
 *   <GestureDetector> -- Right Scroll --> .MusicPlayerActivity
 */
public class ChatRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_room);
    }
}
