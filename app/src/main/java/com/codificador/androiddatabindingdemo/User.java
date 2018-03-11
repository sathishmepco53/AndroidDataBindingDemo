package com.codificador.androiddatabindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Seng on 11/7/2017.
 */

public class User extends BaseObservable{
    private String name;
    private String email;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.codificador.androiddatabindingdemo.BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        //notifyPropertyChanged(com.learn2crack.databinding.BR.email);
        notifyPropertyChanged(com.codificador.androiddatabindingdemo.BR.email);
    }
}
