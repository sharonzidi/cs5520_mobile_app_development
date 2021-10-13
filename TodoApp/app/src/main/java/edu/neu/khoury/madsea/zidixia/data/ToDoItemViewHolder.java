package edu.neu.khoury.madsea.zidixia.data;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import edu.neu.khoury.madsea.zidixia.databinding.ToDoItemViewBinding;

public class ToDoItemViewHolder extends RecyclerView.ViewHolder {

    public ToDoItemViewBinding binding;
    public TextView titleTextView;

    public ToDoItemViewHolder(@NonNull ToDoItemViewBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }


    public void bind(ToDo toDo) {
        binding.setTodoDetail(toDo.getDescription());
        binding.setTodoTitle(toDo.getTitle());
        binding.setTodoTask(toDo);
        binding.executePendingBindings();
    }


}
