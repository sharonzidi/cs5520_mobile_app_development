package edu.neu.khoury.madsea.zidixia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import edu.neu.khoury.madsea.zidixia.data.ToDoItemRecyclerViewAdapter;
import edu.neu.khoury.madsea.zidixia.databinding.ActivityMainListViewBinding;

public class MainActivity_ListView extends AppCompatActivity {
    private ToDoViewModel mTodoViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // This is what we would do if we weren't using the ViewBinding (as we see below)
//        setContentView(R.layout.activity_main_list_view);
        // Get a new or existing ViewModel from the ViewModelProvider.
        ToDoViewModel mToDoViewModel = new ViewModelProvider(this).get(ToDoViewModel.class);

        // Use the ViewBinding instead of the layout directly
        ActivityMainListViewBinding binding = ActivityMainListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.recyclerViewMain.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerViewMain.scrollToPosition(0);

        final ToDoItemRecyclerViewAdapter adapter =
                new ToDoItemRecyclerViewAdapter(new ToDoItemRecyclerViewAdapter.TodoDiff());

        mToDoViewModel.getAllToDos().observe(this, todos -> {
            adapter.submitList(todos);
        });

        binding.recyclerViewMain.setAdapter(adapter);


        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_ListView.this, NewToDoActivity.class);
                startActivity(intent);
            }
        });

    }
}
