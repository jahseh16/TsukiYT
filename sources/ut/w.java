package ut;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import qn.z6;

/* JADX INFO: loaded from: classes.dex */
public final class w implements z6 {
    public static CharSequence n3(@NonNull Context context, @NonNull ClipData.Item item, int i) {
        return y.y(context, item, i);
    }

    public static void zn(@NonNull Editable editable, @NonNull CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
        int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    @Nullable
    public qn.gv y(@NonNull View view, @NonNull qn.gv gvVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + gvVar);
        }
        if (gvVar.gv() == 2) {
            return gvVar;
        }
        ClipData clipDataN3 = gvVar.n3();
        int iZn = gvVar.zn();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataN3.getItemCount(); i++) {
            CharSequence charSequenceN3 = n3(context, clipDataN3.getItemAt(i), iZn);
            if (charSequenceN3 != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceN3);
                } else {
                    zn(editable, charSequenceN3);
                    z = true;
                }
            }
        }
        return null;
    }
}
