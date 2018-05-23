package com.example.vaibhavmitaliitian.evcards;

import android.support.annotation.NonNull;

import androidx.work.Data;
import androidx.work.Worker;

public class DataUploadWorker extends Worker {
    @NonNull
    @Override
    public WorkerResult doWork() {
        Data data = getInputData();
        return null;
    }
}
