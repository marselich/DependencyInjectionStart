package com.example.dependencyinjectionstart.example2.data.datasource

import android.util.Log
import javax.inject.Inject

class ExampleTestRemoteDataSourceImpl @Inject constructor()
    : ExampleRemoteDataSource {
    override fun method() {
        Log.d("test", "test")
    }
}