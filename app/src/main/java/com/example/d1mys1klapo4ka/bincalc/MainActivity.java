package com.example.d1mys1klapo4ka.bincalc;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText putText;
    private EditText inferenceText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        putText = (EditText)findViewById(R.id.et_put_text);
        inferenceText = (EditText)findViewById(R.id.et_inference_text);
    }



    private MyTransfer myTransfer;

    public void onClick(View view){

        myTransfer = new MyTransfer();

        int id = view.getId();

        switch (id){
//            case R.id.bt_ziro:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_one:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_twq:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_three:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_four:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_fife:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_six:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_seven:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_eight:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_nine:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_a:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_b:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_c:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_d:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_e:
//                putText.setText(R.string.ziro);
//                break;
//            case R.id.bt_f:
//                putText.setText(R.string.ziro);
//                break;
            case R.id.bt_delete:
                if (putText.getText().toString().length() == 0){
                    break;
                }

                putText.setText(putText.getText().delete(putText.getText().length()-1,
                        putText.getText().length()));
                break;
            case R.id.bt_clear:
                putText.setText("");
                break;
            case R.id.et_put_text:
                Toast.makeText(MainActivity.this,"put",Toast.LENGTH_SHORT).show();
                break;
            case R.id.et_inference_text:
                Toast.makeText(MainActivity.this,"inference",Toast.LENGTH_SHORT).show();
                break;
            default:
                putText.setText("" + putText.getText() +
                        view.getContentDescription().toString());
                break;
        }
    }
}
