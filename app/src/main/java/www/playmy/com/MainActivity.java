 package www.playmy.com;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void play(View view)
    {
        if(mediaPlayer == null){
            Context context;
            mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.song);
            mediaPlayer.start();
        }else{
            mediaPlayer.start();
           // Toast.makeText(MainActivity.this, "Not available a song" , Toast.LENGTH_SHORT).show();
        }

    }
     public void pause(View view)
     {
         if (mediaPlayer != null)
         {
             mediaPlayer.pause();
         }

     }
     public void stop(View view)
     {
         mediaPlayer.release();
         mediaPlayer = null;

     }
}