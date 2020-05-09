package com.example.mycode;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
               validateEmail(emailAddress);
                validateName(name);
                validateAddress(address);
            }
        });

    }
   private boolean validateEmail( EditText emailAddress){
        String emailInput=emailAddress.getText().toString().trim();

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
