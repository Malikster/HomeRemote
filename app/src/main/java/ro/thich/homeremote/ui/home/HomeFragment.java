package ro.thich.homeremote.ui.home;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceManager;

import com.google.android.material.snackbar.Snackbar;

import ro.thich.homeremote.R;
import ro.thich.homeremote.RequestTask;


@SuppressWarnings("WeakerAccess")
public class HomeFragment extends Fragment {

//    private HomeViewModel homeViewModel;

    private Boolean stare1 = false;
    private Boolean stare2 = false;
    private Boolean stare3 = false;
    private Boolean stare4 = false;
    private Boolean stare5 = false;
    private Boolean stare6 = false;
    private Boolean stare7 = false;
    private Boolean stare8 = false;
    private Boolean stare9 = false;

    private String urlSet;
    private Boolean devSet;
    private String urlAttr = "";

    private Context mContext;

    // Initialise it from onAttach()
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);*/
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        /*final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/

        SharedPreferences myPrefs = PreferenceManager.getDefaultSharedPreferences(mContext);
        urlSet = myPrefs.getString("lightAddress", "http://192.168.1.125:8080");
        devSet = myPrefs.getBoolean("toasts", true);


        final Button button1 = root.findViewById(R.id.button1);
        final Button button2 = root.findViewById(R.id.button2);
        final Button button3 = root.findViewById(R.id.button3);
        final Button button4 = root.findViewById(R.id.button4);
        final Button button5 = root.findViewById(R.id.button5);
        final Button button6 = root.findViewById(R.id.button6);
        final Button button7 = root.findViewById(R.id.button7);
        final Button button8 = root.findViewById(R.id.button8);
        final Button button9 = root.findViewById(R.id.button9);



        final Drawable iconSun = getResources().getDrawable(R.drawable.iconfinder_sun);
        final Drawable iconGlow = getResources().getDrawable(R.drawable.iconfinder_sun_glow);
        final Drawable icon1 = getResources().getDrawable(R.drawable.iconfinder_bathtub);
        final Drawable icon2 = getResources().getDrawable(R.drawable.iconfinder_furniture_living_room_home_house_offie);
        final Drawable icon3 = getResources().getDrawable(R.drawable.iconfinder_bed);
        final Drawable icon4 = getResources().getDrawable(R.drawable.iconfinder_couple);
        final Drawable icon5 = getResources().getDrawable(R.drawable.iconfinder_couple);
        final Drawable icon6 = getResources().getDrawable(R.drawable.iconfinder_triple_seat_sofa);
        final Drawable icon7 = getResources().getDrawable(R.drawable.iconfinder_coffee_cup);
        final Drawable icon8 = getResources().getDrawable(R.drawable.iconfinder_bed);
        final Drawable icon9 = getResources().getDrawable(R.drawable.iconfinder_bathtub);

        button1.setCompoundDrawablesRelativeWithIntrinsicBounds(icon1,null, iconSun,null);
        button2.setCompoundDrawablesRelativeWithIntrinsicBounds(icon2,null, iconSun,null);
        button3.setCompoundDrawablesRelativeWithIntrinsicBounds(icon3,null, iconSun,null);
        button4.setCompoundDrawablesRelativeWithIntrinsicBounds(icon4,null, iconSun,null);
        button5.setCompoundDrawablesRelativeWithIntrinsicBounds(icon5,null, iconSun,null);
        button6.setCompoundDrawablesRelativeWithIntrinsicBounds(icon6,null, iconSun,null);
        button7.setCompoundDrawablesRelativeWithIntrinsicBounds(icon7,null, iconSun,null);
        button8.setCompoundDrawablesRelativeWithIntrinsicBounds(icon8,null, iconSun,null);
        button9.setCompoundDrawablesRelativeWithIntrinsicBounds(icon9,null, iconSun,null);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare1 = !stare1;

                if (stare1) {
                    button1.setCompoundDrawablesRelativeWithIntrinsicBounds(icon1,null, iconGlow,null);
                } else {
                    button1.setCompoundDrawablesRelativeWithIntrinsicBounds(icon1,null, iconSun,null);
                }
                urlAttr = "/?led0";

                new RequestTask().execute(urlSet + urlAttr);
                if (devSet) {
                    //Toast.makeText(getActivity(), "Baia Mare - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();
                    Snackbar.make(v, "Baia Mare - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare2 = !stare2;

                if (stare2) {
                    button2.setCompoundDrawablesRelativeWithIntrinsicBounds(icon2,null, iconGlow,null);
                } else {
                    button2.setCompoundDrawablesRelativeWithIntrinsicBounds(icon2,null, iconSun,null);
                }
                urlAttr = "/?led2";
                new RequestTask().execute(urlSet + urlAttr);
                if (devSet)
                    //Toast.makeText(getActivity(), "Dressing - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();
                    Snackbar.make(v, "Dressing - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare3 = !stare3;

                if (stare3) {
                    button3.setCompoundDrawablesRelativeWithIntrinsicBounds(icon3,null, iconGlow,null);
                } else {
                    button3.setCompoundDrawablesRelativeWithIntrinsicBounds(icon3,null, iconSun,null);
                }
                urlAttr = "/?led3";
                new RequestTask().execute(urlSet + urlAttr);
                if (devSet)
                    Snackbar.make(v, "Dormitor Mare - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                //Toast.makeText(getActivity(), "Dormitor Mare - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare4 = !stare4;

                if (stare4) {
                    button4.setCompoundDrawablesRelativeWithIntrinsicBounds(icon4,null, iconGlow,null);
                } else {
                    button4.setCompoundDrawablesRelativeWithIntrinsicBounds(icon4,null, iconSun,null);
                }
                urlAttr = "/?led13&led14";
                new RequestTask().execute(urlSet + urlAttr);
                if (devSet)
                    Snackbar.make(v, "Hol Mare - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                //Toast.makeText(getActivity(), "Hol Mare - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare5 = !stare5;

                if (stare5) {
                    button5.setCompoundDrawablesRelativeWithIntrinsicBounds(icon5,null, iconGlow,null);
                } else {
                    button5.setCompoundDrawablesRelativeWithIntrinsicBounds(icon5,null, iconSun,null);
                }
                urlAttr = "/?led4";
                new RequestTask().execute(urlSet + urlAttr);
                if (devSet)
                    Snackbar.make(v, "Hol Mic - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                //Toast.makeText(getActivity(), "Hol Mic - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare6 = !stare6;

                if (stare6) {
                    button6.setCompoundDrawablesRelativeWithIntrinsicBounds(icon6,null, iconGlow,null);
                } else {
                    button6.setCompoundDrawablesRelativeWithIntrinsicBounds(icon6,null, iconSun,null);
                }
                urlAttr = "/?led8";
                new RequestTask().execute(urlSet + urlAttr);
                if (devSet)
                    Snackbar.make(v, "Living - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                //Toast.makeText(getActivity(), "Living - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare7 = !stare7;

                if (stare7) {
                    button7.setCompoundDrawablesRelativeWithIntrinsicBounds(icon7,null, iconGlow,null);
                } else {
                    button7.setCompoundDrawablesRelativeWithIntrinsicBounds(icon7,null, iconSun,null);
                }
                urlAttr = "/?led9";
                new RequestTask().execute(urlSet + urlAttr);
                if (devSet)
                    Snackbar.make(v, "Bucatarie - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                //Toast.makeText(getActivity(), "Bucatarie - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare8 = !stare8;

                if (stare8) {
                    //button8.setCompoundDrawablesRelative(icon,null, iconGlow,null);
                    button8.setCompoundDrawablesRelativeWithIntrinsicBounds(icon8,null,iconGlow,null);
                } else {
                    button8.setCompoundDrawablesRelativeWithIntrinsicBounds(icon8,null, iconSun,null);
                }
                urlAttr = "/?led10";
                new RequestTask().execute(urlSet + urlAttr);
                if (devSet)
                    Snackbar.make(v, "Camera Christina - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                //Toast.makeText(getActivity(), "Camera Christina - " + urlSet + urlAttr, Toast.LENGTH_SHORT).show();

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stare9 = !stare9;

                if (stare9) {
                    button9.setCompoundDrawablesRelativeWithIntrinsicBounds(icon9,null, iconGlow,null);
                } else {
                    button9.setCompoundDrawablesRelativeWithIntrinsicBounds(icon9,null, iconSun,null);
                }
                urlAttr = "/?led11";
                new RequestTask().execute(urlSet + urlAttr);
                if (devSet)
                    Snackbar.make(v, "Baie Christina - " + urlSet + urlAttr, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                //Toast.makeText(getActivity(), "Baie Christina - ", Toast.LENGTH_SHORT).show();

            }
        });

        return root;
    }
}
