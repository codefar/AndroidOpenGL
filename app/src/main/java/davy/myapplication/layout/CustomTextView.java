package davy.myapplication.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

/**
 * author: wangyonghua
 * version: V1.0
 * date: 2017/12/7
 * time: 15:06
 */

public class CustomTextView extends TextView {

    public static final String TAG = "CustomTextView";

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Log.d("TAG", TAG + "-" + ":onMeasure" + getMeasuredHeight() + " " + getMeasuredWidth());
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("TAG", TAG + "-" + ":onDraw");
        super.onDraw(canvas);
    }
}
