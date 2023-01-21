/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smallClasses;

/**
 *
 * @author anush
 */
public class House{
    String Apt_No, buildingName, Street, state, country;
    City city;
    int communityCode;
    

    public House(String Apt_No, String buildingName,String Street, int communityCode, City city, String state, String country) {
        //super(cityName, state, country, communityCode);
        this.Apt_No = Apt_No;
        this.buildingName = buildingName;
        this.Street = Street;
        this.communityCode = communityCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    
    

//    public String getAptNo() {
//        return Apt_No;
//    }
//
//    public void setAptNo(String Apt_No) {
//        this.Apt_No = Apt_No;
//    }
//
//    public String getBuildingName() {
//        return buildingName;
//    }
//
//    public void setBuildingName(String buildingName) {
//        this.buildingName = buildingName;
//    }
//
//    public String getStreet() {
//        return Street;
//    }
//
//    public void setStreet(String Street) {
//        this.Street = Street;
//    }
//
////    public int getCommunityCode() {
////        return communityCode;
////    }
////
////    public void setCommunityCode(int communityCode) {
////        this.communityCode = communityCode;
////    }
////
////    public String getCityName() {
////        return cityName;
////    }
////
////    public void setCityName(String cityName) {
////        this.cityName = cityName;
////    }

    public String getApt_No() {
        return Apt_No;
    }

    public void setApt_No(String Apt_No) {
        this.Apt_No = Apt_No;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getCommunityCode() {
        return communityCode;
    }

    public void setCommunityCode(int communityCode) {
        this.communityCode = communityCode;
    }
}
