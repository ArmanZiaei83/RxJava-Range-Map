package com.example.rxjava_just;

import androidx.lifecycle.ViewModel;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

public class MainViewModel extends ViewModel {

    public Observable<ToDo> getObservable(ToDo toDo) {

        Observable<ToDo> toDoObservable = Observable
                .range(0,9)
                .map(new Function<Integer, ToDo>() {
                    @Override
                    public ToDo apply(Integer integer) throws Throwable {
                        System.out.println("Observable : " + );
                        return null;
                    }
                })
    }
}
