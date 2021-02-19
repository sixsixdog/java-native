package com.cNative

import com.sun.jna.Library
import com.sun.jna.Native

/**
 * @Package: PACKAGE_NAME
 * @ClassName: cNative
 * @Author: Sixsixdog
 * @CreateTime: 2021-02-19 10:01
 * @Description:
 */

interface NativeLibrary : Library {
    fun fnNativeDLL(a:Int,b:Int):Int;
    companion object {
        private val dll: String = System.getProperty("user.dir")
        val LIBRARY = Native.loadLibrary("$dll\\src\\main\\resources\\NativeDLL.dll", NativeLibrary::class.java) as NativeLibrary
    }
}