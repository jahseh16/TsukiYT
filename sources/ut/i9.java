package ut;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class i9 extends y {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ListView f8695x;

    public i9(@NonNull ListView listView) {
        super(listView);
        this.f8695x = listView;
    }

    @Override // ut.y
    public void i9(int i, int i5) {
        f.n3(this.f8695x, i5);
    }

    @Override // ut.y
    public boolean n3(int i) {
        ListView listView = this.f8695x;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i5 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i5 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // ut.y
    public boolean y(int i) {
        return false;
    }
}
