package ic;

/* JADX INFO: loaded from: classes.dex */
public class s {
    public int n3;
    public float y;

    public void y(float f3) {
        float f4 = this.y + f3;
        this.y = f4;
        int i = this.n3 + 1;
        this.n3 = i;
        if (i == Integer.MAX_VALUE) {
            this.y = f4 / 2.0f;
            this.n3 = i / 2;
        }
    }
}
