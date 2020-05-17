package com.example.mycode;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mycode.formclass.User_form;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText emailAddress,name,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       emailAddress=findViewById(R.id.email);
        name=findViewById(R.id.editText);
        address=findViewById(R.id.editText3);

        Button submit=(Button)findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(!validateEmail(emailAddress.getText().toString().trim())|
                !validateName(name)|
                       !validateAddress(address)) {
                   Toast.makeText(MainActivity.this, "Form is not submitted", Toast.LENGTH_SHORT).show();
                   return;
               }
               User_form form=new User_form(emailAddress.getText().toString().trim(),name.getText().toString().trim(),address.getText().toString().trim());
                Toast.makeText(MainActivity.this, name.getText().toString().trim()+"\n"+emailAddress.getText().toString().trim()+"\n"+address.getText().toString().trim(), Toast.LENGTH_SHORT).show();

            }
        });

    }
    public boolean emailvalidationtest( final String emailInput)
    {
        final String regex1="^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
        Pattern pattern;
        Matcher matcher;
        pattern=Pattern.compile(regex1);
        if(emailInput.isEmpty())
        {
            return false;
        }
        matcher=pattern.matcher(emailInput);
        return matcher.matches();
    }
    private boolean validateEmail(String emailInput ){
        if(emailInput.isEmpty()){
            emailAddress.setError("Field can't be empty");
            return false ;
        }else if(!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            emailAddress.setError("Please enter valid email address");
            return false ;
        }
            else{
            emailAddress.setError(null);
            return true;
        }
    }
    private boolean validateName(EditText name){
        String nameInput=name.getText().toString();
        if(nameInput.isEmpty()){
            name.setError("Field can't be empty");
            return false;
        }
        else
        {
            name.setError(null);
            return true;
        }
    }
    private boolean validateAddress(EditText address){
        String addressInput=address.getText().toString();
        if(addressInput.isEmpty()){
            address.setError("Field can't be empty");
            return false;
        }
        else
        {
            address.setError(null);
            return true;
        }
    }

}

