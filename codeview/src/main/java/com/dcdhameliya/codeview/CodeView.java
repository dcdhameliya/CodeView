package com.dcdhameliya.codeview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CodeView extends WebView {
    private String code = "CODE";
    private String theme = THEME_ENLIGHTER;
    private String language = CODE_GENERIC_HIGHLIGHTING;
    private Boolean lineNo = LINE_DISPLAY_NONE;
    private String[] largeFont = {"15px", "10px", "21px", "18px"};
    private String[] smallFont = {"10px", "0px", "14px", "12px"};
    private String[] mediumFont = {"12px", "5px", "16.8px", "14.4px"};
    private String[] fontStyle = mediumFont;

    public static int FONT_SMALL = -1;
    public static int FONT_MEDIUM = 0;
    public static int FONT_LARGE = 1;

    public static String THEME_ENLIGHTER = "enlighter";
    public static String THEME_GODZILLA = "godzilla";
    public static String THEME_BEYOND = "beyond";
    public static String THEME_CLASSIC = "classic";
    public static String THEME_MOOTWO = "mootwo";
    public static String THEME_ECLIPSE = "eclipse";
    public static String THEME_DROIDE = "droide";
    public static String THEME_MINIMAL = "minimal";
    public static String THEME_ATOMIC = "atomic";
    public static String THEME_ROWHAMMER = "rowhammer";
    public static String THEME_GIT = "git";
    public static String THEME_MOCHA = "mocha";
    public static String THEME_MOOTOOLS = "mootools";
    public static String THEME_PANIC = "panic";
    public static String THEME_TUTTI = "tutti";
    public static String THEME_TWILIGHT = "twilight";

    public static String CODE_GENERIC_HIGHLIGHTING = "generic";
    public static String CODE_CSS = "css";
    public static String CODE_HTML = "html";
    public static String CODE_JAVA = "java";
    public static String CODE_JAVASCRIPT = "js";
    public static String CODE_JSON = "json";
    public static String CODE_MARKDOWN = "md";
    public static String CODE_PHP = "php";
    public static String CODE_PYTHON = "python";
    public static String CODE_RUBY = "ruby";
    public static String CODE_BATCH_MS_DOS = "msdos";
    public static String CODE_SHELL_SCRIPT = "shell";
    public static String CODE_SQL = "sql";
    public static String CODE_XML = "xml";
    public static String CODE_C = "c";
    public static String CODE_CPP = "cpp";
    public static String CODE_C_SHARP = "csharp";
    public static String CODE_RUST = "rust";
    public static String CODE_LUA = "lua";
    public static String CODE_MATLAB = "matlab";
    public static String CODE_NSIS = "nsis";
    public static String CODE_DIFF = "diff";
    public static String CODE_VHDL = "vhdl";
    public static String CODE_AVR_ASSEMBLY = "avrasm";
    public static String CODE_GENERIC_ASSEMBLY = "asm";
    public static String CODE_KOTLIN = "kotlin";
    public static String CODE_SQUIRREL = "squirrel";
    public static String CODE_INI_CONF_SYNTAX = "ini";
    public static String CODE_RAW_CODE = "raw";
    public static String CODE_NO_HIGHLIGHTING = "no-highlight";

    public static Boolean LINE_DISPLAY = true;
    public static Boolean LINE_DISPLAY_NONE = false;


    public CodeView(Context context) {
        super(context);
    }

    public CodeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CodeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void loadData(String a, String b, String c) {
    }

    public void loadUrl(String a) {
    }

    public void loadDataWithBaseURL(String a, String b, String c, String d, String e) {
    }

    public void setWebViewClient(WebViewClient a) {
    }


    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLineNo(Boolean lineNo) {
        this.lineNo = lineNo;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFont(int size) {

        switch (size) {
            case -1:
                fontStyle = smallFont;
                break;
            case 1:
                fontStyle = largeFont;
                break;
            default:
                fontStyle = mediumFont;
        }

    }

    @SuppressLint("SetJavaScriptEnabled")
    public void apply() {

        this.getSettings().setJavaScriptEnabled(true);
        super.loadDataWithBaseURL("",
                toHtml(),
                "text/html",
                "UTF-8",
                "");

    }

    private String toHtml() {
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html>\n")
                .append("<head>\n")
                .append("<link rel='stylesheet' id='enlighter-local-css' href='file:///android_asset/codeview.min.css' type='text/css'\n")
                .append("media='all'/>\n")
                .append("<style type='text/css' media='screen'>body {\n" + "            margin: 0px;\n" + "        }\n" + "        ol.EnlighterJS, ul.EnlighterJS {\n" + "            font-size: ").append(this.fontStyle[0]).append(";\n").append("            padding-left: ").append(this.fontStyle[1]).append(";\n").append("        }\n").append("        ol.EnlighterJS li, ul.EnlighterJS li {\n").append("            line-height: ").append(this.fontStyle[2]).append(";\n").append("        }\n").append("        .EnlighterJS span {\n").append("            font-size: ").append(this.fontStyle[3]).append(";\n").append("        }</style>\n")
                .append("</head>\n")
                .append("<body>\n").append("<pre class='EnlighterJSRAW' data-enlighter-language='").append(this.language).append("' data-enlighter-theme='").append(this.theme).append("'\n").append("     data-enlighter-highlight='' data-enlighter-linenumbers=' data-enlighter-lineoffset=' data-enlighter-title='\n").append("     data-enlighter-group=' style='display: none;'>").append(this.code).append("</pre>\n")
                .append("<script type='text/javascript' src='file:///android_asset/codeview-core-yc.js'></script>\n")
                .append("<script type='text/javascript' src='file:///android_asset/codeview.min.js'></script>\n")
                .append("")
                .append("")
                .append("<script type='text/javascript'>EnlighterJS_Config = {\n")
                .append("'selector': {\n")
                .append("'block': 'pre.EnlighterJSRAW',\n")
                .append("'inline': 'code.EnlighterJSRAW'\n")
                .append("},\n")
                .append("'hover': '',\n").append("'showLinenumbers': ").append(this.lineNo).append(",\n")
                .append("'grouping': true,\n")
                .append("};\n")
                .append("EnlighterJS.Util.Init(EnlighterJS_Config.selector.block, EnlighterJS_Config.selector.inline, EnlighterJS_Config)\n")
                .append("</script>\n")
                .append("</body>\n")
                .append("</html>\n");

        return sb.toString();
    }
}