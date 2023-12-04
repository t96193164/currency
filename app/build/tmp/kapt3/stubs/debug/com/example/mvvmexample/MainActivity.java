package com.example.mvvmexample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.mvvmexample.viewmodels.MainViewModel;
import com.example.mvvmexample.viewmodels.MainViewModelFactory;
import com.example.mvvmexample.models.NicePlace;
import com.example.mvvmexample.adapters.RecyclerAdapter;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u000e\u001a\u00020\fJ\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/mvvmexample/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "but", "Landroid/widget/Button;", "mainrecycler", "Landroidx/recyclerview/widget/RecyclerView;", "viewManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "viewModel", "Lcom/example/mvvmexample/viewmodels/MainViewModel;", "addData", "", "initialiseAdapter", "observeData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.LinearLayoutManager viewManager;
    private com.example.mvvmexample.viewmodels.MainViewModel viewModel;
    private androidx.recyclerview.widget.RecyclerView mainrecycler;
    private android.widget.Button but;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initialiseAdapter() {
    }
    
    public final void observeData() {
    }
    
    public final void addData() {
    }
}