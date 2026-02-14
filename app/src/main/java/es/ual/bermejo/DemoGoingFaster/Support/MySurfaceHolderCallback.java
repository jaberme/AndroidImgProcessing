package es.uma.asenjo.DemoGoingFaster.Support;

import android.view.SurfaceHolder;

/**
 * Created by berme on 16/11/2016.
 */

public class MySurfaceHolderCallback implements SurfaceHolder.Callback {
    public boolean surfaceready;

    public MySurfaceHolderCallback (){
        surfaceready = false;
    }

    public void surfaceCreated(SurfaceHolder holder) {
        // The Surface has been created, acquire the camera and tell it where
        // to draw.
        surfaceready = true;
    }

    public void surfaceDestroyed(SurfaceHolder holder) {
        // Surface will be destroyed when we return, so stop the preview.
        // Because the CameraDevice object is not a shared resource, it's very
        // important to release it when the activity is paused.
        surfaceready = false;
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h) {
        // Now that the size is known, set up the camera parameters and begin
        // the preview.
    }
}