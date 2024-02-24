package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class StudentQueue implements Observable {
    private final List<Observer> observerList;
    private final Queue<String> taskQueue;
    private final String name;

    public  StudentQueue(String name){
        observerList = new ArrayList<>();
        taskQueue = new ArrayDeque<>();
        this.name = name;
    }
    public void addTask(String task){
        taskQueue.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observerList){
            observer.update(this);
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public Queue<String> getTaskQueue() {
        return taskQueue;
    }

    public String getName() {
        return name;
    }
}
