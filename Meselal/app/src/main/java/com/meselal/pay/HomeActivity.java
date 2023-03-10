package com.meselal.pay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import android.widget.ScrollView;
import android.widget.Button;
import android.widget.TextView;
import de.hdodenhof.circleimageview.*;
import android.widget.ImageView;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class HomeActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private String n = "";
	private double shapeww = 0;
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private Button button1;
	private TextView textview1;
	private CircleImageView prof;
	private LinearLayout linear10;
	private LinearLayout linear8;
	private LinearLayout linear7;
	private LinearLayout linear5;
	private TextView textview2;
	private LinearLayout linear6;
	private TextView textview3;
	private LinearLayout linear9;
	private Button button2;
	private TextView textview4;
	private TextView textview5;
	private LinearLayout _drawer_linear1;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear7;
	private TextView _drawer_textview3;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_linear9;
	private LinearLayout _drawer_linear10;
	private LinearLayout _drawer_linear11;
	private LinearLayout _drawer_linear12;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear14;
	private LinearLayout _drawer_linear15;
	private TextView _drawer_textview4;
	private LinearLayout _drawer_linear16;
	private LinearLayout _drawer_linear17;
	private LinearLayout _drawer_linear18;
	private TextView _drawer_textview5;
	private LinearLayout _drawer_linear19;
	private LinearLayout _drawer_linear20;
	private LinearLayout _drawer_linear21;
	private TextView _drawer_textview6;
	private LinearLayout _drawer_bt;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_dr;
	private Button _drawer_opt;
	private TextView _drawer_naa;
	private TextView _drawer_textview1;
	private TextView _drawer_textview2;
	private ImageView _drawer_imageview9;
	private LinearLayout _drawer_linear30;
	private TextView _drawer_textview7;
	private ImageView _drawer_imageview1;
	private LinearLayout _drawer_linear22;
	private TextView _drawer_textview8;
	private ImageView _drawer_imageview2;
	private LinearLayout _drawer_linear23;
	private TextView _drawer_textview9;
	private ImageView _drawer_imageview3;
	private LinearLayout _drawer_linear24;
	private TextView _drawer_textview10;
	private ImageView _drawer_imageview4;
	private LinearLayout _drawer_linear25;
	private TextView _drawer_textview11;
	private ImageView _drawer_imageview5;
	private LinearLayout _drawer_linear26;
	private TextView _drawer_textview12;
	private ImageView _drawer_imageview6;
	private LinearLayout _drawer_linear29;
	private TextView _drawer_textview13;
	private ImageView _drawer_imageview8;
	private LinearLayout _drawer_linear28;
	private TextView _drawer_textview15;
	private ImageView _drawer_imageview7;
	private LinearLayout _drawer_linear27;
	private TextView _drawer_textview14;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = (AppBarLayout) findViewById(R.id._app_bar);
		_coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		button1 = (Button) findViewById(R.id.button1);
		textview1 = (TextView) findViewById(R.id.textview1);
		prof = (CircleImageView) findViewById(R.id.prof);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		button2 = (Button) findViewById(R.id.button2);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_vscroll1 = (ScrollView) _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_linear9 = (LinearLayout) _nav_view.findViewById(R.id.linear9);
		_drawer_linear10 = (LinearLayout) _nav_view.findViewById(R.id.linear10);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_linear12 = (LinearLayout) _nav_view.findViewById(R.id.linear12);
		_drawer_linear13 = (LinearLayout) _nav_view.findViewById(R.id.linear13);
		_drawer_linear14 = (LinearLayout) _nav_view.findViewById(R.id.linear14);
		_drawer_linear15 = (LinearLayout) _nav_view.findViewById(R.id.linear15);
		_drawer_textview4 = (TextView) _nav_view.findViewById(R.id.textview4);
		_drawer_linear16 = (LinearLayout) _nav_view.findViewById(R.id.linear16);
		_drawer_linear17 = (LinearLayout) _nav_view.findViewById(R.id.linear17);
		_drawer_linear18 = (LinearLayout) _nav_view.findViewById(R.id.linear18);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		_drawer_linear19 = (LinearLayout) _nav_view.findViewById(R.id.linear19);
		_drawer_linear20 = (LinearLayout) _nav_view.findViewById(R.id.linear20);
		_drawer_linear21 = (LinearLayout) _nav_view.findViewById(R.id.linear21);
		_drawer_textview6 = (TextView) _nav_view.findViewById(R.id.textview6);
		_drawer_bt = (LinearLayout) _nav_view.findViewById(R.id.bt);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_dr = (LinearLayout) _nav_view.findViewById(R.id.dr);
		_drawer_opt = (Button) _nav_view.findViewById(R.id.opt);
		_drawer_naa = (TextView) _nav_view.findViewById(R.id.naa);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_imageview9 = (ImageView) _nav_view.findViewById(R.id.imageview9);
		_drawer_linear30 = (LinearLayout) _nav_view.findViewById(R.id.linear30);
		_drawer_textview7 = (TextView) _nav_view.findViewById(R.id.textview7);
		_drawer_imageview1 = (ImageView) _nav_view.findViewById(R.id.imageview1);
		_drawer_linear22 = (LinearLayout) _nav_view.findViewById(R.id.linear22);
		_drawer_textview8 = (TextView) _nav_view.findViewById(R.id.textview8);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_linear23 = (LinearLayout) _nav_view.findViewById(R.id.linear23);
		_drawer_textview9 = (TextView) _nav_view.findViewById(R.id.textview9);
		_drawer_imageview3 = (ImageView) _nav_view.findViewById(R.id.imageview3);
		_drawer_linear24 = (LinearLayout) _nav_view.findViewById(R.id.linear24);
		_drawer_textview10 = (TextView) _nav_view.findViewById(R.id.textview10);
		_drawer_imageview4 = (ImageView) _nav_view.findViewById(R.id.imageview4);
		_drawer_linear25 = (LinearLayout) _nav_view.findViewById(R.id.linear25);
		_drawer_textview11 = (TextView) _nav_view.findViewById(R.id.textview11);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_linear26 = (LinearLayout) _nav_view.findViewById(R.id.linear26);
		_drawer_textview12 = (TextView) _nav_view.findViewById(R.id.textview12);
		_drawer_imageview6 = (ImageView) _nav_view.findViewById(R.id.imageview6);
		_drawer_linear29 = (LinearLayout) _nav_view.findViewById(R.id.linear29);
		_drawer_textview13 = (TextView) _nav_view.findViewById(R.id.textview13);
		_drawer_imageview8 = (ImageView) _nav_view.findViewById(R.id.imageview8);
		_drawer_linear28 = (LinearLayout) _nav_view.findViewById(R.id.linear28);
		_drawer_textview15 = (TextView) _nav_view.findViewById(R.id.textview15);
		_drawer_imageview7 = (ImageView) _nav_view.findViewById(R.id.imageview7);
		_drawer_linear27 = (LinearLayout) _nav_view.findViewById(R.id.linear27);
		_drawer_textview14 = (TextView) _nav_view.findViewById(R.id.textview14);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
			}
		});
		
		prof.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PopupMenu popup = new PopupMenu(HomeActivity.this, prof);
				Menu menu = popup.getMenu();
				menu.add("Behailu Getachew").setIcon(R.drawable.user);
				menu.add("Settings").setIcon(R.drawable.set);
				menu.add("Complaince").setIcon(R.drawable.comp);
				menu.add("Explore the Dashboard").setIcon(R.drawable.dir);
				menu.add("Status page").setIcon(R.drawable.met);
				menu.add("Documentation").setIcon(R.drawable.bok);
				menu.add("Logout").setIcon(R.drawable.out);
				
				popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
					public boolean onMenuItemClick(MenuItem item) {
						switch (item.getTitle().toString()) {
							case "Menu1":
							//your activities
							return true;
							case "Menu2":
							//your activities
							return true;
							default:
							return false;
						}
					}
				});
				try {
					java.lang.reflect.Field[] fields = popup.getClass().getDeclaredFields();
					for (java.lang.reflect.Field field : fields) {
						if ("mPopup".equals(field.getName())) {
							field.setAccessible(true);
							Object menuPopupHelper = field.get(popup); Class<?> classPopupHelper = Class.forName(menuPopupHelper.getClass().getName());
							java.lang.reflect.Method setForceIcons = classPopupHelper.getMethod("setForceShowIcon", boolean.class); setForceIcons.invoke(menuPopupHelper, true);
							break;
						}
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
				popup.show();
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_opt.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				PopupMenu popup = new PopupMenu(getApplicationContext(), _drawer_dr);
				Menu menu = popup.getMenu();
				menu.add("+  Create new business");
				popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){
					@Override
					public boolean onMenuItemClick(MenuItem item){
						switch (item.getTitle().toString()){
							case "+  Create new business":
							
							//
							break;}
						return true;
					}
				});
				popup.show();
			}
		});
	}
	
	private void initializeLogic() {
		getSupportActionBar().hide();
		n = "Marathon fashion".substring((int)(0), (int)(2));
		_drawer_naa.setText(n);
		_Shadow(0, 20, "#f55540", _drawer_bt);
		_Shadow(10, 20, "#FFFFFF", linear3);
		_Shadow(0, 10, "#000000", button2);
		_border(linear8, "#0d1c34", "2");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	public void _Shadow (final double _sadw, final double _cru, final String _wc, final View _widgets) {
		android.graphics.drawable.GradientDrawable wd = new android.graphics.drawable.GradientDrawable();
		wd.setColor(Color.parseColor(_wc));
		wd.setCornerRadius((int)_cru);
		_widgets.setElevation((int)_sadw);
		_widgets.setBackground(wd);
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