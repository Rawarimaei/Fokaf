package Help;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.preference.PreferenceManager;

public class TinyDB {
    private SharedPreferences preferences;

    private String DEFAULT_APP_IMAGEDATA_DIRECTORY;

    private String lastImagePath = "";

    public <preferences> TinyDB(Context appContext) {

        preferences PreferenceManager.getDefaultSharedPreferences(appContext);

    }

    private void getDefaultSharedPreferences(Context appContext) {

    }

    /**
     * Decodes the Bitmap from 'path' and returns it
     * @param path image path
     * @return the Bitmap from 'path'
     */

    public Bitmap getImage(String path) {
        Bitmap bitmapFromPath = null;

        try {
            bitmapFromPath = BitmapFactory.decodeFile(path);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return bitmapFromPath;
    }

    /**
    *Returns the String path of the last saved inage
     * @return string path of the last saved image
     */

    public String getSavedImagePath() { return lastImagePath;}
}