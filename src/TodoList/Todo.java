package TodoList;

import java.util.ArrayList;
import java.util.Date;

public class Todo {
    private String createur;
    private String description;
    private String dateExecution;
    private String status;
    private Boolean resolution;
    private ArrayList list;

    public Todo() {

    }

    public void creerTache(String createur, String description, String dateExecution, String status, Boolean resolution){
        this.createur = createur;
        this.description = description;
        this.dateExecution = dateExecution;
        this.status = status;
        this.resolution = resolution;
        list = new ArrayList();
        list.add(createur);
        list.add(description);
        list.add(dateExecution);
        list.add(status);
        list.add(resolution);
    }

    public void annulerTache(){
        list.clear();
    }

    public void replannifierTache(String newDate){
        list.set(list.indexOf(dateExecution),newDate);
    }

    public String getCreateur() {
        return createur;
    }

    public void setCreateur(String createur) {
        this.createur = createur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateExecution() {
        return dateExecution;
    }

    public void setDateExecution(String dateExecution) {
        this.dateExecution = dateExecution;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getResolution() {
        return resolution;
    }

    public void setResolution(Boolean resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Todo list : " + list;
    }



}
