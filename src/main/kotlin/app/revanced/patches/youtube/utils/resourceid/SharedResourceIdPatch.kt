package app.revanced.patches.youtube.utils.resourceid

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.ResourcePatch
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.shared.mapping.ResourceMappingPatch
import app.revanced.patches.shared.mapping.ResourceMappingPatch.getId
import app.revanced.patches.shared.mapping.ResourceType.COLOR
import app.revanced.patches.shared.mapping.ResourceType.DIMEN
import app.revanced.patches.shared.mapping.ResourceType.DRAWABLE
import app.revanced.patches.shared.mapping.ResourceType.ID
import app.revanced.patches.shared.mapping.ResourceType.INTEGER
import app.revanced.patches.shared.mapping.ResourceType.LAYOUT
import app.revanced.patches.shared.mapping.ResourceType.STRING
import app.revanced.patches.shared.mapping.ResourceType.STYLE

@Patch(dependencies = [ResourceMappingPatch::class])
object SharedResourceIdPatch : ResourcePatch() {
    var AccountSwitcherAccessibility = -1L
    var ActionBarRingo = -1L
    var ActionBarSearchResultsViewMic = -1L
    var AdAttribution = -1L
    var Appearance = -1L
    var AppRelatedEndScreenResults = -1L
    var AutoNavPreviewStub = -1L
    var AutoNavToggle = -1L
    var BackgroundCategory = -1L
    var Bar = -1L
    var BarContainerHeight = -1L
    var BottomSheetFooterText = -1L
    var BottomUiContainerStub = -1L
    var ChannelListSubMenu = -1L
    var CompactLink = -1L
    var CompactListItem = -1L
    var ControlsLayoutStub = -1L
    var DarkSplashAnimation = -1L
    var DonationCompanion = -1L
    var EasySeekEduContainer = -1L
    var EditSettingsAction = -1L
    var EndScreenElementLayoutCircle = -1L
    var EndScreenElementLayoutIcon = -1L
    var EndScreenElementLayoutVideo = -1L
    var EmojiPickerIcon = -1L
    var ExpandButtonDown = -1L
    var Fab = -1L
    var FadeDurationFast = -1L
    var FilterBarHeight = -1L
    var FloatyBarTopMargin = -1L
    var FullScreenButton = -1L
    var FullScreenEngagementOverlay = -1L
    var FullScreenEngagementPanel = -1L
    var HorizontalCardList = -1L
    var ImageOnlyTab = -1L
    var InlineTimeBarColorizedBarPlayedColorDark = -1L
    var InlineTimeBarPlayedNotHighlightedColor = -1L
    var InsetOverlayViewLayout = -1L
    var InterstitialsContainer = -1L
    var MenuItemView = -1L
    var MusicAppDeeplinkButtonView = -1L
    var PosterArtWidthDefault = -1L
    var QualityAuto = -1L
    var QuickActionsElementContainer = -1L
    var ReelDynRemix = -1L
    var ReelDynShare = -1L
    var ReelForcedMuteButton = -1L
    var ReelPivotButton = -1L
    var ReelPlayerBadge = -1L
    var ReelPlayerBadge2 = -1L
    var ReelPlayerFooter = -1L
    var ReelPlayerInfoPanel = -1L
    var ReelPlayerPausedStateButton = -1L
    var ReelRightDislikeIcon = -1L
    var ReelRightLikeIcon = -1L
    var ReelTimeBarPlayedColor = -1L
    var RelatedChipCloudMargin = -1L
    var RightComment = -1L
    var ScrimOverlay = -1L
    var Scrubbing = -1L
    var SeekUndoEduOverlayStub = -1L
    var SettingsBooleanTimeRangeDialog = -1L
    var SlidingDialogAnimation = -1L
    var SubtitleMenuSettingsFooterInfo = -1L
    var SuggestedAction = -1L
    var TabsBarTextTabView = -1L
    var ToolTipContentView = -1L
    var TotalTime = -1L
    var VideoQualityBottomSheet = -1L
    var VideoZoomIndicatorLayout = -1L
    var YoutubeControlsOverlay = -1L
    var YoutubeControlsOverlaySubtitleButton = -1L

