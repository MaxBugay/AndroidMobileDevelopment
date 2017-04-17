package edu.temple.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button Save = (Button) findViewById(R.id.Save);
        final EditText Username = (EditText) findViewById(R.id.Username);
        final EditText Email = (EditText) findViewById(R.id.Email1);
        final EditText Pass = (EditText) findViewById(R.id.Pass);
        final EditText PassCon = (EditText) findViewById(R.id.PassCon);

        Save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String name = Username.getText().toString();
                    String emailadd = Email.getText().toString();
                    String Password = Pass.getText().toString();
                    String PasswordCon = PassCon.getText().toString();

                    if (name.equals("") || emailadd.equals("") || Password.equals("") || Password.equals("")) {
                        Toast.makeText(FormActivity.this, "Please fill in all of the form.", Toast.LENGTH_SHORT).show();
                    } else if (!(Password.equals(PasswordCon))) {
                        Toast.makeText(FormActivity.this, "The passwords do not match.", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(FormActivity.this, "Content saved.", Toast.LENGTH_SHORT).show();
                    }
                }


            });
        }



    }
