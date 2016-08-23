/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author julian
 */
import java.util.Date;

public class Reloj implements Runnable {

    String dateToDisplay;

    private int hr;
    private Date d;
    private int hour;
    private int minute;
    private int second;
    String amPm = "AM";
    private Thread timer;

    public String getFormatedDate(Date d) {
        String formatedDate = " ";
        hour = d.getHours();
        minute = d.getMinutes();
        second = d.getSeconds();
        amPm = (hour < 12) ? "AM" : "PM";
        hr = (hour > 12) ? hour - 12 : hour;

        formatedDate = formatedDate.concat(padElement(hr, '0'));
        formatedDate = formatedDate.concat(":");
        formatedDate = formatedDate.concat(padElement(minute, '0'));
        formatedDate = formatedDate.concat(":");
        formatedDate = formatedDate.concat(padElement(second, '0'));
        return formatedDate;
    }

    private String padElement(int expr, char padChar) {
        String result = "";
        if (expr < 10) {
            result = result.concat(String.valueOf(padChar));
        }
        result = result.concat(String.valueOf(expr));
        return (result);
    }
    public void start(){
        if (timer==null){
            timer=new Thread(this);
            timer.start();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                timer.sleep(100);
            } catch (InterruptedException e) {
            }
            d = new Date();
            getFormatedDate(d);
        }
    }
}
