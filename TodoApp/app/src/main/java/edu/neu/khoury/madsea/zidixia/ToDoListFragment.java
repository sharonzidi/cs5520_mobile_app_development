package edu.neu.khoury.madsea.zidixia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.snackbar.Snackbar;

import edu.neu.khoury.madsea.zidixia.data.ToDo;
import edu.neu.khoury.madsea.zidixia.data.ToDoItemRepository;
import edu.neu.khoury.madsea.zidixia.databinding.FragmentToDoListBinding;
import edu.neu.khoury.madsea.zidixia.databinding.ToDoItemViewBinding;

/**
 *  This Fragment displays a list of Todos, inflating a CustomUI component and adding it to a
 *  LinearLayout. It's fine, and shows one approach, but isn't super efficient and is a little clunky.
 *
 */
public class ToDoListFragment extends Fragment {

    private FragmentToDoListBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentToDoListBinding.inflate(inflater, container, false);

        // TODO(ahs): The getSingleton(null) is a hack. Since this is a demo Fragment, I'm letting it stay.
        for (ToDo todo : ToDoItemRepository.getSingleton(null)) {
            ToDoItemViewBinding todoBinding = ToDoItemViewBinding.inflate(inflater, binding.todoItemsLayout, true);
            todoBinding.setTodoTask(todo);

            (todoBinding.titleTextView).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Snackbar.make(view, todo.getTitle(), Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            });
        }
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
