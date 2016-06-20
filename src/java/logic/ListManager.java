/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.List;
import logic.Message;

/**
 *
 * @author gianlucamost
 */
public class ListManager {
    private static List<Message> messageList = new ArrayList<>();

    public ListManager() {}

    public static List<Message> getMessageList() {
        return messageList;
    }

    public static void setMessageList(List<Message> messageList) {
        ListManager.messageList = messageList;
    }
    
    public static void addToList(Message m){
        messageList.add(m);
    }
}
