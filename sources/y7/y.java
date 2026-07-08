package y7;

import free.daily.tube.account_data_impl.AccountDataInitializer;
import free.daily.tube.activation_impl.ActivationInitializer;
import free.daily.tube.background.init.VancedInitializer;
import free.daily.tube.base_impl.BaseInitializer;
import free.daily.tube.buried_point_impl.BuriedPointInitializer;
import free.daily.tube.channel.v1_impl.ChannelV1Initializer;
import free.daily.tube.channel.v2_impl.ChannelV2Initializer;
import free.daily.tube.config_impl.ConfigInitializer;
import free.daily.tube.crash_report_firebase_impl.FirebaseInitializer;
import free.daily.tube.crash_report_impl.CrashReportInitializer;
import free.daily.tube.encode_impl.EncodeInitializer;
import free.daily.tube.extractor.host.gp.service.HostGpInitializer;
import free.daily.tube.extractor.host.host_interface.HostInterfaceInitializer;
import free.daily.tube.extractor.legal_source.server.LegalInterfaceInitializer;
import free.daily.tube.kv_impl.KvInitializer;
import free.daily.tube.memory_impl.MemoryInitializer;
import free.daily.tube.minimalist_impl.init.MinimalistInitializer;
import free.daily.tube.module.account_impl.AccountInitializer;
import free.daily.tube.module.album_impl.AlbumInitializer;
import free.daily.tube.module.apm_impl.LogInitializer;
import free.daily.tube.module.app_notification.impl.AppNotificationInitializer;
import free.daily.tube.module.bottom_tab_impl.BottomTabInitializer;
import free.daily.tube.module.channel_impl.ChannelInitializer;
import free.daily.tube.module.comments_impl.CommentInitializer;
import free.daily.tube.module.config_dialog_impl.ConfigDialogInitializer;
import free.daily.tube.module.deeplink_impl.init.DeepLinkInitializer;
import free.daily.tube.module.detail_common.init.DetailCommonInitializer;
import free.daily.tube.module.encrypt.init.LocalEncryptInitializer;
import free.daily.tube.module.featured_impl.init.FeaturedInitializer;
import free.daily.tube.module.feedback_impl.FeedbackInitializer;
import free.daily.tube.module.fission_impl.init.FissionInitializer;
import free.daily.tube.module.followus_impl.init.FollowUsInitializer;
import free.daily.tube.module.guide_impl.GuideInitializer;
import free.daily.tube.module.history_impl.HistoryInitializer;
import free.daily.tube.module.like_impl.LikeInitializer;
import free.daily.tube.module.livechat_impl.LiveChatInitializer;
import free.daily.tube.module.local_media_impl.init.LocalMediaInitializer;
import free.daily.tube.module.local_media_server_impl.init.LocalMediaServerInitializer;
import free.daily.tube.module.me_impl.MeInitializer;
import free.daily.tube.module.media_manager_impl.MediaManagerInitializer;
import free.daily.tube.module.member_impl.MemberInitializer;
import free.daily.tube.module.music_detail_impl.MusicDetailInitializer;
import free.daily.tube.module.music_detail_impl.detail.cover.LocalMediaVioletInitializer;
import free.daily.tube.module.not_interested_impl.NotInterestedInitializer;
import free.daily.tube.module.notification.NotificationInitializer;
import free.daily.tube.module.play_background_impl.PlayBackgroundInitializer;
import free.daily.tube.module.play_popup_impl.PlayPopupInitializer;
import free.daily.tube.module.playlist_impl.PlaylistInitializer;
import free.daily.tube.module.pure_enjoy_impl.init.PureEnjoyInitializer;
import free.daily.tube.module.push_impl.PushInitializer;
import free.daily.tube.module.review_impl.ReviewInitializer;
import free.daily.tube.module.risk_impl.init.RiskInitializer;
import free.daily.tube.module.search_bar_impl.init.SearchBarInitializer;
import free.daily.tube.module.search_impl.init.SearchInitializer;
import free.daily.tube.module.settings_impl.SettingsInitializer;
import free.daily.tube.module.share_impl.MainShareInitializer;
import free.daily.tube.module.share_impl.ShareInitializer;
import free.daily.tube.module.shortcuts_impl.initializer.ShortcutsInitializer;
import free.daily.tube.module.shorts_impl.init.ShortsInitializer;
import free.daily.tube.module.subscription_impl.init.SubscriptionInitializer;
import free.daily.tube.module.trending_impl.init.TrendingInitializer;
import free.daily.tube.module.upgrade_guide_impl.UpgradeGuideInitializer;
import free.daily.tube.module.user_assets_impl.init.UserAssetsInitializer;
import free.daily.tube.module.video_insert_impl.init.VideoInsertInitializer;
import free.daily.tube.module.video_play_detail_impl.init.VideoDetailInitializer;
import free.daily.tube.module.wacth_later_impl.WatchLaterInitializer;
import free.daily.tube.module.webview_detail_impl.init.WebViewDetailInitializer;
import free.daily.tube.modulle.bubble_impl.init.BubbleInitializer;
import free.daily.tube.modulle.floating_ball_impl.FloatingBallInitializer;
import free.daily.tube.multipack.MultiPackInitializer;
import free.daily.tube.multipack.VioletInitializer;
import free.daily.tube.network_impl.NetworkInitializer;
import free.daily.tube.page.list_business_impl.ListBusinessInitializer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public zn<String> n3;
    public zn<Class> y;

    /* JADX INFO: renamed from: y7.y$y, reason: collision with other inner class name */
    public static class C0198y {
        public static y y = new y();
    }

    public static y y() {
        return C0198y.y;
    }

    public List<Class> n3() {
        return this.y.n3();
    }

    public y() {
        this.y = new zn<>();
        this.n3 = new zn<>();
        this.y.y(RiskInitializer.class);
        this.y.y(TrendingInitializer.class);
        this.y.y(SearchInitializer.class);
        this.y.y(SearchBarInitializer.class);
        this.y.y(UserAssetsInitializer.class);
        this.y.y(LocalEncryptInitializer.class);
        this.y.y(LocalMediaInitializer.class);
        this.y.y(MusicDetailInitializer.class);
        this.y.y(LocalMediaVioletInitializer.class);
        this.y.y(LocalMediaServerInitializer.class);
        this.y.y(AlbumInitializer.class);
        this.y.y(HistoryInitializer.class);
        this.y.y(SubscriptionInitializer.class);
        this.y.y(WatchLaterInitializer.class);
        this.y.y(NotInterestedInitializer.class);
        this.y.y(LikeInitializer.class);
        this.y.y(PlaylistInitializer.class);
        this.y.y(MeInitializer.class);
        this.y.y(PureEnjoyInitializer.class);
        this.y.y(AppNotificationInitializer.class);
        this.y.y(CommentInitializer.class);
        this.y.y(MainShareInitializer.class);
        this.y.y(ShareInitializer.class);
        this.y.y(FansZoneInitializer.class);
        this.y.y(FissionInitializer.class);
        this.y.y(ChannelInitializer.class);
        this.y.y(SettingsInitializer.class);
        // Deshabilitado: inicialización de anuncios
        // this.y.y(AdBusinessInitializer.class);
        this.y.y(FeaturedInitializer.class);
        this.y.y(ShortsInitializer.class);
        this.y.y(BubbleInitializer.class);
        this.y.y(LiveChatInitializer.class);
        this.y.y(VideoInsertInitializer.class);
        // Deshabilitado: inicialización de banner operativo
        // this.y.y(OperativeBannerInitializer.class);
        this.y.y(VideoDetailInitializer.class);
        this.y.y(WebViewDetailInitializer.class);
        this.y.y(DetailCommonInitializer.class);
        this.y.y(ShortcutsInitializer.class);
        this.y.y(ListBusinessInitializer.class);
        this.y.y(free.daily.tube.page.list_business_impl.init.ListBusinessInitializer.class);
        this.y.y(AccountInitializer.class);
        this.y.y(UpgradeGuideInitializer.class);
        this.y.y(DeepLinkInitializer.class);
        this.y.y(ConfigDialogInitializer.class);
        this.y.y(PushInitializer.class);
        this.y.y(FeedbackInitializer.class);
        this.y.y(NotificationInitializer.class);
        this.y.y(PlayBackgroundInitializer.class);
        this.y.y(FollowUsInitializer.class);
        this.y.y(MemberInitializer.class);
        this.y.y(FloatingBallInitializer.class);
        this.y.y(BottomTabInitializer.class);
        this.y.y(ReviewInitializer.class);
        this.y.y(GuideInitializer.class);
        this.y.y(MultiPackInitializer.class);
        this.y.y(VioletInitializer.class);
        this.y.y(PlayPopupInitializer.class);
        this.y.y(AccountDataInitializer.class);
        this.y.y(HostGpInitializer.class);
        this.y.y(BuriedPointInitializer.class);
        this.y.y(LogInitializer.class);
        this.y.y(ActivationInitializer.class);
        this.y.y(ChannelV2Initializer.class);
        this.y.y(MediaManagerInitializer.class);
        this.y.y(BaseInitializer.class);
        this.y.y(NetworkInitializer.class);
        this.y.y(ConfigInitializer.class);
        this.y.y(MinimalistInitializer.class);
        this.y.y(free.daily.tube.pure_enjoy_data_impl.init.PureEnjoyInitializer.class);
        this.y.y(CrashReportInitializer.class);
        this.y.y(FirebaseInitializer.class);
        this.y.y(HostInterfaceInitializer.class);
        this.y.y(LegalInterfaceInitializer.class);
        this.y.y(MemoryInitializer.class);
        this.y.y(KvInitializer.class);
        this.y.y(EncodeInitializer.class);
        this.y.y(ChannelV1Initializer.class);
        this.y.y(VancedInitializer.class);
    }
}
