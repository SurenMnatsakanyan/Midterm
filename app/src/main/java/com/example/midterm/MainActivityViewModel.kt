package com.example.midterm

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.midterm.data.Person
import com.example.midterm.data.networking.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel(
    private val repository: Repository = Repository(),
) : ViewModel() {
    private val _people: MutableSharedFlow<List<Person>> = MutableSharedFlow()
    val people: SharedFlow<List<Person>>
        get() = _people

    fun loadPeople() {
        viewModelScope.launch {
            val people = repository.getPeople().results
            Log.d(
                "People",
                people.toString(),
            )
            withContext(Dispatchers.Main) {
                _people.emit(people)
            }
        }
    }
}
