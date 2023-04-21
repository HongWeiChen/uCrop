package com.yalantis.ucrop.callback;

import android.graphics.RectF;
import android.view.MotionEvent;

/**
 * Created by Oleksii Shliama.
 */
public interface OverlayViewChangeListener {

    void onCropRectUpdated(RectF cropRect);

    void onTouchEvent(MotionEvent event);

}