package edu.neu.khoury.madsea.zidixia.data;

import androidx.lifecycle.LiveData;

import java.util.List;

public interface IToDoDataSource {

    void insert(ToDo todo);

    void deleteAll();

    LiveData<List<ToDo>> getTodos();

    LiveData<List<ToDo>> getNTodos(int n);
}
