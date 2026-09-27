package com.myglyph.keyboard;
import android.inputmethodservice.InputMethodService; import android.view.*; import android.view.inputmethod.InputConnection; import android.graphics.*; import android.graphics.Typeface; import android.widget.*; import android.content.Context;
public class MyInputMethodService extends InputMethodService {
 private final String[] rows={"ABCDEFGHI","JKLMNOPQR","STUVWXYZ"}; private Typeface glyph;
 @Override public View onCreateInputView(){
  glyph=Typeface.createFromAsset(getAssets(),"fonts/Waheedlove-Regular.ttf");
  LinearLayout root=new LinearLayout(this); root.setOrientation(LinearLayout.VERTICAL); root.setPadding(2,2,2,2);
  for(String row:rows){LinearLayout line=new LinearLayout(this); line.setGravity(Gravity.CENTER);
   for(int i=0;i<row.length();i++){final String s=String.valueOf(row.charAt(i)); Button b=key(s); line.addView(b,new LinearLayout.LayoutParams(0,58,1));} root.addView(line);
  }
  LinearLayout bottom=new LinearLayout(this); Button back=key("⌫"), space=key("SPACE"), enter=key("↵");
  back.setOnClickListener(v->{InputConnection ic=getCurrentInputConnection();if(ic!=null)ic.deleteSurroundingText(1,0);});
  space.setOnClickListener(v->{InputConnection ic=getCurrentInputConnection();if(ic!=null)ic.commitText(" ",1);});
  enter.setOnClickListener(v->{InputConnection ic=getCurrentInputConnection();if(ic!=null)ic.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_ENTER));});
  bottom.addView(back,new LinearLayout.LayoutParams(0,58,1)); bottom.addView(space,new LinearLayout.LayoutParams(0,58,3)); bottom.addView(enter,new LinearLayout.LayoutParams(0,58,1)); root.addView(bottom); return root;
 }
 private Button key(String s){Button b=new Button(this);b.setText(s);b.setTextSize(s.length()==1?20:14);b.setGravity(Gravity.CENTER);if(s.length()==1)b.setTypeface(glyph);b.setOnClickListener(v->{if(s.length()==1){InputConnection ic=getCurrentInputConnection();if(ic!=null)ic.commitText(s,1);}});return b;}
}
