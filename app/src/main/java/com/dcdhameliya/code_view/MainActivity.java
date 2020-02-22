package com.dcdhameliya.code_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dcdhameliya.codeview.CodeView;

import static com.dcdhameliya.codeview.CodeView.CODE_JAVA;
import static com.dcdhameliya.codeview.CodeView.FONT_SMALL;
import static com.dcdhameliya.codeview.CodeView.LINE_DISPLAY_NONE;
import static com.dcdhameliya.codeview.CodeView.THEME_GIT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CodeView codeView = findViewById(R.id.code_view);
        String code = "public void setHorizontalScrollbarOverlay(boolean overlay) {}\n" +
                "public void setVerticalScrollbarOverlay(boolean overlay) {}\n" +
                "public boolean overlayHorizontalScrollbar() {}\n" +
                "public boolean overlayVerticalScrollbar() {}\n" +
                "public SslCertificate getCertificate() {}\n" +
                "public void setCertificate(SslCertificate certificate) {}\n" +
                "public void savePassword(String host, String username, String password) {}\n" +
                "public void setHttpAuthUsernamePassword(String host, String realm, String username, String password) {}\n" +
                "public String[] getHttpAuthUsernamePassword(String host, String realm) {}\n" +
                "public void destroy() {}\n" +
                "public void setNetworkAvailable(boolean networkUp) {}\n" +
                "public WebBackForwardList saveState(Bundle outState) {}\n" +
                "public WebBackForwardList restoreState(Bundle inState) {}\n" +
                "public void loadUrl(String url, Map<String, String> additionalHttpHeaders) {}\n" +
                "public void loadUrl(String url) {}\n" +
                "public void postUrl(String url, byte[] postData) {}\n" +
                "public void loadData(String data, @Nullable String mimeType, @Nullable String encoding) {}\n" +
                "public void loadDataWithBaseURL(@Nullable String baseUrl, String data, @Nullable String mimeType, @Nullable String encoding, @Nullable String historyUrl) {}\n" +
                "public void evaluateJavascript(String script, @Nullable ValueCallback<String> resultCallback) {}\n" +
                "public void saveWebArchive(String filename) {}\n" +
                "public void saveWebArchive(String basename, boolean autoname, @Nullable ValueCallback<String> callback) {}\n" +
                "public void stopLoading() {}\n" +
                "public void reload() {}\n" +
                "public boolean canGoBack() {}\n" +
                "public void goBack() {}\n" +
                "public boolean canGoForward() {}\n" +
                "public void goForward() {}\n" +
                "public boolean canGoBackOrForward(int steps) {}\n" +
                "public void goBackOrForward(int steps) {}\n" +
                "public boolean isPrivateBrowsingEnabled() {}\n" +
                "public boolean pageUp(boolean top) {}\n" +
                "public boolean pageDown(boolean bottom) {}\n" +
                "public void postVisualStateCallback(long requestId, WebView.VisualStateCallback callback) {}\n" +
                "public void clearView() {}\n" +
                "public Picture capturePicture() {}\n" +
                "public PrintDocumentAdapter createPrintDocumentAdapter() {}\n" +
                "public PrintDocumentAdapter createPrintDocumentAdapter(String documentName) {}\n" +
                "public float getScale() {}\n" +
                "public void setInitialScale(int scaleInPercent) {}\n" +
                "public void invokeZoomPicker() {}\n" +
                "public WebView.HitTestResult getHitTestResult() {}\n" +
                "public void requestFocusNodeHref(@Nullable Message hrefMsg) {}\n" +
                "public void requestImageRef(Message msg) {}\n" +
                "public String getUrl() {}\n" +
                "public String getTitle() {}\n" +
                "public Bitmap getFavicon() {}\n" +
                "public int getProgress() {}\n" +
                "public int getContentHeight() {}\n" +
                "public void pauseTimers() {}\n" +
                "public void resumeTimers() {}\n" +
                "public void onPause() {}\n" +
                "public void onResume() {}\n" +
                "public void freeMemory() {}\n" +
                "public void clearCache(boolean includeDiskFiles) {}\n" +
                "public void clearFormData() {}\n" +
                "public void clearHistory() {}\n" +
                "public void clearSslPreferences() {}\n" +
                "public static void clearClientCertPreferences(@Nullable Runnable onCleared) {}\n" +
                "public static void startSafeBrowsing(@NonNull Context context, @Nullable ValueCallback<Boolean> callback) {}\n" +
                "public static void setSafeBrowsingWhitelist(@NonNull List<String> hosts, @Nullable ValueCallback<Boolean> callback) {}\n" +
                "public static Uri getSafeBrowsingPrivacyPolicyUrl() {}\n" +
                "public WebBackForwardList copyBackForwardList() {}\n" +
                "public void setFindListener(WebView.FindListener listener) {}\n" +
                "public void findNext(boolean forward) {}\n" +
                "public int findAll(String find) {}\n" +
                "public void findAllAsync(String find) {}\n" +
                "public boolean showFindDialog(@Nullable String text, boolean showIme) {}\n" +
                "public static String findAddress(String addr) {}\n" +
                "public static void enableSlowWholeDocumentDraw() {}\n" +
                "public void clearMatches() {}\n" +
                "public void documentHasImages(Message response) {}\n" +
                "public void setWebViewClient(WebViewClient client) {}\n" +
                "public WebViewClient getWebViewClient() {}\n" +
                "public WebViewRenderProcess getWebViewRenderProcess() {}\n" +
                "public void setWebViewRenderProcessClient(@NonNull Executor executor, @NonNull WebViewRenderProcessClient webViewRenderProcessClient) {}\n" +
                "public void setWebViewRenderProcessClient(@Nullable WebViewRenderProcessClient webViewRenderProcessClient) {}\n" +
                "public WebViewRenderProcessClient getWebViewRenderProcessClient() {}\n" +
                "public void setDownloadListener(DownloadListener listener) {}\n" +
                "public void setWebChromeClient(WebChromeClient client) {}\n" +
                "public WebChromeClient getWebChromeClient() {}\n" +
                "public void setPictureListener(WebView.PictureListener listener) {}\n" +
                "public void addJavascriptInterface(Object object, String name) {}\n" +
                "public void removeJavascriptInterface(@NonNull String name) {}\n" +
                "public WebMessagePort[] createWebMessageChannel() {}\n" +
                "public void postWebMessage(WebMessage message, Uri targetOrigin) {}\n" +
                "public WebSettings getSettings() {}\n" +
                "public static void setWebContentsDebuggingEnabled(boolean enabled) {}\n" +
                "public static void setDataDirectorySuffix(String suffix) {}\n" +
                "public static void disableWebView() {}\n" +
                "public void onChildViewAdded(View parent, View child) {}\n" +
                "public void onChildViewRemoved(View p, View child) {}\n" +
                "public void onGlobalFocusChanged(View oldFocus, View newFocus) {}\n" +
                "public void setMapTrackballToArrowKeys(boolean setMap) {}\n" +
                "public void flingScroll(int vx, int vy) {}\n" +
                "public boolean canZoomIn() {}\n" +
                "public boolean canZoomOut() {}\n" +
                "public void zoomBy(float zoomFactor) {}\n" +
                "public boolean zoomIn() {}\n" +
                "public boolean zoomOut() {}\n" +
                "public void setRendererPriorityPolicy(int rendererRequestedPriority, boolean waivedWhenNotVisible) {}\n" +
                "public int getRendererRequestedPriority() {}\n" +
                "public boolean getRendererPriorityWaivedWhenNotVisible() {}\n" +
                "public void setTextClassifier(@Nullable TextClassifier textClassifier) {}\n" +
                "public TextClassifier getTextClassifier() {}\n" +
                "public static ClassLoader getWebViewClassLoader() {}\n" +
                "public Looper getWebViewLooper() {}\n" +
                "public void setLayoutParams(LayoutParams params) {}\n" +
                "public void setOverScrollMode(int mode) {}\n" +
                "public void setScrollBarStyle(int style) {}\n" +
                "public void computeScroll() {}\n" +
                "public boolean onHoverEvent(MotionEvent event) {}\n" +
                "public boolean onTouchEvent(MotionEvent event) {}\n" +
                "public boolean onGenericMotionEvent(MotionEvent event) {}\n" +
                "public boolean onTrackballEvent(MotionEvent event) {}\n" +
                "public boolean onKeyDown(int keyCode, KeyEvent event) {}\n" +
                "public boolean onKeyUp(int keyCode, KeyEvent event) {}\n" +
                "public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {}\n" +
                "public AccessibilityNodeProvider getAccessibilityNodeProvider() {}\n" +
                "public boolean shouldDelayChildPressedState() {}\n" +
                "public CharSequence getAccessibilityClassName() {}\n" +
                "public void onProvideVirtualStructure(ViewStructure structure) {}\n" +
                "public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {}\n" +
                "public void autofill(SparseArray<AutofillValue> values) {}\n" +
                "public boolean isVisibleToUserForAutofill(int virtualId) {}\n" +
                "public boolean performLongClick() {}\n" +
                "public InputConnection onCreateInputConnection(EditorInfo outAttrs) {}\n" +
                "public boolean onDragEvent(DragEvent event) {}\n" +
                "public void onWindowFocusChanged(boolean hasWindowFocus) {}\n" +
                "public boolean dispatchKeyEvent(KeyEvent event) {}\n" +
                "public boolean requestFocus(int direction, Rect previouslyFocusedRect) {}\n" +
                "public boolean requestChildRectangleOnScreen(View child, Rect rect, boolean immediate) {}\n" +
                "public void setBackgroundColor(int color) {}\n" +
                "public void setLayerType(int layerType, Paint paint) {}\n" +
                "public void onStartTemporaryDetach() {}\n" +
                "public void onFinishTemporaryDetach() {}\n" +
                "public Handler getHandler() {}\n" +
                "public View findFocus() {}";
        codeView.setLineNo(LINE_DISPLAY_NONE);
        codeView.setLanguage(CODE_JAVA);
        codeView.setCode(code);
        codeView.setFontStyle(FONT_SMALL);
        codeView.setTheme(THEME_GIT);
        codeView.apply();

    }
}

