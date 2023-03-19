package com.example.proj;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    TextView signup;
    Button signin;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.setTitle("login");

        signup = findViewById(R.id.signupbtn);
        email = findViewById(R.id.useremail);
        password = findViewById(R.id.userpassword);
        signin = findViewById(R.id.signinbtn);

        mAuth = FirebaseAuth.getInstance();



        signin.setOnClickListener(view -> {
            loginUser();
        });


        signup.setOnClickListener(view ->{
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }

    private void loginUser(){
        String em = email.getText().toString();
        String pw = password.getText().toString();

        if (TextUtils.isEmpty(em)){
            email.setError("Email cannot be empty");
            email.requestFocus();
        }
        else if (TextUtils.isEmpty(pw)){
            password.setError("Password cannot be empty");
            password.requestFocus();
        }
        else{
            mAuth.signInWithEmailAndPassword(em, pw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        Toast.makeText(LoginActivity.this, "User logged in successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    }else{
                        Toast.makeText(LoginActivity.this, "Log in Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

}