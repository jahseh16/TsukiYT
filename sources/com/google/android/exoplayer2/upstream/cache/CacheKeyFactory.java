package com.google.android.exoplayer2.upstream.cache;

import r0.p;

/* JADX INFO: loaded from: classes.dex */
public interface CacheKeyFactory {
    public static final CacheKeyFactory DEFAULT = new CacheKeyFactory() { // from class: t0.fb
        @Override // com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
        public final String buildCacheKey(r0.p pVar) {
            return s.y(pVar);
        }
    };

    String buildCacheKey(p pVar);
}
