package na.quizapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
    Register.OnFragmentInteractionListener,
    Login.OnFragmentInteractionListener,
    HomeFragment.OnFragmentInteractionListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            if (findViewById(R.id.main_fragment) != null) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.main_fragment, new Login())
                        .commit();
            }
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
