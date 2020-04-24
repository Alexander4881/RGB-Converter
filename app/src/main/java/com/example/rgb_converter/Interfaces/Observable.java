package com.example.rgb_converter.Interfaces;

public interface Observable<T> {
   void addObserver(Observer obs);
   void removeObserver(Observer obs);
   void notifyObservers(T t);
}
