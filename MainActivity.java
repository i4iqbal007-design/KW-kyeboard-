package com.myglyph.keyboard;
import android.app.Activity; import android.os.Bundle; import android.content.Intent; import android.provider.Settings; import android.view.inputmethod.InputMethodManager; import android.content.Context;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle b){super.onCreate(b);setContentView(com.myglyph.keyboard.R.layout.activity_main);
  findViewById(R.id.enable).setOnClickListener(v->startActivity(new Intent(Settings.ACTION_INPUT_METHOD_SETTINGS)));
  findViewById(R.id.choose).setOnClickListener(v->{InputMethodManager imm=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);imm.showInputMethodPicker();});
 }
}