    override fun execute(context: ResourceContext) {

        AccountSwitcherAccessibility = getId(STRING, "account_switcher_accessibility_label")
        ActionBarRingo = getId(LAYOUT, "action_bar_ringo")
        ActionBarSearchResultsViewMic = getId(LAYOUT, "action_bar_search_results_view_mic")
        AdAttribution = getId(ID, "ad_attribution")
        Appearance = getId(STRING, "app_theme_appearance_dark")
        AppRelatedEndScreenResults = getId(LAYOUT, "app_related_endscreen_results")
        AutoNavPreviewStub = getId(ID, "autonav_preview_stub")
        AutoNavToggle = getId(ID, "autonav_toggle")
        BackgroundCategory = getId(STRING, "pref_background_and_offline_category")
        Bar = getId(LAYOUT, "bar")
        BarContainerHeight = getId(DIMEN, "bar_container_height")
        BottomSheetFooterText = getId(ID, "bottom_sheet_footer_text")
        BottomUiContainerStub = getId(ID, "bottom_ui_container_stub")
        ChannelListSubMenu = getId(LAYOUT, "channel_list_sub_menu")
        CompactLink = getId(LAYOUT, "compact_link")
        CompactListItem = getId(LAYOUT, "compact_list_item")
        ControlsLayoutStub = getId(ID, "controls_layout_stub")
        DarkSplashAnimation = getId(ID, "dark_splash_animation")
        DonationCompanion = getId(LAYOUT, "donation_companion")
        EasySeekEduContainer = getId(ID, "easy_seek_edu_container")
        EditSettingsAction = getId(STRING, "edit_settings_action")
        EndScreenElementLayoutCircle = getId(LAYOUT, "endscreen_element_layout_circle")
        EndScreenElementLayoutIcon = getId(LAYOUT, "endscreen_element_layout_icon")
        EndScreenElementLayoutVideo = getId(LAYOUT, "endscreen_element_layout_video")
        EmojiPickerIcon = getId(ID, "emoji_picker_icon")
        ExpandButtonDown = getId(LAYOUT, "expand_button_down")
        Fab = getId(ID, "fab")
        FadeDurationFast = getId(INTEGER, "fade_duration_fast")
        FilterBarHeight = getId(DIMEN, "filter_bar_height")
        FloatyBarTopMargin = getId(DIMEN, "floaty_bar_button_top_margin")
        FullScreenButton = getId(ID, "fullscreen_button")
        FullScreenEngagementOverlay = getId(LAYOUT, "fullscreen_engagement_overlay")
        FullScreenEngagementPanel = getId(ID, "fullscreen_engagement_panel_holder")
        HorizontalCardList = getId(LAYOUT, "horizontal_card_list")
        ImageOnlyTab = getId(LAYOUT, "image_only_tab")
        InlineTimeBarColorizedBarPlayedColorDark =
            getId(COLOR, "inline_time_bar_colorized_bar_played_color_dark")
        InlineTimeBarPlayedNotHighlightedColor =
            getId(COLOR, "inline_time_bar_played_not_highlighted_color")
        InsetOverlayViewLayout = getId(ID, "inset_overlay_view_layout")
        InterstitialsContainer = getId(ID, "interstitials_container")
        MenuItemView = getId(ID, "menu_item_view")
        MusicAppDeeplinkButtonView = getId(ID, "music_app_deeplink_button_view")
        PosterArtWidthDefault = getId(DIMEN, "poster_art_width_default")
        QualityAuto = getId(STRING, "quality_auto")
        QuickActionsElementContainer = getId(ID, "quick_actions_element_container")
        ReelDynRemix = getId(ID, "reel_dyn_remix")
        ReelDynShare = getId(ID, "reel_dyn_share")
        ReelForcedMuteButton = getId(ID, "reel_player_forced_mute_button")
        ReelPivotButton = getId(ID, "reel_pivot_button")
        ReelPlayerBadge = getId(ID, "reel_player_badge")
        ReelPlayerBadge2 = getId(ID, "reel_player_badge2")
        ReelPlayerFooter = getId(LAYOUT, "reel_player_dyn_footer_vert_stories3")
        ReelPlayerInfoPanel = getId(ID, "reel_player_info_panel")
        ReelPlayerPausedStateButton = getId(ID, "reel_player_paused_state_buttons")
        ReelRightDislikeIcon = getId(DRAWABLE, "reel_right_dislike_icon")
        ReelRightLikeIcon = getId(DRAWABLE, "reel_right_like_icon")
        ReelTimeBarPlayedColor = getId(COLOR, "reel_time_bar_played_color")
        RelatedChipCloudMargin = getId(LAYOUT, "related_chip_cloud_reduced_margins")
        RightComment = getId(DRAWABLE, "ic_right_comment_32c")
        ScrimOverlay = getId(ID, "scrim_overlay")
        Scrubbing = getId(DIMEN, "vertical_touch_offset_to_enter_fine_scrubbing")
        SeekUndoEduOverlayStub = getId(ID, "seek_undo_edu_overlay_stub")
        SettingsBooleanTimeRangeDialog = getId(LAYOUT, "setting_boolean_time_range_dialog")
        SlidingDialogAnimation = getId(STYLE, "SlidingDialogAnimation")
        SubtitleMenuSettingsFooterInfo = getId(STRING, "subtitle_menu_settings_footer_info")
        SuggestedAction = getId(LAYOUT, "suggested_action")
        TabsBarTextTabView = getId(ID, "tabs_bar_text_tab_view")
        ToolTipContentView = getId(LAYOUT, "tooltip_content_view")
        TotalTime = getId(STRING, "total_time")
        VideoQualityBottomSheet = getId(LAYOUT, "video_quality_bottom_sheet_list_fragment_title")
        VideoZoomIndicatorLayout = getId(ID, "video_zoom_indicator_layout")
        YoutubeControlsOverlay = getId(ID, "youtube_controls_overlay")
        YoutubeControlsOverlaySubtitleButton = getId(LAYOUT, "youtube_controls_overlay_subtitle_button")

    }
}