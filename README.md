# My Glyph Keyboard - Web Build ZIP

This ZIP contains a complete Android Input Method (keyboard) project and your `Waheedlove-Regular.ttf` font.

## Easiest way to make APK online
1. Create a free GitHub account if needed.
2. Create a new repository, for example `MyGlyphKeyboard`.
3. Upload **all files and folders from this ZIP** to the repository. Do not upload the ZIP itself as the only file.
4. Open the repository's **Actions** tab and create a workflow named `Android APK` using the included workflow file.
5. Run the workflow. When it finishes, download the `MyGlyphKeyboard-debug-apk` artifact and extract the APK.

## Alternative
You can also open the project in Android Studio and use Build > Generate APK.

## What this app does
- Installs as an Android keyboard (IME).
- Shows A-Z keys using your Waheedlove-Regular.ttf font.
- Has space, backspace and Enter.
- Includes your TTF inside the project, so no separate font upload is needed.

## Important font behavior
The keyboard commits normal A-Z Unicode characters. The custom glyph appearance is provided by the TTF on the keyboard itself. Other apps normally render typed text using their own fonts, so a keyboard alone cannot force every app to display your custom glyphs. To display the glyphs everywhere, the receiving app/system must use the same font, or the font must map the glyphs to a Unicode/private-use scheme supported by that app.
