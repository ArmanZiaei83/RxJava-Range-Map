package com.example.rxjava_just;

import androidx.lifecycle.ViewModel;

import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainViewModel extends ViewModel {

    public void getObservable(ToDo toDo) {

        Observable<ToDo> toDoObservable = Observable
                .range(0,9)
                .map(new Function<Integer, ToDo>() {
                    @Override
                    public ToDo apply(Integer integer) throws Throwable {

                        System.out.println("Observable : " + String.valueOf(integer));
                        System.out.println("toDo Name : " + toDo.getName());
                        return null;
                    }
                }).observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread());

        toDoObservable.subscribe(new Observer<ToDo>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("!!Subscribed!!");
            }

            @Override
            public void onNext(@NonNull ToDo toDo) {
                System.out.println("OnNext : " + toDo.getName());
            }

            @Override
            public void onError(@NonNull Throwable e) {
                System.out.println("Error : " + e.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("Completed . . .");
            }
        });
    }
}
