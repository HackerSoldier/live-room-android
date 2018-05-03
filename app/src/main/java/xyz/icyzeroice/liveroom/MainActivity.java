package xyz.icyzeroice.liveroom;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;

/**
 * MainActivity:
 *
 *   <Toolbar>
 *   UserInfo
 *     - Gavator (Temporary)
 *     - Nickname
 *   <DrawerLayout>
 *     - JoinIn/CreateRoom
 *       - <AlertDialog>
 *         - RoomId
 *         - RoomPassword
 *         - JoinIn/CreateRoom
 *     - ChatRoom1 --> .ChatRoomActivity
 *     - ChatRoom2
 *     - ...
 *     - ChatRoomN
 *     - MemoryHall
 *     - Setting (Temporary)
 *     - AboutUs
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
}
