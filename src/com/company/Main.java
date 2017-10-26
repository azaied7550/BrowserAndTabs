package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Browser> browserArrayList = new ArrayList<>();

        Browser newBrowser = new Browser();
        Scanner keyboard = new Scanner(System.in);
        String userBrowserInput="";
        Tab newTab;
        String userAnswer;

        System.out.println("Enter browser title: ");
        userBrowserInput = keyboard.nextLine();

        if (userBrowserInput.equalsIgnoreCase("Internet Explorer")){
            System.out.println("Enter a different browser");
        }
        else{
            newBrowser.setBrowserTitle(userBrowserInput);
            do{
                newTab = new Tab();
                System.out.println("Enter tab title: ");
                newTab.setTitle(keyboard.nextLine());
                System.out.println("Enter url:  ");
                newTab.setUrl(keyboard.nextLine());
                System.out.println("Enter another tab? (Y/N) ");
                userAnswer= keyboard.nextLine();

                newBrowser.getTabArrayList().add(newTab);
                browserArrayList.add(newBrowser);


            }while (userAnswer.equalsIgnoreCase("y"));
                int count=1;

                System.out.println("Browser Name: "+newBrowser.getBrowserTitle());
                for (Tab eachTab: newBrowser.getTabArrayList()){
                    System.out.println("Tab "+count+": " + eachTab.getTitle());
                    System.out.println("url "+count+": "+ eachTab.getUrl());
                    System.out.println();
                    count++;
                }
        }
    }
}
