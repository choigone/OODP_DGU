package com.top;

import java.util.List;
import java.util.Stack;

//Item과 Map은 형태가 문제에 명시되지 않아 구현 보류
class Item{

}
class Map{

}

class Position{
    int x;
    int y;
}

class Information{
    private int HP;
    private int MP;
    private Position position;
    private Map map;
    private List<Item> items;

    public Memento creteMemento(){
        return new Memento();
    }

    public void restoreMemento(Memento memento){
        this.HP = memento.getHP();
        this.MP = memento.getMP();
        this.position = memento.getPosition();
        this.map = memento.getMap();
        this.items = memento.getItems();
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items.add(items);
    }
}

class Memento{
    private int HP;
    private int MP;
    private Position position;
    private Map map;
    private List<Item> items;

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public Position getPosition() {
        return position;
    }

    public Map getMap() {
        return map;
    }

    public List<Item> getItems() {
        return items;
    }
}

class careTaker{
    Stack<Memento> mementos = new Stack<>();
    public void push(Memento memento){
        mementos.push(memento);
    }
    public Memento pop(){
        return mementos.pop();
    }
}

public class mementoMain {

}
