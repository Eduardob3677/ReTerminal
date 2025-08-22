package com.rk.libcommons

import android.content.Context
import java.io.File
import com.rk.terminal.BuildConfig

private fun getFilesDir(): File{
    return if (application == null){
        if (BuildConfig.DEBUG){
            File("/data/data/com.rk.terminal.debug/files")
        }else{
            File("/data/data/com.rk.terminal/files")
        }
    }else{
        application!!.filesDir
    }
}

fun localDir(): File {
    return File(getFilesDir().parentFile, "local").also {
        if (!it.exists()) {
            it.mkdirs()
        }
    }
}

fun ubuntuDir(): File{
    return localDir().child("ubuntu").also {
        if (!it.exists()) {
            it.mkdirs()
        }
    }
}

fun ubuntuHomeDir(): File{
    return ubuntuDir().child("root").also {
        if (!it.exists()) {
            it.mkdirs()
        }
    }
}

fun localBinDir(): File {
    return localDir().child("bin").also {
        if (!it.exists()) {
            it.mkdirs()
        }
    }
}

fun localLibDir(): File {
    return localDir().child("lib").also {
        if (!it.exists()) {
            it.mkdirs()
        }
    }
}

fun File.child(fileName:String):File {
    return File(this,fileName)
}

fun File.createFileIfNot():File{
    if (exists().not()){
        createNewFile()
    }
    return this
}