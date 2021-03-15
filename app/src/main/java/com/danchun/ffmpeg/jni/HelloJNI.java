package com.danchun.ffmpeg.jni;

/**
 * @author 19125
 * @version V1.0
 * @Package com.danchun.ffmpeg.jni
 * @date 2021/3/10 23:55
 */
public class HelloJNI {

    static {
        System.loadLibrary("learn-ffmpeg");
    }

    public static String GetFFmpegVersion() {
        return native_GetFFmpegVersion();
    }

    public static native String helloJNI();

    public static native String native_GetFFmpegVersion();
}