package edu.neu.khoury.madsea.zidixia.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.work.WorkManager;

public class SharedViewModel extends AndroidViewModel {
    private final MutableLiveData<Task> selectedItem = new MutableLiveData<>();
    private boolean isEdit;

    public SharedViewModel(@NonNull Application application) {
        super(application);
    }

    public void selectItem(Task task) {
        selectedItem.setValue(task);
    }

    public LiveData<Task> getSelectedItem() {
        return selectedItem;
    }

    public void setIsEdit(boolean isEdit) {
        this.isEdit = isEdit;
    }

    public boolean getIsEdit() {
        return isEdit;
    }

    public void scheduleReminder(Task task) {
        WorkManager manager = WorkManager.getInstance(getApplication().getApplicationContext());
        // Use manager to schedule work
    }

}
