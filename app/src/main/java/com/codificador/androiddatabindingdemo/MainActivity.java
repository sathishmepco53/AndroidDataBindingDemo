package com.codificador.androiddatabindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.codificador.androiddatabindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        User user = new User();
        user.setName("Sathish");
        user.setEmail("sathish@gmail.com");
        binding.setUser(user);
        binding.setActivity(this);
    }

    public void onButtonClick(String email){
        Toast.makeText(getApplicationContext(),binding.getUser().getEmail(),Toast.LENGTH_LONG).show();
    }
}
