package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.login.DbUtils.LocalDB;
import com.example.login.DbUtils.User;

public class signUp extends AppCompatActivity {
    EditText eUsername;
    EditText ePassword;
    EditText eConfirmPassword;
    Button submit;

    private final String CREDENTIAL_SHARED_PREF="our_shared_pref";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        eUsername=findViewById(R.id.editText);
        ePassword=findViewById(R.id.editTextTextPassword2);
        eConfirmPassword=findViewById(R.id.editTextTextPassword3);
        submit=findViewById(R.id.button3);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUserName=eUsername.getText().toString();
                String strPassword=ePassword.getText().toString();
                String strConfirmPassword=eConfirmPassword.getText().toString();

                if (strPassword!=null && strConfirmPassword!=null && strPassword.equalsIgnoreCase(strConfirmPassword)){
                  /*  SharedPreferences credentials=getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=credentials.edit();
                    editor.putString("Password",strPassword);
                    editor.putString("userName",strUserName);
                    editor.commit();*/

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            User user=new User();
                            User.setUsername(strUserName);
                            user.setPassword(strPassword);
                            LocalDB dbInstance=RoomImplementation.getmInstance().getDbInstance();
                            dbInstance.userDao().createUser(user);

                        }
                    }).start();

                    signUp.this.finish();
                }
            }
        });
    }
}