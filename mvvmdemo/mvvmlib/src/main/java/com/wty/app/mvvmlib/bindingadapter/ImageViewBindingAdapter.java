package com.wty.app.mvvmlib.bindingadapter;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.support.annotation.DrawableRes;
import android.widget.ImageView;

import com.wty.app.mvvmlib.command.ReplyCommand;

/**
 * @author wty
 * Imageview 常用事件
 */
public final class ImageViewBindingAdapter {

    @BindingAdapter(value = {"uri", "placeholderImageRes", "request_width", "request_height", "onSuccessCommand", "onFailureCommand"}, requireAll = false)
    public static void loadImage(final ImageView imageView, String uri,
                                 @DrawableRes int placeholderImageRes,
                                 int width, int height,
                                 final ReplyCommand<Bitmap> onSuccessCommand,
                                 final ReplyCommand<Bitmap> onFailureCommand) {
        imageView.setImageResource(placeholderImageRes);
    }

}

