package xyz.icyzeroice.liveroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * MemoryHallActivity:
 *   <RecyclerView> --> .RecordRoomActivity
 *         |
 *         +-- Right Scroll --> DeleteRecord
 */
public class MemoryHallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory_hall);
    }
}
