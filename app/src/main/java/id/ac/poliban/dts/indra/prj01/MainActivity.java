package id.ac.poliban.dts.indra.prj01;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.etNama);
        Hasil = (TextView) findViewById(R.id.tvSalam);

    }

    public void TampilNama(View view) {
        Hasil.setText("Nama Anda :" + etNama.getText());
    }


}

