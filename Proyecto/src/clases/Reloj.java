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
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

import javax.swing.JLabel;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Reloj extends Thread {

    Thread timer = null;

    String dateToDisplay;

    int hr;
    Date d;
    int hour;
    int minute;
    int second;
    String amPm = "AM";

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
        formatedDate = formatedDate.concat(" " + amPm);
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

    @Override
    public void run() {
        while (timer != null) {
            try {
                timer.sleep(100);
            } catch (InterruptedException e) {
            }
            d = new Date();
            dateToDisplay = getFormatedDate(d);
        }
        timer = null;
    }
}
