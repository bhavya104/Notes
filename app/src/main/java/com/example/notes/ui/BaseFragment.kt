package com.example.notes.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlin.coroutines.CoroutineContext

abstract class BaseFragment : Fragment(), CoroutineScope {

    private lateinit var job : Job


    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main  // Dispachers defines our threads where we want to execute the job...


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        job = Job()  // In this we create instance of job.
    }


    override fun onDestroy() {
        super.onDestroy()
        job.cancel()   // on destroy we cancel the job.
    }
}