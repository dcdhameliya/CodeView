# CodeView (Android)

<b>CodeView</b> is a android widget to help show code and hightlight it in your Android Application.

example:

<table>
  <tr>
    <td>
    <img src="https://github.com/dcdhameliya/CodeView/blob/master/SS/1.jpg" width="216"  height="382"/>
    </td>
    <td>
    <img src="https://github.com/dcdhameliya/CodeView/blob/master/SS/2.jpg" width="216"  height="382"/>
    </td>
    <td>
    <img src="https://github.com/dcdhameliya/CodeView/blob/master/SS/3.jpg" width="216"  height="382"/>
    </td>
  </tr>
   <tr>
    <td>
    <img src="https://github.com/dcdhameliya/CodeView/blob/master/SS/4.jpg" width="216"  height="382"/>
    </td>
    <td>
    <img src="https://github.com/dcdhameliya/CodeView/blob/master/SS/5.jpg" width="216"  height="382"/>
    </td>
    <td>
    <img src="https://github.com/dcdhameliya/CodeView/blob/master/SS/6.jpg" width="216"  height="382"/>
    </td>

  </tr>
</table>



It can not only show code snippet，but also replaced all the specified code in the HTML with some CSS & JAVASCRIPT files which is used to highlight code.


## Download
Add belowed code in your root ```build.gradle``` at the end of repositories:
```groovy
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

Now add the dependency to your app ```build.gradle```:
```groovy
dependencies {
    implementation 'com.github.dcdhameliya:CodeView:0.0.2-Beta'
}
```

## Usage
Add view to your layout.xml & bind as usual:

```layout.xml```
```xml
<com.dcdhameliya.codeview.CodeView
      android:id="@+id/code_view"
      android:layout_width="match_parent"
      android:layout_height="match_parent" />
```

```Actvity.java```
```java
CodeView codeView = findViewById(R.id.code_view);
```

Now view binding is complete so you can go for the further steps...

To set the code inside the view
```java
String code = ""; // CODE VARIABLE CONTAIN ANY LANGUAGE CODE IN STRING FORMATE
codeView.setCode(code);
```
To set ```Language``` of ```CodeView```
```java
codeView.setLanguage(/*CODE_CONSTANT*/); //  REPLACE 'CODE_CONSTANT' BY SPECIFIC CONSTANT
```
By default 'CODE_CONSTANT' is ```CodeView.CODE_GENERIC_HIGHLIGHTING```.<br/>
List of 'CODE_CONSTANT' is givel below.
```java
CodeView.CODE_GENERIC_HIGHLIGHTING  /* for generic*/ 
CodeView.CODE_CSS  /* for css*/ 
CodeView.CODE_HTML  /* for html*/ 
CodeView.CODE_JAVA  /* for java*/ 
CodeView.CODE_JAVASCRIPT  /* for js*/ 
CodeView.CODE_JSON  /* for json*/ 
CodeView.CODE_MARKDOWN  /* for md*/ 
CodeView.CODE_PHP  /* for php*/ 
CodeView.CODE_PYTHON  /* for python*/ 
CodeView.CODE_RUBY  /* for ruby*/ 
CodeView.CODE_BATCH_MS_DOS  /* for msdos*/ 
CodeView.CODE_SHELL_SCRIPT  /* for shell*/ 
CodeView.CODE_SQL  /* for sql*/ 
CodeView.CODE_XML  /* for xml*/ 
CodeView.CODE_C  /* for c*/ 
CodeView.CODE_CPP  /* for cpp*/ 
CodeView.CODE_C_SHARP  /* for csharp*/ 
CodeView.CODE_RUST  /* for rust*/ 
CodeView.CODE_LUA  /* for lua*/ 
CodeView.CODE_MATLAB  /* for matlab*/ 
CodeView.CODE_NSIS  /* for nsis*/ 
CodeView.CODE_DIFF  /* for diff*/ 
CodeView.CODE_VHDL  /* for vhdl*/ 
CodeView.CODE_AVR_ASSEMBLY  /* for avrasm*/ 
CodeView.CODE_GENERIC_ASSEMBLY  /* for asm*/ 
CodeView.CODE_KOTLIN  /* for kotlin*/ 
CodeView.CODE_SQUIRREL  /* for squirrel*/ 
CodeView.CODE_INI_CONF_SYNTAX  /* for ini*/ 
CodeView.CODE_RAW_CODE  /* for raw*/ 
CodeView.CODE_NO_HIGHLIGHTING  /* for no-highlight*/ 
```


To set theme of ```CodeView```
```java
codeView.setTheme(/*THEME_CONSTANT*/); // REPLACE 'THEME_CONSTANT' BY SPECIFIC CONSTANT
```
By default 'THEME_CONSTANT' is ```CodeView.THEME_ENLIGHTER```.<br/>
List of 'THEME_CONSTANT' is givel below.
```java
CodeView.THEME_ENLIGHTER
CodeView.THEME_GODZILLA
CodeView.THEME_BEYOND
CodeView.THEME_CLASSIC
CodeView.THEME_MOOTWO
CodeView.THEME_ECLIPSE
CodeView.THEME_DROIDE
CodeView.THEME_MINIMAL
CodeView.THEME_ATOMIC
CodeView.THEME_ROWHAMMER
CodeView.THEME_GIT
CodeView.THEME_MOCHA
CodeView.THEME_MOOTOOLS
CodeView.THEME_PANIC
CodeView.THEME_TUTTI
CodeView.THEME_TWILIGHT
```

To set line number for ```CodeView```
```java
codeView.setLineNo(/*LINE_CONSTANT*/); // REPLACE 'LINE_CONSTANT' BY SPECIFIC CONSTANT
```
By default 'LINE_CONSTANT' is ```CodeView.LINE_DISPLAY_NONE```.<br/>
List of 'LINE_CONSTANT' is givel below.
```java
CodeView.LINE_DISPLAY /* To display line numbers*/
CodeView.LINE_DISPLAY_NONE /* To hide the line numbers*/
```

To set font for ```CodeView```
```java
codeView.setFont(/*FONT_CONSTANT*/); // REPLACE 'FONT_CONSTANT' BY SPECIFIC CONSTANT
```

By default 'FONT_CONSTANT' is ```CodeView.FONT_MEDIUM```.<br/>
List of 'FONT_CONSTANT' is givel below.
```java
CodeView.FONT_SMALL /* To display small font */
CodeView.FONT_MEDIUM /* To display medium font */
CodeView.FONT_LARGE /* To display large font */
```

Now CodeView settings is done but it is not reflect in UI.
To apply this settings you need to call another method of CodeView.
```java
codeView.apply();
```


You can download demo project from this [link](https://app.box.com/s/1stsblh0vx9dxxc0eur59ffrxzfzpor3).<br>
The password of this CodeViewDemo.rar file is ```dcdhameliya```.

If you want to do some technical contribution then mail me on my mail address

Of course, it is my first open-source library, it must have much trouble, and bug, you can give me some advice, and then, I can learn more and I will update the library with your advice and proper credits.

mail ：dcdhameliya@gmail.com

&copy; Dhruval Dhameliya
Licensed under the [MIT License](LICENSE).
