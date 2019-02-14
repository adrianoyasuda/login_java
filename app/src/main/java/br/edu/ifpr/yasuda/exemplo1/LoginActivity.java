package br.edu.ifpr.yasuda.exemplo1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button logar = findViewById(R.id.bt_login);



        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText login = findViewById(R.id.tf_login);
                EditText senha = findViewById(R.id.pf_senha);

                if(login.getText().toString().equals("Admin") && senha.getText().toString().equals("123")){
                    Intent it = new Intent(LoginActivity.this, LogadoActivity.class);
                    startActivity(it);
                }
            }
        });
    }


}
