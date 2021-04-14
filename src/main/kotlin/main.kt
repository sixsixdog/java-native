
import com.cNative.NativeLibrary


fun main(args: Array<String>) {
    val dll = NativeLibrary.LIBRARY;
    println(dll.fnNativeDLL(51, 2))
}