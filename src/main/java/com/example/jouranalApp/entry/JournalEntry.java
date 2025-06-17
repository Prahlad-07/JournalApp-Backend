package com.example.jouranalApp.entry;

import org.springframework.web.bind.annotation.GetMapping;

public class JournalEntry {
    private  long id;
    private String title;
    private String content;
    public  long getId(){
        return  id;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    public void setId(){
        this.id=id;
    }
    public void setContent(){
        this.content=content;
    }
    public void setTitle(){
        this.title=title;
    }


}
