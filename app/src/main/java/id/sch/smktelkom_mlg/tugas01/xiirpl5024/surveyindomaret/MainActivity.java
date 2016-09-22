package id.sch.smktelkom_mlg.tugas01.xiirpl5024.surveyindomaret;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener
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

        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);
        cb3.setOnCheckedChangeListener(this);

        kondisiawal();
        bKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proses();
            }
        });
    }
    private void kondisiawal()
    {
        etComent.setText("");
        cb1.setChecked(false);
        cb2.setChecked(false);
        cb3.setChecked(false);
        rgPuas.clearCheck();
        spIndomaret.setSelection(0);
    }
    private void proses()
    {
        if(isValid())
        {

        }
    }

    private boolean isValid()
    {
        boolean valid = true;

        String KoSan = etComent.getText().toString();

        if (KoSan.isEmpty())
        {
            etComent.setError("Anda belum mengisi komentar dan saran");
            valid =false;
        }
        else
        {
            etComent.setError(null);
        }
        return  valid;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean pilih) {
        if(pilih) Pilih+=1;
        else Pilih-=1;

        if(Pilih == 0 )
        {
            cbPilih = "Tidak mendapatkan";
        }
        else if(Pilih == 1 )
        {
            cbPilih = "Mendapatkan 1";
        }
        else if(Pilih == 2 )
        {
            cbPilih = "Mendapatkan 2";
        }
        else if(Pilih == 3 )
        {
            cbPilih = "Mendapatkan semua";
        }

    }
}
