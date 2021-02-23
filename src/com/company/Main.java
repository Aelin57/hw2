package com.company;

import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkTempurature(17,18));
        System.out.println(checkTempurature(22,17));
        System.out.println(checkTempurature(25,15));
        System.out.println(checkTempurature(7,25));
        System.out.println(checkTempurature(35,11));

    }

    public static String checkTempurature(int age, int tempurature)
    {
        String result = "";
      if (age > 20 && age < 45) {
          if (tempurature > -20 && tempurature <= 30){
              result = "Можно идти гулять";
          }
      } else if (age < 20 && tempurature> 0 && tempurature <28 ){
          result = "Можно идти гулять";
      }
      else if (age > 45 && tempurature > -10 && tempurature < 25){
          result ="Можно идти гулять";

      }
      else {
          result = " Оставайтесь дома!! ";
      }
      return result;
    }

}
