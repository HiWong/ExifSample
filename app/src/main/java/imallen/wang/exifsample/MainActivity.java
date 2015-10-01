package imallen.wang.exifsample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=(TextView)findViewById(R.id.textView);
        //String imageInfo=BitmapUtils.getExifInfo("sdcard/DCIM/Camera/party.jpg");
        //String imageInfo=BitmapUtils.getExifInfo("sdcard/DCIM/Camera/now.jpg");
        //String imageInfo=BitmapUtils.getExifInfo("sdcard/DCIM/Camera/office.jpg");
        //String imagePath=this.getFilesDir()+"/tencent/MicroMsg/WeiXin/office.jpg";
        //String imageInfo=BitmapUtils.getExifInfo(imagePath);

        //String imageInfo=BitmapUtils.getExifInfo("/storage/emulated/0/DCIM/Camera/IMG_20150915_000841.jpg");
        String imageInfo=BitmapUtils.getExifInfo("/storage/emulated/0/DCIM/Camera/IMG_1.JPG");
        textView.setText(imageInfo);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
