package speex;

public class EchoCanceller {

    static {
        System.loadLibrary("speex");
    }

    public native int open(int sampleRate, int bufSize, int totalSize);

    public native short[] process(short[] input_frame, short[] echo_frame);

    public native short[] capture(short[] input_frame);

    public native short[] playback(short[] echo_frame);

    public native void close();
}