/*

            "languages": {
                "Generic Highlighting": "generic",
                "CSS (Cascading Style Sheets)": "css",
                "HTML (Hypertext Markup Language)": "html",
                "Java": "java",
                "Javascript": "js",
                "JSON": "json",
                "Markdown": "md",
                "PHP": "php",
                "Python": "python",
                "Ruby": "ruby",
                "Batch MS-DOS": "msdos",
                "Shell Script": "shell",
                "SQL": "sql",
                "XML": "xml",
                "C": "c",
                "C++": "cpp",
                "C#": "csharp",
                "RUST": "rust",
                "LUA": "lua",
                "Matlab": "matlab",
                "NSIS": "nsis",
                "Diff": "diff",
                "VHDL": "vhdl",
                "Avr Assembly": "avrasm",
                "Generic Assembly": "asm",
                "Kotlin": "kotlin",
                "Squirrel": "squirrel",
                "Ini\/Conf Syntax": "ini",
                "RAW Code": "raw",
                "No Highlighting": "no-highlight"
            },
            "themes": {
                "WPCustom": "wpcustom",
                "Enlighter": "enlighter",
                "Godzilla": "godzilla",
                "Beyond": "beyond",
                "Classic": "classic",
                "MooTwo": "mootwo",
                "Eclipse": "eclipse",
                "Droide": "droide",
                "Minimal": "minimal",
                "Atomic": "atomic",
                "Rowhammer": "rowhammer",
                "Git": "git",
                "Mocha": "mocha",
                "MooTools": "mootools",
                "Panic": "panic",
                "Tutti": "tutti",
                "Twilight": "twilight"
            },
            "config": {
                "theme": "atomic",
                "language": "php",
                "linenumbers": true,
                "indent": 2,
                "tabIndentation": false,
                "quicktagMode": "html",
                "languageShortcode": true,
                "shortcuts": false
            }
        };

 */
