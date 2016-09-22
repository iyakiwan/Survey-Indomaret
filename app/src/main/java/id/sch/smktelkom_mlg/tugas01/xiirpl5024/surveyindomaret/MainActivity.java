package id.sch.smktelkom_mlg.tugas01.xiirpl5024.surveyindomaret;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText etComent;
    CheckBox cb1, cb2, cb3;
    Spinner spIndomaret;
    Button bKirim;
    RadioGroup rgPuas;
    TextView tvHasil;
    String cbPilih;
    int Pilih = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Survey Indomaret");
        getSupportActionBar().setSubtitle("Indomaret Malang");

        etComent = (EditText) findViewById(R.id.editTextKS);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        rgPuas = (RadioGroup) findViewById(R.id.radioGroupPT);
        spIndomaret = (Spinner) findViewById(R.id.spinnerBrg);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        bKirim = (Button) findViewById(R.id.buttonKr);

        kondisiawal();

    }

    private void kondisiawal()
    {
        etComent.setText("");
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        rgPuas.clearCheck();
        spIndomaret.setSelection(2);
    }
}
