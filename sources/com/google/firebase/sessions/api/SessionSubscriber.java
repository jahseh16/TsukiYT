package com.google.firebase.sessions.api;

/* JADX INFO: loaded from: classes.dex */
public interface SessionSubscriber {
    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(SessionDetails sessionDetails);
}
