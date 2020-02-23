package com.dcdhameliya.code_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dcdhameliya.codeview.CodeView;

import static com.dcdhameliya.codeview.CodeView.CODE_C;
import static com.dcdhameliya.codeview.CodeView.CODE_JAVA;
import static com.dcdhameliya.codeview.CodeView.FONT_LARGE;
import static com.dcdhameliya.codeview.CodeView.FONT_MEDIUM;
import static com.dcdhameliya.codeview.CodeView.FONT_SMALL;
import static com.dcdhameliya.codeview.CodeView.LINE_DISPLAY;
import static com.dcdhameliya.codeview.CodeView.LINE_DISPLAY_NONE;
import static com.dcdhameliya.codeview.CodeView.THEME_ATOMIC;
import static com.dcdhameliya.codeview.CodeView.THEME_DROIDE;
import static com.dcdhameliya.codeview.CodeView.THEME_ECLIPSE;
import static com.dcdhameliya.codeview.CodeView.THEME_GIT;
import static com.dcdhameliya.codeview.CodeView.THEME_MOCHA;
import static com.dcdhameliya.codeview.CodeView.THEME_TUTTI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CodeView codeView = findViewById(R.id.code_view);

        String code = "#include <stdio.h>\n" +
                " \n" +
                "void main()\n" +
                "{\n" +
                "    int num;\n" +
                " \n" +
                "    printf(\"Enter a number: \\n\");\n" +
                "    scanf(\"%d\", &num);\n" +
                "    if (num > 0)\n" +
                "        printf(\"%d is a positive number \\n\", num);\n" +
                "    else if (num < 0)\n" +
                "        printf(\"%d is a negative number \\n\", num);\n" +
                "    else\n" +
                "        printf(\"0 is neither positive nor negative\");\n" +
                "}";
        codeView.setCode(code);
        codeView.setLineNo(LINE_DISPLAY);
        codeView.setLanguage(CODE_C);
        codeView.setFont(FONT_MEDIUM);
        codeView.setTheme(THEME_DROIDE);
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
