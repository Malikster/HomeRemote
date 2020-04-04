package ro.thich.homeremote.ui.settings;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import ro.thich.homeremote.R;


@SuppressWarnings("WeakerAccess")
public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // Load the preferences from an XML resource
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
