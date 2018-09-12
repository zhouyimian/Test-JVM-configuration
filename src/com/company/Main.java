package com.company;

public class Main {

    //设置-XX:+PrintGCDetails参数打印日志，告诉虚拟机在发生垃圾收集行为时打印内存参数，
    // 并在进程退出时输出当前的内存各区域分配情况
    public static void main(String[] args) {
        System.out.println("hello world");
    }
//打印结果如下
//    Heap
//    PSYoungGen      total 38400K, used 3999K [0x00000000d5e00000, 0x00000000d8880000, 0x0000000100000000)
//    eden space 33280K, 12% used [0x00000000d5e00000,0x00000000d61e7f70,0x00000000d7e80000)
//    from space 5120K, 0% used [0x00000000d8380000,0x00000000d8380000,0x00000000d8880000)
//    to   space 5120K, 0% used [0x00000000d7e80000,0x00000000d7e80000,0x00000000d8380000)
//    ParOldGen       total 87552K, used 0K [0x0000000081a00000, 0x0000000086f80000, 0x00000000d5e00000)
//    object space 87552K, 0% used [0x0000000081a00000,0x0000000081a00000,0x0000000086f80000)
//    Metaspace       used 3487K, capacity 4496K, committed 4864K, reserved 1056768K
//    class space    used 383K, capacity 388K, committed 512K, reserved 1048576K
//    从上面可以看到，年轻代和老年代的内存之比约等于1:2 eden区与from和to区的内存比大约是6:1
//    emm 和书上讲的8:1有点不太一样。
}
