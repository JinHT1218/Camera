package jeffrey.com.camera;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.unity3d.player.UnityPlayerNativeActivityPico;

public class MainActivity extends UnityPlayerNativeActivityPico {
    public static Activity unityActivity = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        unityActivity = this;
        //setContentView(R.layout.activity_main);
    }
    public void start(View view){
        Intent intent=new Intent( MediaStore.ACTION_IMAGE_CAPTURE );
        startActivity( intent );
    }
}
