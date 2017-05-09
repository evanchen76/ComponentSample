package evan.chen.app.componentsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NumberSelect numberSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.numberSelect = (NumberSelect)this.findViewById(R.id.number_select);
        //this.numberSelect.setMaxValue(99);

        this.numberSelect.setListener(new NumberSelect.NumberSelectListener() {

            @Override
            public void onValueChange(int value) {
                Log.d("onValueChange", String.valueOf(value));
            }
        });
    }
}
