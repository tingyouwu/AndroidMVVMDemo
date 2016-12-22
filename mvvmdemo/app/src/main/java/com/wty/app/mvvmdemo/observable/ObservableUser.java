package com.wty.app.mvvmdemo.observable;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wty.app.mvvmdemo.BR;

public class ObservableUser extends BaseObservable{
    private String firstName;
    private String lastName;
    private String displayName;
    private int age;

    public ObservableUser(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }

    public String getDisplayName() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isAdult(){
        return this.age>=18;
    }
}