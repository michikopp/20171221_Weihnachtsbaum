package sabel.com.a20171221_weihnachtsbaum;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends Activity {

    private Button btn_paint;
    private TextView tv_hoehe, tv_zeichnung;
    private EditText et_eingabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_paint = findViewById(R.id.btn_paint);
        tv_hoehe = findViewById(R.id.tv_hoehe);
        et_eingabe = findViewById(R.id.et_eingabe);
        tv_zeichnung = findViewById(R.id.tv_zeichnung);

        btn_paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int eingabe = Integer.parseInt(et_eingabe.getText().toString());

                tv_zeichnung.setText(zeichnen(eingabe));
            }
        });


    }


    private String zeichnen(int eingabe) {

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < eingabe ; i++) {
            for (int j = 0; j <=i; j++) {
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }

        for (int i = 0; i < eingabe/2 ; i++) {
            stringBuilder.append("|\n");
        }

        return stringBuilder.toString();

    }
}
