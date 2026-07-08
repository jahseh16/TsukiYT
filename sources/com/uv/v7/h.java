package com.uv.v7;

import android.content.res.AssetManager;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public AssetManager assetManager;
    public String cacheName;
    public y e1;
    public File mmkvDir;
    public String pattern;
    public File verifyFile;

    public interface y {
        void f();
    }

    static {
        System.loadLibrary("llock");
    }

    public h(String str, File file, String str2, File file2, AssetManager assetManager, y yVar) {
        this.cacheName = str;
        this.mmkvDir = file;
        this.pattern = str2;
        this.verifyFile = file2;
        this.assetManager = assetManager;
        this.e1 = yVar;
    }

    public int b() {
        return init(this.cacheName, this.mmkvDir.getAbsolutePath() + this.pattern, this.assetManager, this.verifyFile.getAbsolutePath());
    }

    public void c(int i, String str, int i5) {
        try {
            this.e1.f();
            File file = new File(this.mmkvDir, String.format(this.pattern, Integer.valueOf(i5)));
            if ((!file.exists() || file.delete()) && file.createNewFile()) {
                file.setReadable(true);
                file.setWritable(true);
                file.setExecutable(true);
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public void d(int i) {
        try {
            this.e1.f();
            if ((!this.verifyFile.exists() || this.verifyFile.delete()) && this.verifyFile.createNewFile()) {
                this.verifyFile.setReadable(true);
                this.verifyFile.setWritable(true);
                this.verifyFile.setExecutable(true);
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public native int init(String str, String str2, Object obj, String str3);
}
