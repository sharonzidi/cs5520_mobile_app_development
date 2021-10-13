package edu.neu.khoury.madsea.zidixia.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ToDoDbDataSource implements IToDoDataSource{

    private ToDoDao mToDoDao;

    public ToDoDbDataSource(Application application) {
        ToDoRoomDatabase db = ToDoRoomDatabase.getDatabase(application);
        mToDoDao = db.ToDoDao();
    }

    @Override
    public void insert(ToDo todo) {
        ToDoRoomDatabase.databaseWriteExecutor.execute(() -> {
            mToDoDao.insert(todo);
        });
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public LiveData<List<ToDo>> getTodos() {
        return mToDoDao.getTodos();
    }

    @Override
    public LiveData<List<ToDo>> getNTodos(int n) {
        return mToDoDao.getNTodos(n);
    }

}