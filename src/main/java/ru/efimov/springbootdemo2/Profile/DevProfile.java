package ru.efimov.springbootdemo2.Profile;


public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}