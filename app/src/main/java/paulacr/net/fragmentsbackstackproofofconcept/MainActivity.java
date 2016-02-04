package paulacr.net.fragmentsbackstackproofofconcept;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private OnBackPressedListener listener;
    FragmentMain fragmentMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        Fragment fragmentMain = FragmentMain.newInstance();
        trocarFragment(fragmentMain);

        super.onResume();
    }

    private void trocarFragment(Fragment fragment) {

        listener = (OnBackPressedListener) fragment;

        getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        listener.doBack();
    }
}
