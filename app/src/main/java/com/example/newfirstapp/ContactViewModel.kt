package com.example.newfirstapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.newfirstapp.database.DatabaseDAO
import com.example.newfirstapp.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}
