package com.meselal.pay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ScrollView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class AuthActivity extends  AppCompatActivity  { 
	
	
	private double shapeww = 0;
	
	private ArrayList<String> country = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout login;
	private LinearLayout signup;
	private LinearLayout forget;
	private ImageView imageview1;
	private LinearLayout linear2;
	private TextView textview6;
	private LinearLayout l1;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout linear4;
	private EditText edittext1;
	private EditText edittext2;
	private LinearLayout linear5;
	private TextView textview3;
	private LinearLayout linear6;
	private Button button1;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView textview4;
	private TextView textview5;
	private ScrollView vscroll1;
	private LinearLayout oooooooooooo;
	private ImageView imageview2;
	private LinearLayout linear10;
	private TextView textview7;
	private LinearLayout l2;
	private TextView textview8;
	private LinearLayout linear12;
	private EditText edittext3;
	private EditText edittext4;
	private EditText edittext5;
	private LinearLayout linear20;
	private LinearLayout linear13;
	private LinearLayout linear18;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear26;
	private LinearLayout linear25;
	private LinearLayout linear14;
	private Button button2;
	private LinearLayout linear15;
	private TextView textview17;
	private LinearLayout linear16;
	private EditText edittext6;
	private Button button4;
	private TextView coutrty;
	private Button button3;
	private EditText edittext7;
	private TextView textview14;
	private TextView textview11;
	private TextView textview12;
	private ImageView imageview3;
	private LinearLayout linear28;
	private TextView textview18;
	private LinearLayout l3;
	private TextView textview19;
	private LinearLayout linear30;
	private EditText edittext8;
	private LinearLayout linear32;
	private Button button5;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private TextView textview25;
	private TextView textview22;
	private TextView textview23;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.auth);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		login = (LinearLayout) findViewById(R.id.login);
		signup = (LinearLayout) findViewById(R.id.signup);
		forget = (LinearLayout) findViewById(R.id.forget);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview6 = (TextView) findViewById(R.id.textview6);
		l1 = (LinearLayout) findViewById(R.id.l1);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		button1 = (Button) findViewById(R.id.button1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		oooooooooooo = (LinearLayout) findViewById(R.id.oooooooooooo);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		textview7 = (TextView) findViewById(R.id.textview7);
		l2 = (LinearLayout) findViewById(R.id.l2);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		button2 = (Button) findViewById(R.id.button2);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview17 = (TextView) findViewById(R.id.textview17);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		edittext6 = (EditText) findViewById(R.id.edittext6);
		button4 = (Button) findViewById(R.id.button4);
		coutrty = (TextView) findViewById(R.id.coutrty);
		button3 = (Button) findViewById(R.id.button3);
		edittext7 = (EditText) findViewById(R.id.edittext7);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		textview18 = (TextView) findViewById(R.id.textview18);
		l3 = (LinearLayout) findViewById(R.id.l3);
		textview19 = (TextView) findViewById(R.id.textview19);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		edittext8 = (EditText) findViewById(R.id.edittext8);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		button5 = (Button) findViewById(R.id.button5);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		textview25 = (TextView) findViewById(R.id.textview25);
		textview22 = (TextView) findViewById(R.id.textview22);
		textview23 = (TextView) findViewById(R.id.textview23);
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				forget.setVisibility(View.VISIBLE);
				login.setVisibility(View.GONE);
				signup.setVisibility(View.GONE);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), HomeActivity.class);
				startActivity(i);
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				signup.setVisibility(View.VISIBLE);
				login.setVisibility(View.GONE);
				forget.setVisibility(View.GONE);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				login.setVisibility(View.VISIBLE);
				signup.setVisibility(View.GONE);
				forget.setVisibility(View.GONE);
			}
		});
		
		textview25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				login.setVisibility(View.VISIBLE);
				signup.setVisibility(View.GONE);
				forget.setVisibility(View.GONE);
			}
		});
	}
	
	private void initializeLogic() {
		_ui();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _Edittext (final View _view) {
		android.graphics.drawable.GradientDrawable CRNSO = new android.graphics.drawable.GradientDrawable();
		CRNSO.setColor(Color.parseColor("#FFFFFF"));
		CRNSO.setCornerRadii(new float[]{ (float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14,(float) 14 });
		CRNSO.setStroke((int) 2, Color.parseColor("#9E9E9E"));
		_view.setElevation((float) 10);
		_view.setBackground(CRNSO);
	}
	
	
	public void _Shadow (final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
	}
	
	
	public void _ui () {
		_Edittext(edittext1);
		_Edittext(edittext2);
		_Edittext(edittext3);
		_Edittext(edittext4);
		_Edittext(edittext5);
		_Edittext(edittext6);
		_Edittext(edittext7);
		_Edittext(edittext8);
		_Edittext(linear18);
		_Shadow(5, 20, "#7dc400", button2);
		_Shadow(5, 20, "#7dc400", button5);
		_Shadow(5, 20, "#7dc400", button1);
		_Edittext(l1);
		_Edittext(l2);
		_Edittext(l3);
	}
	
	
	public void _border (final View _v, final String _color, final String _strokew) {
		shapeww = Double.parseDouble(_strokew);
		float shapew = (float) shapeww;
		
		android.graphics.drawable.ShapeDrawable shape = new android.graphics.drawable.ShapeDrawable(new android.graphics.drawable.shapes.RectShape());
		shape.getPaint().setColor(Color.parseColor(_color));
		shape.getPaint().setStyle(Paint.Style.STROKE);
		shape.getPaint().setStrokeWidth(shapew);
		_v.setBackground(shape);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}