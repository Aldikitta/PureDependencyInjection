package com.aldikitta.puredependencyinjection

import android.util.Log

class SIMCard(private  val serviceProvider: ServiceProvider) {


    init {
        Log.i("MYTAG","SIM Card Constructed")
    }

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}