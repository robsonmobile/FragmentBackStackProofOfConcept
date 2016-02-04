package paulacr.net.fragmentsbackstackproofofconcept;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by paularosa on 2/3/16.
 */
public class FragmentMain extends Fragment implements OnBackPressedListener {

    public static FragmentMain newInstance() {
        FragmentMain fragmentMain = new FragmentMain();
        return fragmentMain;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main_layout, container, false);
    }

    @Override
    public void doBack() {
        Log.i("Log fragment", "Back pressed");
    }
}
